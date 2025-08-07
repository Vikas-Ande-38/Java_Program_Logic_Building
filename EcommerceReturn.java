
public class EcommerceReturn {
    public static void main(String[] args) {
        int category = 1;
        int daysSincePurchase = 6;
        boolean isTagAttached = true;

        switch (category) {
            case 1:
                if (daysSincePurchase <= 7) {
                    System.out.println("Return allowed.");
                } else {
                    System.out.println("Return not allowed.");
                }
                break;
            case 2:
                if (isTagAttached) {
                    System.out.println("Return allowed.");
                } else {
                    System.out.println("Return denied. Tag missing.");
                }
                break;
            case 3:
                System.out.println("Return denied. Books are non-returnable.");
                break;
        }
    }
}
