import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        String rev = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            rev += num.charAt(i);
        }

        if (rev.equals(num))
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is NOT a Palindrome");
    }
}
