package exceptionhandling.nestedtrycatch;

import java.util.Scanner;

public class ArrayOperationPerform {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of the Array: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Enter Divisor: ");
        int divisor = input.nextInt();

        System.out.println("Enter index to access: ");
        int index = input.nextInt();

        try {
            try {
                int element = array[index];
                try {
                    int result = element / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
