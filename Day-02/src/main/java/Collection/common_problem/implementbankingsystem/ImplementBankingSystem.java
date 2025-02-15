package Collection.common_problem.implementbankingsystem;

import java.util.*;
public class ImplementBankingSystem {
    private Map<Integer, Double> accounts = new HashMap<>();
    private TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    public void addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    public void deposit(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double newBalance = accounts.get(accountNumber) + amount;
            sortedAccounts.remove(accounts.get(accountNumber));
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber);
            System.out.println("Deposited ₹" + amount + " to Account " + accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.offer(accountNumber);
            System.out.println("Withdrawal requested for Account " + accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void processWithdrawals() {
        System.out.println("\nProcessing Withdrawals:");
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            System.out.println("Processed withdrawal for Account " + accountNumber);
        }
    }

    public void displayAccounts() {
        System.out.println("\nAll Accounts (Unordered):");
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            System.out.println("Account " + entry.getKey() + " -> ₹" + entry.getValue());
        }
    }

    public void displaySortedAccounts() {
        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account " + entry.getValue() + " -> ₹" + entry.getKey());
        }
    }
    public static void main(String[] args) {
        ImplementBankingSystem bank = new ImplementBankingSystem();

        bank.addAccount(101, 5000);
        bank.addAccount(102, 10000);
        bank.addAccount(103, 2000);
        bank.addAccount(104, 8000);

        bank.deposit(101, 2000);
        bank.deposit(103, 3000);

        bank.requestWithdrawal(102);
        bank.requestWithdrawal(104);

        bank.displayAccounts();
        bank.displaySortedAccounts();

        bank.processWithdrawals();
    }
}

