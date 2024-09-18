class ForEachIn2D {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][2];

        // print the number of rows
        System.out.println("Length of rows: " + nums.length);

        // ensure there is at least one row before accessing length of columns
        if (nums.length > 0) {
            System.out.println("Length of columns: " + nums[0].length);
        } else {
            System.out.println("Array is empty, no columns.");
        }

        // assigning values to the array
        for(int row = 0; row < nums.length; row++) {
            for(int col = 0; col < nums[row].length; col++) {
                nums[row][col] = (row + 1) * (col + 1);
            }
        }

        // using for-each loop to display the elements and calculate the sum
        for(int[] rvals : nums) {
            for(int cvals : rvals) {
                System.out.println("Value: " + cvals);
                sum += cvals;
            }
        }

        // print the total sum
        System.out.println("Summation: " + sum);
    }
}

/*
 *   row 0: 1, 2
 *   row 1: 2, 4
 *   row 2: 3, 6
 * 
 */
