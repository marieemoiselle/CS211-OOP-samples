public class ContinueNestedLoop {
    public static void main(String[]args){
        for (int i = 1; i <= 3; i++) {         // Outer loop (runs 3 times)
            for (int j = 1; j <= 3; j++) {     // Inner loop (runs 3 times)
                if (j == 2) {                  // Condition to check if j equals 2
                    continue;                  // Skips the current iteration if j is 2
                }
                System.out.println("i: " + i + ", j: " + j);  // Print values of i and j
            }
        }        
    }
}
