package exceptionhandling.finallyblock;

import java.util.Scanner;

public class PerformDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter num1: ");
            int num1 = input.nextInt();
            System.out.println("Enter num2: ");
            int num2 = input.nextInt();
            int result = num1/num2;
            System.out.println(result);
        }catch (ArithmeticException e){
            e.getMessage();
        }finally {
            System.out.println("Operation is completed: ");
        }
    }
}
