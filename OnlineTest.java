
public class OnlineTest {
    public static void main(String[] args) {
        String questionType = "Essay";
        String selectedOption = "";
        int testCasesPassed = 5;
        int totalTestCases = 5;
        int wordCount = 200;
        int minLimit = 300;

        switch (questionType) {
            case "MCQ":
                if (selectedOption != null && !selectedOption.isEmpty()) System.out.println("Submit.");
                else System.out.println("Choose an option.");
                break;
            case "Code":
                if (testCasesPassed == totalTestCases) System.out.println("Auto-submit.");
                else System.out.println("Show feedback.");
                break;
            case "Essay":
                if (wordCount >= minLimit) System.out.println("Submit allowed.");
                else System.out.println("Write more.");
                break;
        }
    }
}
