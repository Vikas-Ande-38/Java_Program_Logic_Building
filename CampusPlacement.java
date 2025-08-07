
public class CampusPlacement {
    public static void main(String[] args) {
        double cgpa = 6.7;
        int attendance = 85;
        boolean noBacklogs = false;
        int maxBacklogs = 1;

        if (cgpa >= 7 && attendance >= 75 && noBacklogs) {
            System.out.println("Eligible for all placements.");
        } else if (cgpa >= 6.5 && attendance >= 80 && maxBacklogs <= 1) {
            System.out.println("Eligible for Tier-2 companies.");
        } else {
            System.out.println("Not eligible.");
        }
    }
}
