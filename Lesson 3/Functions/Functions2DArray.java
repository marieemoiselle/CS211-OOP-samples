public class Functions2DArray {
	
	// Method to add a constant value to each element of the 2D array
	public static void multiplyToTen(int[][] arr, int multiplier) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] *= multiplier;
			}
		}
	}

	// Method to display the modified array
	public static void displayArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {{10, 20}, {30, 40}};

		// Adding a constant value to the array
		multiplyToTen(matrix, 10);

		// Display the modified array
		displayArray(matrix);
	}
}