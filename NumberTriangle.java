public class NumberTriangle {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            String row = "";
            for (int j = 1; j <= i; j++) {
                row += num + " ";
                num++;
            }
            System.out.println(row);
        }
    }
}
