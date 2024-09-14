class BreakNestedLoop{
    public static void main(String[]args){
        for (int i = 1; i <= 3; i++) {         // outer loop (runs 3 times)
            for (int j = 1; j <= 3; j++) {     // inner loop (runs 3 times)
                if (j == 2) {                  // condition to check if j equals 2
                    break;                     // if j is 2, the inner loop is stopped
                }
                System.out.println("i: " + i + ", j: " + j);  // print values of i and j
            }
        }        
    }
}