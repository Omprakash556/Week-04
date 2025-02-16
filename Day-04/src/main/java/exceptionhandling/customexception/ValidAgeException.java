package exceptionhandling.customexception;

import java.util.Scanner;

class InvalidAgeException  extends Exception{
    public InvalidAgeException (String message){
        super(message);
    }
}
public class ValidAgeException {
    public static void validAge(int age) throws InvalidAgeException {
        if(age < 18){
            throw  new InvalidAgeException (" Age must be at least 18.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter Age: ");
            int age = input.nextInt();
            validAge(age);
            System.out.println("Access granted! ");
        }catch (InvalidAgeException  e){
            System.out.println("Access denied! "+e.getMessage());
        }
    }
}
