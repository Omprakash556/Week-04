package javastream.bytearraystream;




import java.io.*;

public class ConvertImageByteArray {
        public static byte[] convertImageToByteArray(String imagePath) {
            try (FileInputStream fis = new FileInputStream(imagePath);
                 ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    baos.write(buffer, 0, bytesRead);
                }
                return baos.toByteArray();
            } catch (IOException e) {
                System.out.println("Error reading image file: " + e.getMessage());
                return null;
            }
        }

        public static boolean writeByteArrayToImage(byte[] imageData, String outputPath) {
            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
                 FileOutputStream fos = new FileOutputStream(outputPath)) {

                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = bais.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
                return true;
            } catch (IOException e) {
                System.out.println("Error writing image file: " + e.getMessage());
                return false;
            }

        }}
     class Main {
        public static void main(String[] args) {

            String sourceImage = "input.jpg";
            String outputImage = "output.jpg";


            byte[] imageBytes = ConvertImageByteArray.convertImageToByteArray(sourceImage);
            if (imageBytes != null) {
                System.out.println("Image successfully converted to byte array. Size: " + imageBytes.length + " bytes");

                if (ConvertImageByteArray.writeByteArrayToImage(imageBytes, outputImage)) {
                    System.out.println("Image successfully written to " + outputImage);
                } else {
                    System.out.println("Failed to write image.");
                }
            } else {
                System.out.println("Image conversion failed.");
            }
        }

    }
