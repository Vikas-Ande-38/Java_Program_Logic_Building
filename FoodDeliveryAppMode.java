import java.util.Scanner;

public class FoodDeliveryAppMode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user to choose mode
        System.out.println("Select Mode:");
        System.out.println("1. Pickup");
        System.out.println("2. Delivery");
        System.out.println("3. Dine-in/Table Booking");
        System.out.print("Enter mode (1-3): ");
        int mode = sc.nextInt();

        // Get store open status
        System.out.print("Is the store open? (true/false): ");
        boolean storeOpen = sc.nextBoolean();

        // Get delivery status
        System.out.print("Is delivery available? (true/false): ");
        boolean deliveryAvailable = sc.nextBoolean();

        // Get distance
        System.out.print("Enter distance from store (in km): ");
        int distance = sc.nextInt();

        // Get table availability
        System.out.print("Is a table available? (true/false): ");
        boolean tableAvailable = sc.nextBoolean();

        // Decision logic
        switch (mode) {
            case 1:
                if (storeOpen) {
                    System.out.println("Pickup allowed.");
                } else {
                    System.out.println("Store is closed.");
                }
                break;

            case 2:
                if (distance <= 10 && deliveryAvailable) {
                    System.out.println("Delivery allowed.");
                } else {
                    System.out.println("Not Deliverable.");
                }
                break;

            case 3:
                if (tableAvailable) {
                    System.out.println("Table booked.");
                } else {
                    System.out.println("No table available.");
                }
                break;

            default:
                System.out.println("Invalid mode.");
        }

        sc.close();
    }
}
