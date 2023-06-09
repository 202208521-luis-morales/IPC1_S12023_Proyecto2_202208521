/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.views;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.nio.file.Files;
import javax.swing.ImageIcon;
import org.models.Category;
import org.models.ImageM;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.DefaultComboBoxModel;
import org.tmemory.Db;

/**
 *
 * @author DELL
 */
public class LibraryView extends javax.swing.JFrame {

    private Db db = Db.getInstance();

    /**
     * Creates new form LibraryView
     */
    public LibraryView() {
        initComponents();
        this.setLocationRelativeTo(null);
        hydrateCategoryComboBox();
        hydrateImageComboBox();
        currentUserLabel.setText(db.getUserSession().getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        nextImageRightButton = new javax.swing.JButton();
        nextImageLeftButton = new javax.swing.JButton();
        addCategoryButton = new javax.swing.JButton();
        removeCategoryButton = new javax.swing.JButton();
        addImageButton = new javax.swing.JButton();
        deleteImageButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        goBackToMenuButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        categoryComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        imageCountLabel = new javax.swing.JLabel();
        currentUserLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imageComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        imageComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Categoría");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );

        nextImageRightButton.setText(">");
        nextImageRightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextImageRightButtonActionPerformed(evt);
            }
        });

        nextImageLeftButton.setText("<");
        nextImageLeftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextImageLeftButtonActionPerformed(evt);
            }
        });

        addCategoryButton.setText("Agregar Categoría");
        addCategoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategoryButtonActionPerformed(evt);
            }
        });

        removeCategoryButton.setText("Eliminar Categoría");
        removeCategoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCategoryButtonActionPerformed(evt);
            }
        });

        addImageButton.setText("Agregar Imagen");
        addImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImageButtonActionPerformed(evt);
            }
        });

        deleteImageButton.setText("Eliminar Imagen");
        deleteImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteImageButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Usuario:");

        goBackToMenuButton.setText("Regresar al menú");
        goBackToMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackToMenuButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 22)); // NOI18N
        jLabel3.setText("Biblioteca");

        categoryComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoryComboBoxItemStateChanged(evt);
            }
        });
        categoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Imágenes guardadas:");

        imageCountLabel.setText("0");

        currentUserLabel.setText("user123");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addCategoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeCategoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(categoryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(addImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(deleteImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(241, 241, 241))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(187, 187, 187)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(currentUserLabel))
                                    .addComponent(goBackToMenuButton))
                                .addGap(37, 37, 37))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(nextImageLeftButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imageCountLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(imageComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextImageRightButton)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(currentUserLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(goBackToMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(addCategoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeCategoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(268, 268, 268))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(imageCountLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(nextImageRightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(imageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(nextImageLeftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(131, 131, 131)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(deleteImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(29, 29, 29))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextImageRightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextImageRightButtonActionPerformed
        nextImageButtons("right");
    }//GEN-LAST:event_nextImageRightButtonActionPerformed

    private void nextImageLeftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextImageLeftButtonActionPerformed
        nextImageButtons("left");
    }//GEN-LAST:event_nextImageLeftButtonActionPerformed

    private void goBackToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackToMenuButtonActionPerformed
        db.signOut();
        MenuView mv = new MenuView();
        mv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackToMenuButtonActionPerformed

    private void addCategoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategoryButtonActionPerformed
        boolean isValidCategory = false;
        String categoryEnt = null;

        while (!isValidCategory) {
            categoryEnt = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre de la categoría");

            if (categoryEnt == null) {
                isValidCategory = true;
            } else if (categoryEnt.trim().isEmpty()) {
                // El usuario no ingresó ningún texto o solo espacios en blanco
                JOptionPane.showMessageDialog(null, "Debe ingresar el nombre de la categoría");
            } else {
                int result = db.addCategory(categoryEnt, db.getUserSession());
                if (result == 0) {
                    JOptionPane.showMessageDialog(null, "Categoría agregada con éxito");
                    isValidCategory = true;
                    hydrateCategoryComboBox();
                } else {
                    JOptionPane.showMessageDialog(null, "Error: La categoría ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_addCategoryButtonActionPerformed

    private void removeCategoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCategoryButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere eliminar \n la categoría seleccionada en el ComboBox");
        if (response == JOptionPane.YES_OPTION) {
            db.deleteCategory(db.getDbCategoryByNameAndUser((String) categoryComboBox.getSelectedItem(), db.getUserSession()));
            JOptionPane.showMessageDialog(null, "Categoría eliminada con éxito");
            hydrateCategoryComboBox();
        }
    }//GEN-LAST:event_removeCategoryButtonActionPerformed

    private void imageComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageComboBoxActionPerformed
        paintImage();
    }//GEN-LAST:event_imageComboBoxActionPerformed

    private void addImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImageButtonActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new FileNameExtensionFilter("JPG, JPEG", "jpg", "jpeg"));

        int respuesta = jfc.showOpenDialog(this);

        if (respuesta == JFileChooser.APPROVE_OPTION) {
            ClassLoader classLoader = getClass().getClassLoader();
            String rutaArchivo = classLoader.getResource(getClass().getName().replace('.', '/') + ".class").getFile();
            File archivoActual = new File(rutaArchivo);
            File carpetaAnterior = archivoActual.getParentFile().getParentFile();

            if (carpetaAnterior != null && carpetaAnterior.isDirectory()) {
                String rutaCarpetaAnterior = carpetaAnterior.getAbsolutePath() + "\\images\\";
                File selectedFile = jfc.getSelectedFile();
                String nombreArchivoOriginal = selectedFile.getName();
                String extension = nombreArchivoOriginal.substring(nombreArchivoOriginal.lastIndexOf("."));
                // String filePath = selectedFile.getAbsolutePath();
                String nameToSave = UUID.randomUUID().toString() + extension;
                String filePath = rutaCarpetaAnterior + nameToSave;

                try {
                    File destinationFile = new File(filePath);
                    Files.copy(selectedFile.toPath(), destinationFile.toPath());
                    db.addImage(filePath, nameToSave, db.getDbCategoryByNameAndUser((String) categoryComboBox.getSelectedItem(), db.getUserSession()));
                    JOptionPane.showMessageDialog(null, "Imagen agregada a categoría con éxito con éxito");
                    hydrateImageComboBox();
                    /*
                ImageIcon imageIcon = new ImageIcon(filePath);
                Image image = imageIcon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
                     */
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println("No se pudo obtener la carpeta anterior.");
            }

        }
    }//GEN-LAST:event_addImageButtonActionPerformed

    private void deleteImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteImageButtonActionPerformed
        String itemOnCB = (String) imageComboBox.getSelectedItem();

        int response = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere eliminar \n la imagen seleccionada en el ComboBox");
        if (response == JOptionPane.YES_OPTION) {
            db.deleteImage(db.getDbImageByNameAndUser((String) imageComboBox.getSelectedItem(), db.getUserSession()));
            JOptionPane.showMessageDialog(null, "Imagen eliminada con éxito");
            hydrateImageComboBox();
        }
    }//GEN-LAST:event_deleteImageButtonActionPerformed

    private void categoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryComboBoxActionPerformed
        hydrateImageComboBox();
    }//GEN-LAST:event_categoryComboBoxActionPerformed

    private void categoryComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryComboBoxItemStateChanged

    }//GEN-LAST:event_categoryComboBoxItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LibraryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryView().setVisible(true);
            }
        });
    }

    private void hydrateCategoryComboBox() {
        categoryComboBox.removeAllItems();

        if (db.getDbCategories().isEmpty()) {
            categoryComboBox.addItem("No hay categorías");
            categoryComboBox.setEnabled(false);
            addImageButton.setEnabled(false);
        } else {
            categoryComboBox.setEnabled(true);
            for (Category ctg : db.getDbCategories()) {
                categoryComboBox.addItem(ctg.getName());
            }

            addImageButton.setEnabled(true);
        }
    }

    private void hydrateImageComboBox() {
        if (categoryComboBox.getSelectedItem() != null) {
            imageComboBox.removeAllItems();

            if (db.getDbImagesByUserAndCategory(db.getUserSession(), db.getDbCategoryByNameAndUser((String) categoryComboBox.getSelectedItem(), db.getUserSession())).isEmpty()) {
                imageComboBox.addItem("No hay imágenes");
                imageComboBox.setEnabled(false);
                deleteImageButton.setEnabled(false);
            } else {
                imageComboBox.setEnabled(true);
                for (ImageM img : db.getDbImagesByUserAndCategory(db.getUserSession(), db.getDbCategoryByNameAndUser((String) categoryComboBox.getSelectedItem(), db.getUserSession()))) {
                    imageComboBox.addItem(img.getName());
                }
                deleteImageButton.setEnabled(true);
            }

            imageCountLabel.setText(Integer.toString(db.getDbImagesByUserAndCategory(db.getUserSession(), db.getDbCategoryByNameAndUser((String) categoryComboBox.getSelectedItem(), db.getUserSession())).size()));
        }
        
    }

    private void paintImage() {
        String selectedImage = (String) imageComboBox.getSelectedItem();
        if (!"No hay imágenes".equals(selectedImage) && selectedImage != null) {
            File imageToSet = new File(db.getDbImageByNameAndUser(selectedImage, db.getUserSession()).getRoute());
            ImageIcon imageIcon = new ImageIcon(imageToSet.getPath());
            Image image = imageIcon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(image));
        } else {
            imageLabel.setIcon(null);
        }
    }
    
    private void nextImageButtons(String direction) {
        if (!"No hay imágenes".equals((String) imageComboBox.getSelectedItem()) && imageComboBox.getModel().getSize() > 1) {
            int actualElement = imageComboBox.getSelectedIndex();
            
            if("right".equals(direction)) {
                if(actualElement == (imageComboBox.getModel().getSize() - 1)) {
                    imageComboBox.setSelectedIndex(0);
                } else {
                    imageComboBox.setSelectedIndex(actualElement + 1);
                }
            } else if("left".equals(direction)) {
                if(actualElement == 0) {
                    imageComboBox.setSelectedIndex((imageComboBox.getModel().getSize() - 1));
                } else {
                    imageComboBox.setSelectedIndex(actualElement - 1);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCategoryButton;
    private javax.swing.JButton addImageButton;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JLabel currentUserLabel;
    private javax.swing.JButton deleteImageButton;
    private javax.swing.JButton goBackToMenuButton;
    private javax.swing.JComboBox<String> imageComboBox;
    private javax.swing.JLabel imageCountLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextImageLeftButton;
    private javax.swing.JButton nextImageRightButton;
    private javax.swing.JButton removeCategoryButton;
    // End of variables declaration//GEN-END:variables
}
