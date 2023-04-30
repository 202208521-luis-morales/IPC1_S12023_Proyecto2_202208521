package org.tmemory;

import java.io.File;
import java.util.ArrayList;
import org.models.Category;
import org.models.ImageM;
import org.models.User;

public class Db {

    private ArrayList<User> dbUsers = new ArrayList<>();
    private ArrayList<Category> dbCategories = new ArrayList<>();
    private ArrayList<ImageM> dbImages = new ArrayList<>();
    private User userSession;
    private static Db db;

    private Db() {
    }

    public static Db getInstance() {
        if (db == null) {
            db = new Db();

            db.dbUsers.add(new User("a"));
        }

        return db;
    }

    public ArrayList<User> getDbUsers() {
        return dbUsers;
    }

    public ArrayList<Category> getDbCategories() {
        return dbCategories;
    }

    public Category getDbCategoryByNameAndUser(String name, User user) {
        Category foundedCategory = null;

        for (Category ctg : db.dbCategories) {
            if (name.equals(ctg.getName()) && user == ctg.getUser()) {
                foundedCategory = ctg;
            }
        }

        return foundedCategory;
    }

    public ArrayList<Category> getDbCategoriesByUser(User user) {
        ArrayList<Category> ctgsUser = new ArrayList<>();

        for (Category ctg : dbCategories) {
            if (ctg.getUser() == user) {
                ctgsUser.add(ctg);
            }
        }

        return ctgsUser;
    }

    public ArrayList<ImageM> getDbImages() {
        return dbImages;
    }

    public ArrayList<ImageM> getDbImagesByUser(User user) {
        ArrayList<ImageM> imgsUser = new ArrayList<>();

        for (ImageM img : dbImages) {
            if (img.getCategory().getUser() == user) {
                imgsUser.add(img);
            }
        }

        return imgsUser;
    }
    
    public ImageM getDbImageByNameAndUser(String name, User user) {
        ImageM foundedImage = null;

        for (ImageM img : db.dbImages) {
            if (name.equals(img.getName()) && img.getCategory().getUser() == user) {
                foundedImage = img;
            }
        }

        return foundedImage;
    }

    public ArrayList<ImageM> getDbImagesByUserAndCategory(User user, Category category) {
        ArrayList<ImageM> imgsUsCt = new ArrayList<>();

        for (ImageM img : dbImages) {
            if (img.getCategory().getUser() == user && img.getCategory() == category) {
                imgsUsCt.add(img);
            }
        }

        return imgsUsCt;
    }

    public int signUp(String name) {
        int message = -1;

        // Método: chequea si el usuario ya existe
        boolean userExists = false;
        for (User user : dbUsers) {
            if (user.getUsername().equals(name)) {
                userExists = true;
            }
        }

        if (!userExists) {
            dbUsers.add(new User(name));
            message = 0;
        } else {
            message = 1;
        }

        return message;
    }

    public User getUserSession() {
        return userSession;
    }

    public int logIn(String name) {
        int message = -1;

        boolean userExists = false;
        for (User user : dbUsers) {
            if (user.getUsername().equals(name)) {
                userExists = true;
                userSession = user;
            }
        }

        if (userExists) {
            message = 0;
        } else {
            message = 1;
        }

        return message;
    }

    public void signOut() {
        if (userSession != null) {
            userSession = null;
        }
    }

    public int addCategory(String name, User user) {
        int message = -1;
        if (checkUserExists(user)) {
            if (!checkCategoryExistsByNameAndUser(name, user)) {
                db.dbCategories.add(new Category(name, user));
                message = 0;
            } else {
                message = 1;
            }
        }

        return message;
    }

    public int addImage(String route, String name, Category category) {
        db.dbImages.add(new ImageM(route, name, category));

        return 0;
    }

    public int deleteCategory(Category category) {
        db.getDbCategories().remove(category);
        
        for(ImageM img: dbImages) {
            if(category == img.getCategory()) {
                deleteImage(img);
            }
        }

        return 0;
    }
    
    public int deleteImage(ImageM image) {
        File img = new File(image.getRoute());
        Integer message = -1;
        
        if(img.exists()) {
            db.getDbImages().remove(image);
            img.delete();
            message = 0;
        } else {
            throw new Error("La imagen a borrar no existe");
        }
        
        return 0; //message;
    }

    public boolean checkUserExists(User user) {
        boolean userExists = false;

        for (User usr : db.dbUsers) {
            if (usr == user) {
                userExists = true;
            }
        }

        return userExists;
    }

    public boolean checkCategoryExistsByNameAndUser(String name, User user) {
        boolean categoryExists = false;

        for (Category ctg : db.dbCategories) {
            if (name.equals(ctg.getName()) && user == ctg.getUser()) {
                categoryExists = true;
            }
        }

        return categoryExists;
    }
    
    public void printDbImages() {
        System.out.println("\n");
        System.out.println("######################");
        System.out.println("## IMAGES");
        System.out.println("######################");
        
        for (int i = 0; i < dbImages.size(); i++) {
            ImageM img = dbImages.get(i);
            System.out.println("%");
            System.out.println("[" + i + "]");
            System.out.println("ID: " + img.getId());
            System.out.println("CATEGORY: " + img.getCategory());
            System.out.println("NAME: " + img.getName());
            System.out.println("ROUTE: " + img.getRoute());
            System.out.println("%");
        }
        System.out.println("######################");
        System.out.println("\n");
    }
}
