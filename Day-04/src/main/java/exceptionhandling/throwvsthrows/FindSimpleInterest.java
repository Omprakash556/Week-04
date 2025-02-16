package exceptionhandling.throwvsthrows;

import java.util.Scanner;

public class FindSimpleInterest {
    public static double calculateInterest(double amount,double rate,int years){
            if(amount<0 || rate <0){
                throw new IllegalArgumentException("Amount and rate should be positive: ");

        }
            return (amount*rate*years)/100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter amount: ");
            double amount = input.nextDouble();
            System.out.println("Enter rate: ");
            double rate = input.nextDouble();
            System.out.println("Enter years:");
            int years = input.nextInt();
            double interest = calculateInterest(amount,rate,years);
            System.out.println("Total Interest: "+interest);
        }catch (IllegalArgumentException e){
            System.out.println("Invalid arguments: "+e.getMessage());
        }

    }
}
