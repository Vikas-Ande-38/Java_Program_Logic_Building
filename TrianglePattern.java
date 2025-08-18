public class TrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            String line = "";

            // left "-"
            for (int s = 1; s <= n - i; s++) {
                line += "- ";
            }

            // stars
            for (int j = 1; j <= 2 * i; j++) {
                line += "* ";
            }

            // right "-"
            for (int s = 1; s <= n - i; s++) {
                line += "- ";
            }

            System.out.println(line);
        }
    }
}
