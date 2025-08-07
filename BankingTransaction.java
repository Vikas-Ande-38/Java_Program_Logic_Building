import java.util.Scanner;

public class BankingTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;

        while (true) {
            System.out.println("\nSelect Transaction:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Transfer");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (balance >= withdrawAmount && withdrawAmount > 0) {
                        balance -= withdrawAmount;
                        System.out.println("Withdraw successful. New balance: ₹" + balance);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit successful. New balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter receiver account number: ");
                    String receiverAccount = sc.next();
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = sc.nextDouble();
                    if (transferAmount <= balance && receiverAccount != null && !receiverAccount.isEmpty()) {
                        balance -= transferAmount;
                        System.out.println("Transfer successful to account " + receiverAccount + ". New balance: ₹" + balance);
                    } else {
                        System.out.println("Transfer failed.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the banking service.");
                    sc.close();
                    return; // exit the program

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
