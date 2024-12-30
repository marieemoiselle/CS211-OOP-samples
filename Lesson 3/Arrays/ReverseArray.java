import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray() {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input elements into the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Display the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Reverse the array
        int[] reversedArray = new int[size];
        for (int i = 0; i < size; i++) {
            reversedArray[i] = array[size - 1 - i];
        }

        // Display the reversed array
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
        scanner.close();
    }


    public static void main(String[] args) {
        reverseArray();
    }
}
