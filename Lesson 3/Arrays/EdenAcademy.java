import java.util.*;

public class EdenAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of grades: ");
        // Input number of grades
        int n = sc.nextInt();
        int[] grades = new int[n];
        
        System.out.print("Enter grades: ");
        for (int i = 0; i < n; i++) {
            grades[i] = sc.nextInt();
        }

        List<Integer> passing = new ArrayList<>();
        List<Integer> failing = new ArrayList<>();

        for (int grade : grades) {
            int adjusted = grade;

            // Apply rounding rules
            if (grade >= 78) {
                int nextMultipleOf5 = ((grade / 5) + 1) * 5;
                if (nextMultipleOf5 - grade < 3) {
                    adjusted = nextMultipleOf5;
                }
            }

            // Classify into passing/failing
            if (adjusted >= 80) {
                passing.add(adjusted);
            } else {
                failing.add(adjusted);
            }
        }

        // Output results
        System.out.print("\nPassed: ");
        if (!passing.isEmpty()) {
            for (int p : passing) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
        System.out.print("Failed: ");
        if (!failing.isEmpty()) {
            for (int f : failing) {
                System.out.print(f + " ");
            }
            System.out.println();
        }

        // Stella Star and Tonitrus Bolt rules
        int stellaStars = passing.size() / 3;   // 1 star per 3 passes
        int tonitrusBolts = failing.size();     // 1 bolt per fail
        
        System.out.println();
        System.out.println("Stella Stars: " + stellaStars);
        System.out.println("Tonitrus Bolts: " + tonitrusBolts);

        sc.close();
    }
}