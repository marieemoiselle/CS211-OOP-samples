public class Functions1DArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int multiplier = 5;

		System.out.print("Original Array: ");
		printArray(arr);

		// calling the method to add a constant value to the elements
		multiplyToFive(arr, multiplier);

		System.out.print("\nModified Array: ");
		printArray(arr);
	}

	public static void multiplyToFive(int[] arr, int multiplier) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= multiplier;
            //multiples the elements
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
        //prints the arrays
	}
}

// Output:
/*
Original Array: 1 2 3 4 5 

Modified Array: 5 10 15 20 25 
*/