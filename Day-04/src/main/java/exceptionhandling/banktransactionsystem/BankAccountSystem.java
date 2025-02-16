package exceptionhandling.banktransactionsystem;

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance: 1000

        // Test different cases
        try {
            account.withdraw(200);
            account.withdraw(1200);
            account.withdraw(-50);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

