package javastream.filterstreams;




import java.io.*;

public class ConvertUppercaseLowercase {
        public static void convertFileToLowercase(String source, String destination) {
            try (BufferedReader br = new BufferedReader(new FileReader(source));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(destination))) {

                String line;
                while ((line = br.readLine()) != null) {
                    bw.write(line.toLowerCase()); // Convert to lowercase
                    bw.newLine(); // Write new line
                }

                System.out.println("File conversion completed successfully!");

            } catch (IOException e) {
                System.out.println("Error processing file: " + e.getMessage());
            }
        }

    }
     class UppertoLowerMain {
        public static void main(String[] args) {
            ConvertUppercaseLowercase.convertFileToLowercase("source.txt", "destination.txt");

        }
    }

