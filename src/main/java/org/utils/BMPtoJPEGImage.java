/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utils;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author DELL
 */
public class BMPtoJPEGImage extends ImageHandler {
    private File uploadedImage;
    private BufferedImage imagen;

    public BMPtoJPEGImage(String filename) {
        // Este atributo será la ruta donde se guardará el archivo
        super(filename);
    }

    @Override
    public void readFile() throws Exception {
        BufferedImage imagen = ImageIO.read(uploadedImage);
        this.imagen = imagen;
    }

    public void setUploadedImage(File uploadedImage) {
        this.uploadedImage = uploadedImage;
    }

    @Override
    public void generateFiles() throws Exception {
        BufferedImage jpgImage = new BufferedImage(imagen.getWidth(), imagen.getHeight(), BufferedImage.TYPE_INT_RGB);
        jpgImage.createGraphics().drawImage(imagen, 0, 0, Color.WHITE, null);
        File output = new File(this.getFileName() + "\\" + uploadedImage.getName().replace(".bmp", ".jpg"));
        ImageIO.write(jpgImage, "jpg", output);
    }

}
