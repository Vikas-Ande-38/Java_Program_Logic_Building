import java.util.Scanner;

public class EcommerceReturnPolicy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get category from user
        System.out.println("Select product category:");
        System.out.println("1. Electronics");
        System.out.println("2. Clothing");
        System.out.println("3. Books");
        System.out.print("Enter category (1-3): ");
        int category = sc.nextInt();

        // Get number of days since purchase
        System.out.print("Enter number of days since purchase: ");
        int daysSincePurchase = sc.nextInt();

        // Ask if tag is attached (only relevant for clothing)
        System.out.print("Is tag attached? (true/false): ");
        boolean isTagAttached = sc.nextBoolean();

        // Decision logic using switch-case
        switch (category) {
            case 1: // Electronics
                if (daysSincePurchase <= 7) {
                    System.out.println("Return allowed for Electronics.");
                } else {
                    System.out.println("Return not allowed for Electronics.");
                }
                break;

            case 2: // Clothing
                if (isTagAttached) {
                    System.out.println("Return allowed for Clothing.");
                } else {
                    System.out.println("Return denied for Clothing.");
                }
                break;

            case 3: // Books
                System.out.println("Books are non-returnable.");
                break;

            default:
                System.out.println("Invalid category.");
        }

        sc.close();
    }
}
