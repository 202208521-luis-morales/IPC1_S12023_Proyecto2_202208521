package org.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.UUID;
import javax.imageio.ImageIO;

public class JPEGtoBMPImage extends ImageHandler {

    private File uploadedImage;
    private BufferedImage imagen;
    private String generatedId;
    private boolean isForMethod = false;

    public JPEGtoBMPImage(String filename) {
        // Este atributo será la ruta donde se guardará el archivo
        super(filename);
        this.generatedId = UUID.randomUUID().toString();
    }

    public void setUploadedImage(File uploadedImage) {
        this.uploadedImage = uploadedImage;
    }

    public String getGeneratedId() {
        return generatedId;
    }

    public void setIsForMethod(boolean isForMethod) {
        this.isForMethod = isForMethod;
    }

    @Override
    public void readFile() throws Exception {
        BufferedImage imagen = ImageIO.read(uploadedImage);
        this.imagen = imagen;
    }

    @Override
    public void generateFiles() throws Exception {
        BufferedImage convertedImage = new BufferedImage(imagen.getWidth(), imagen.getHeight(), BufferedImage.TYPE_BYTE_INDEXED);
        convertedImage.createGraphics().drawImage(imagen, 0, 0, null);
        File bmpFile = new File(this.getFileName() + "\\" + (isForMethod ? this.getGeneratedId() + "-" : "") + uploadedImage.getName().replace(".jpg", ".bmp"));
        ImageIO.write(convertedImage, "bmp", bmpFile);
    }

}
