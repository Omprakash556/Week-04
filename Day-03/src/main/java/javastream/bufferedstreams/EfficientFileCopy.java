package javastream.bufferedstreams;



import java.io.*;

public class EfficientFileCopy {

    private static final int BUFFER_SIZE = 4096;
    public static long copyFileBuffered(String source, String destination) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            bos.flush(); // Ensure all data is written before closing

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }

    // Copy file using FileInputStream and FileOutputStream (without buffering)
    public static long copyFileUnbuffered(String source, String destination) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }

}
 class BufferedFileMain {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationBuffered = "destination.txt";
        String destinationUnbuffered = "destination1.txt";

        // Copy using Buffered Streams
        long timeBuffered = EfficientFileCopy.copyFileBuffered(sourceFile, destinationBuffered);
        System.out.println("Buffered Stream Copy Time: " + timeBuffered + " ns");

        // Copy using Unbuffered Streams
        long timeUnbuffered = EfficientFileCopy.copyFileUnbuffered(sourceFile, destinationUnbuffered);
        System.out.println("Unbuffered Stream Copy Time: " + timeUnbuffered + " ns");

        // Compare performance
        System.out.println("Buffered streams were " + ((double) timeUnbuffered / timeBuffered) + " times faster than unbuffered.");

}
}

