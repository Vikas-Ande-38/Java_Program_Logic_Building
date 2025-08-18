public class BreakAmount {
    public static void main(String[] args) {
        int amount = 3700;

        int thousands = amount / 1000;
        amount %= 1000;

        int fiveHundreds = amount / 500;
        int remaining = amount % 500;

        System.out.println("1000s: " + thousands);
        System.out.println("500s: " + fiveHundreds);
        System.out.println("Remaining: " + remaining);
    }
}