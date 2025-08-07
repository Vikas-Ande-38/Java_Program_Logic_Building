import java.util.Scanner;

public class CollegeCourseSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter semester (1-8): ");
        int semester = sc.nextInt();
        sc.nextLine();  // Clear newline left after nextInt()

        System.out.print("Enter department (CS/ME): ");
        String department = sc.nextLine();

        System.out.print("Enter total credits: ");
        int credits = sc.nextInt();

        System.out.print("Have you completed internship? (true/false): ");
        boolean internshipDone = sc.nextBoolean();

        // Switch logic
        switch (semester) {
            case 1:
            case 2:
                System.out.println("Basic Science Subjects");
                break;

            case 3:
            case 4:
                if (department.equalsIgnoreCase("CS")) {
                    System.out.println("DS, DBMS");
                } else if (department.equalsIgnoreCase("ME")) {
                    System.out.println("Thermo, Fluids");
                } else {
                    System.out.println("Department not recognized.");
                }
                break;

            case 5:
            case 6:
                if (credits > 20) {
                    System.out.println("Include electives");
                } else {
                    System.out.println("Core courses only.");
                }
                break;

            case 7:
            case 8:
                if (internshipDone) {
                    System.out.println("Project Options");
                } else {
                    System.out.println("Internship Reminder");
                }
                break;

            default:
                System.out.println("Invalid semester");
        }

        sc.close();
    }
}
