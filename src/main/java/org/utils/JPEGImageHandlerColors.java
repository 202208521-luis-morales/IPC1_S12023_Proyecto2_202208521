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
public class JPEGImageHandlerColors extends ImageHandler {

    private File uploadedImage;
    private BufferedImage imagen;

    public JPEGImageHandlerColors(String filename) {
        super(filename);
    }

    @Override
    public void readFile() throws Exception {
        this.imagen = ImageIO.read(uploadedImage);
    }

    @Override
    public void generateFiles() throws Exception {
        ImageIO.write(applyRedTonesFilter(imagen), "jpg", new File(this.getFileName() + "\\" + "Red-" + uploadedImage.getName()));
        ImageIO.write(applyGreenTonesFilter(imagen), "jpg", new File(this.getFileName() + "\\" + "Green-" + uploadedImage.getName()));
        ImageIO.write(applyBlueTonesFilter(imagen), "jpg", new File(this.getFileName() + "\\" + "Blue-" + uploadedImage.getName()));
        ImageIO.write(applySepiaFilter(imagen), "jpg", new File(this.getFileName() + "\\" + "Sepia-" + uploadedImage.getName()));
    }

    private BufferedImage copyImage(BufferedImage image) {
        BufferedImage copy = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                copy.setRGB(x, y, image.getRGB(x, y));
            }
        }
        return copy;
    }

    private BufferedImage applyRedTonesFilter(BufferedImage image) {
        BufferedImage copy = copyImage(image);
        for (int x = 0; x < copy.getWidth(); x++) {
            for (int y = 0; y < copy.getHeight(); y++) {
                Color color = new Color(copy.getRGB(x, y));
                int red = color.getRed();
                Color newColor = new Color(red, 0, 0);
                copy.setRGB(x, y, newColor.getRGB());
            }
        }
        return copy;
    }

    private BufferedImage applyBlueTonesFilter(BufferedImage image) {
        BufferedImage copy = copyImage(image);
        for (int x = 0; x < copy.getWidth(); x++) {
            for (int y = 0; y < copy.getHeight(); y++) {
                Color color = new Color(copy.getRGB(x, y));
                int blue = color.getBlue();
                Color newColor = new Color(0, 0, blue);
                copy.setRGB(x, y, newColor.getRGB());
            }
        }
        return copy;
    }

    private BufferedImage applyGreenTonesFilter(BufferedImage image) {
        BufferedImage copy = copyImage(image);
        for (int x = 0; x < copy.getWidth(); x++) {
            for (int y = 0; y < copy.getHeight(); y++) {
                Color color = new Color(copy.getRGB(x, y));
                int green = color.getGreen();
                Color newColor = new Color(0, green, 0);
                copy.setRGB(x, y, newColor.getRGB());
            }
        }
        return copy;
    }

    private BufferedImage applySepiaFilter(BufferedImage image) {
        BufferedImage copy = copyImage(image);
        for (int x = 0; x < copy.getWidth(); x++) {
            for (int y = 0; y < copy.getHeight(); y++) {
                Color color = new Color(copy.getRGB(x, y));
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
                int tr = (int) (0.393 * r + 0.769 * g + 0.189 * b);
                int tg = (int) (0.349 * r + 0.686 * g + 0.168 * b);
                int tb = (int) (0.272 * r + 0.534 * g + 0.131 * b);
                tr = Math.min(tr, 255);
                tg = Math.min(tg, 255);
                tb = Math.min(tb, 255);
                Color newColor = new Color(tr, tg, tb);
                copy.setRGB(x, y, newColor.getRGB());
            }
        }
        return copy;
    }
}
