
public class FitnessProgram {
    public static void main(String[] args) {
        int age = 35;
        double bmi = 24;
        boolean hasHeartCondition = false;

        if (age < 40 && bmi <= 25 && !hasHeartCondition) {
            System.out.println("High-Intensity Program");
        } else if (age < 60 && (bmi <= 30 || hasHeartCondition)) {
            System.out.println("Moderate Program");
        } else {
            System.out.println("Consult Doctor First");
        }
    }
}
