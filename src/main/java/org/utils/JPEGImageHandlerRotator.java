package org.utils;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class JPEGImageHandlerRotator extends ImageHandler {

    private File uploadedImage;
    private BufferedImage image;

    public JPEGImageHandlerRotator(String filename) {
        super(filename);
    }

    @Override
    public void readFile() throws Exception {
        this.image = ImageIO.read(uploadedImage);
    }

    @Override
    public void generateFiles() throws Exception {
        int w = image.getWidth();
        int h = image.getHeight();

        BufferedImage hRotated = new BufferedImage(w, h, image.getType());
        Graphics2D g = hRotated.createGraphics();
        g.drawImage(image, 0, h, w, -h, null);
        g.dispose();

        BufferedImage vRotated = new BufferedImage(w, h, image.getType());
        Graphics2D g2 = vRotated.createGraphics();
        g2.drawImage(image, w, 0, -w, h, null);
        g2.dispose();

        ImageIO.write(hRotated, "jpg", new File(this.getFileName() + "\\" + "Hrotation-" + uploadedImage.getName()));
        ImageIO.write(vRotated, "jpg", new File(this.getFileName() + "\\" + "Vrotation-" + uploadedImage.getName()));
    }

}
