
public class UniversityScholarship {
    public static void main(String[] args) {
        double percentage = 91;
        boolean sportsCertificate = true;
        boolean volunteerExperience = false;
        double familyIncome = 180000;

        if (percentage >= 90 && sportsCertificate && familyIncome <= 200000) {
            System.out.println("Full scholarship.");
        } else if (percentage >= 85 && (sportsCertificate || volunteerExperience)) {
            System.out.println("Partial scholarship.");
        } else {
            System.out.println("No scholarship.");
        }
    }
}
