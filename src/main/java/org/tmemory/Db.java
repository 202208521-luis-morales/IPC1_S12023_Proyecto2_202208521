package org.tmemory;

import java.util.ArrayList;
import org.models.Category;
import org.models.Image;
import org.models.User;

public class Db {
    private ArrayList<User> dbUsers = new ArrayList<>();
    private ArrayList<Category> dbCategories = new ArrayList<>();
    private ArrayList<Image> dbImages = new ArrayList<>();
    private User userSession;
    private static Db db;
    
    private Db(){}
    
    public static Db getInstance() {
        if(db == null) {
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
    
    public Category getDbCategoryByName(String name) {
        Category foundedCategory = null;
        
        for(Category ctg: db.dbCategories) {
            if(name.equals(ctg.getName())) {
                foundedCategory = ctg;
            }
        }
        
        return foundedCategory;
    }
    
    public ArrayList<Image> getDbImages() {
        return dbImages;
    }
    
    public int signUp(String name) {
        int message = -1;
        
        // Método: chequea si el usuario ya existe
        boolean userExists = false;
        for(User user: dbUsers) {
            if(user.getUsername().equals(name)) {
                userExists = true;
            }
        }
        
        if(!userExists) {
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
        for(User user: dbUsers) {
            if(user.getUsername().equals(name)) {
                userExists = true;
                userSession = user;
            }
        }
        
        if(userExists) {
            message = 0;
        } else {
            message = 1;
        }
        
        return message;
    }
    
    public void signOut() {
        if(userSession != null) userSession = null;
    }
    
    public int addCategory(String name, User user) {
        int message = -1;
        if(checkUserExists(user)) {
            if(!checkCategoryExistsByName(name)) {
                db.dbCategories.add(new Category(name, user));
                message = 0;
            } else {
                message = 1;
            }
        }
        
        return message;
    }
    
    public int deleteCategory(String name) {
        db.getDbCategories().remove(db.getDbCategoryByName(name));
        
        return 0;
    }
    
    public boolean checkUserExists(User user) {
        boolean userExists = false;
        
        for(User usr: db.dbUsers) {
            if(usr == user) {
                userExists = true;
            }
        }
        
        return userExists;
    }
    
    public boolean checkCategoryExistsByName(String name) {
        boolean categoryExists = false;
        
        for(Category ctg: db.dbCategories) {
            if(name.equals(ctg.getName())) {
                categoryExists = true;
            }
        }
        
        return categoryExists;
    }
}
