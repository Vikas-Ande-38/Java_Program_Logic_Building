public class ThirdRanker {
    public static void main(String[] args) {
        String marksStr = "85 92 76 88"; // marks in a string
        String[] parts = marksStr.split(" ");
        
        // Convert to integers
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        int d = Integer.parseInt(parts[3]);

        // Manual ranking logic (no array sort)
        int first = Math.max(Math.max(a, b), Math.max(c, d));
        int last = Math.min(Math.min(a, b), Math.min(c, d));
        int mid1 = (a + b + c + d) - (first + last);
        
        // Now mid1 has 2nd+3rd, separate them
        int third;
        if ((a != first) && (a != last)) third = Math.min(a, mid1 - a);
        else if ((b != first) && (b != last)) third = Math.min(b, mid1 - b);
        else if ((c != first) && (c != last)) third = Math.min(c, mid1 - c);
        else third = Math.min(d, mid1 - d);

        System.out.println("Third ranker's marks: " + third);
    }
}
