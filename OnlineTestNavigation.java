import java.util.Scanner;

public class OnlineTestNavigation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for question type
        System.out.println("Enter question type (MCQ, Code, Essay):");
        String questionType = sc.nextLine();

        String selectedOption = null;
        int testCasesPassed = 0, totalTestCases = 0;
        int wordCount = 0, minLimit = 200;

        switch (questionType) {
            case "MCQ":
                System.out.println("Have you selected an option? (yes/no):");
                String optionInput = sc.nextLine();
                if (optionInput.equalsIgnoreCase("yes")) {
                    selectedOption = "A"; // any non-null value
                }
                if (selectedOption != null) {
                    System.out.println("Submitted.");
                } else {
                    System.out.println("Choose an option.");
                }
                break;

            case "Code":
                System.out.print("Enter number of test cases passed: ");
                testCasesPassed = sc.nextInt();
                System.out.print("Enter total number of test cases: ");
                totalTestCases = sc.nextInt();
                if (testCasesPassed == totalTestCases) {
                    System.out.println("Auto-submit.");
                } else {
                    System.out.println("Show feedback.");
                }
                break;

            case "Essay":
                System.out.print("Enter your essay word count: ");
                wordCount = sc.nextInt();
                if (wordCount >= minLimit) {
                    System.out.println("Submit allowed.");
                } else {
                    System.out.println("Write more.");
                }
                break;

            default:
                System.out.println("Unknown question type.");
        }

        sc.close();
    }
}
