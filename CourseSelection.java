
public class CourseSelection {
    public static void main(String[] args) {
        int semester = 4;
        String department = "CS";
        int credits = 25;
        boolean internshipDone = true;

        switch (semester) {
            case 1: case 2:
                System.out.println("Basic Science Subjects");
                break;
            case 3: case 4:
                if (department.equals("CS")) {
                    System.out.println("Subjects: DS, DBMS");
                } else if (department.equals("ME")) {
                    System.out.println("Subjects: Thermo, Fluids");
                }
                break;
            case 5: case 6:
                if (credits > 20) {
                    System.out.println("Include electives.");
                } else {
                    System.out.println("Regular subjects only.");
                }
                break;
            case 7: case 8:
                if (internshipDone) {
                    System.out.println("Show Project Options");
                } else {
                    System.out.println("Reminder: Complete Internship");
                }
                break;
        }
    }
}
