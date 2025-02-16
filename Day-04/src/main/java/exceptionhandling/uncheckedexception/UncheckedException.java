package exceptionhandling.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter Number1: ");
            int num1 = input.nextInt();
            System.out.println("Enter Number2: ");
            int num2 = input.nextInt();
            int result = num1/num2;
            System.out.println("Results: "+result);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception: ");
        }catch (InputMismatchException e){
            System.out.println("InputMismatch Exception: ");
        }
    }
}
