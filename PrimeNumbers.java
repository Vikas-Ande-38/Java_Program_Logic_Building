public class PrimeNumbers {
    public static void main(String[] args) {
        String primes = "";
        for (int num = 2; num <= 100; num++) {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primes += num + " "; // keep adding to string
            }
        }
        System.out.println("Prime numbers from 1 to 100:");
        System.out.println(primes.trim());
    }
}
