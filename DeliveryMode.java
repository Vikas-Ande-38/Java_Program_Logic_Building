
public class DeliveryMode {
    public static void main(String[] args) {
        int mode = 2;
        boolean storeOpen = true;
        int distance = 8;
        boolean deliveryAvailable = true;
        boolean tableAvailable = false;

        switch (mode) {
            case 1:
                if (storeOpen) System.out.println("Pickup allowed.");
                else System.out.println("Store closed.");
                break;
            case 2:
                if (distance <= 10 && deliveryAvailable) System.out.println("Delivery available.");
                else System.out.println("Not deliverable.");
                break;
            case 3:
                if (tableAvailable) System.out.println("Table booked.");
                else System.out.println("No table available.");
                break;
        }
    }
}
