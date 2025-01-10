import java.util.Scanner;

public class SimpleBankingApplication {
    // Initialize balance
    private double balance = 0;

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
    }

    // Method to display balance
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Main method
    public static void main(String[] args) {
        SimpleBankingApplication bankApp = new SimpleBankingApplication();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Simple Banking Application!");

        // Loop to display menu options
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bankApp.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bankApp.withdraw(withdrawAmount);
                    break;

                case 3:
                    bankApp.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the Simple Banking Application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
