
public class ShoppingDiscount {
    public static void main(String[] args) {
        double cartAmount = 4000;
        boolean isMember = true;
        boolean hasCoupon = true;

        if (cartAmount > 5000 && isMember) {
            System.out.println("25% discount.");
        } else if (cartAmount > 3000 && isMember && hasCoupon) {
            System.out.println("20% discount.");
        } else if (cartAmount > 3000 && (isMember || hasCoupon)) {
            System.out.println("10% discount.");
        } else {
            System.out.println("No discount.");
        }
    }
}
