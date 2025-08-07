public class VisaEligibility {
    public static void main(String[] args) {
        int age = 25;
        boolean hasPassport = false;
        boolean hasNoCriminalRecord = true;

        if (age >= 18 && hasPassport && hasNoCriminalRecord) {
            System.out.println("Eligible for visa.");
        } else if (age >= 18 && !hasPassport && hasNoCriminalRecord) {
            System.out.println("Apply for passport first.");
        } else if (age < 18 || !hasNoCriminalRecord) {
            System.out.println("Not eligible.");
        }
    }
}
