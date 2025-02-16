package exceptionhandling.trywithresources;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReaderProblem {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            String line;
            while ((line = br.readLine()) !=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Error reading file ");
        }
    }
}
