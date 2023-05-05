package org.utils;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class JPEGImageHandlerBN extends ImageHandler {

    private File uploadedImage;
    private BufferedImage imagen;

    public JPEGImageHandlerBN(String filename) {
        super(filename);
    }

    @Override
    public void readFile() throws Exception {
        this.imagen = ImageIO.read(uploadedImage);
    }

    @Override
    public void generateFiles() throws Exception {
        BufferedImage imagenBN = new BufferedImage(imagen.getWidth(), imagen.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        Graphics2D g2d = imagenBN.createGraphics();
        g2d.drawImage(imagen, 0, 0, null);
        g2d.dispose();

        for (int y = 0; y < imagenBN.getHeight(); y++) {
            for (int x = 0; x < imagenBN.getWidth(); x++) {
                int rgb = imagenBN.getRGB(x, y);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;
                int gray = (int) (0.299 * r + 0.587 * g + 0.114 * b);
                imagenBN.setRGB(x, y, (gray << 16) | (gray << 8) | gray);
            }
        }

        ImageIO.write(imagenBN, "jpg", new File(this.getFileName() + "\\" + "BN-" + uploadedImage.getName()));
    }

}
