package javastream.readuserinputfromconsole;




import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserInputfromConsole {
        public static void takeInput(String filePath){
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 FileWriter fw = new FileWriter(filePath, true)) { // Append mode

                System.out.println("Enter your name: ");
                String name = br.readLine();

                System.out.println("Enter your age: ");
                String age = br.readLine();

                System.out.println("Enter your favorite programming language: ");
                String language = br.readLine();

                // Writing to file
                fw.write("Name: " + name + "\n");
                fw.write("Age: " + age + "\n");
                fw.write("Favorite Language: " + language + "\n");
                fw.write("----------------------------\n");

                System.out.println("User information saved successfully in " + filePath);

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
     class InputFromUserMain {
        public static void main(String[] args) {
            ReadUserInputfromConsole.takeInput("source.txt");
}
    }
