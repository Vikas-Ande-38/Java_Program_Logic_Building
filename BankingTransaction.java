
public class BankingTransaction {
    public static void main(String[] args) {
        int option = 1;
        double balance = 1000;
        double amount = 500;
        String receiverAccount = "123ABC";

        switch (option) {
            case 1:
                if (amount > 0 && balance >= amount) {
                    System.out.println("Withdrawal allowed.");
                } else {
                    System.out.println("Insufficient funds.");
                }
                break;
            case 2:
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposited successfully. New balance: ₹" + balance);
                }
                break;
            case 3:
                if (amount <= balance && receiverAccount != null) {
                    System.out.println("Transfer successful to " + receiverAccount);
                } else {
                    System.out.println("Transfer failed.");
                }
                break;
        }
    }
}
