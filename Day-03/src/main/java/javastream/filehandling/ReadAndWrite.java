package javastream.filehandling;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {
        public static void fileReadWrite(String sourceFile, String destinationFile){


            try (FileInputStream fis = new FileInputStream(sourceFile);
                 FileOutputStream fos = new FileOutputStream(destinationFile)) {

                int byteData;
                while ((byteData = fis.read()) != -1) {
                    fos.write(byteData);
                }

                System.out.println("File copied successfully!");

            } catch (FileNotFoundException e) {
                System.out.println("Error: Source file '" + sourceFile + "' not found.");
            } catch (IOException e) {
                System.out.println("Error: An I/O error occurred - " + e.getMessage());
            }

        }
    }
     class FileReadWriteMain {
        public static void main(String[] args) {
            ReadAndWrite.fileReadWrite("source.txt", "destination.txt");
}
    }

