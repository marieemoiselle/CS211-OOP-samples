import java.util.Scanner;

public class Sequences {
    public static boolean isArithmetic(int[] sequence) {
        int diff = sequence[1] - sequence[0];
        for (int i = 1; i < 4; i++) {
            if (sequence[i+1] - sequence[i] != diff) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGeometric(int[] sequence) {
        if (sequence[0] == 0) {
            return false;
        }
        double ratio = (double) sequence[1] / sequence[0];
        for (int i = 1; i < 4; i++) {
            if (sequence[i] == 0 || (double) sequence[i+1] / sequence[i] != ratio) {
                return false;
            }
        }
        return true;
    }

    public static int findNthElement(int[] sequence, int n) {
        if (isArithmetic(sequence)) {
            int diff = sequence[1] - sequence[0];
            return sequence[0] + (n - 1) * diff;
        } else if (isGeometric(sequence)) {
            double ratio = (double) sequence[1] / sequence[0];
            return (int)(sequence[0] * Math.pow(ratio, n - 1));
        } else {
            return -1; // indicate not found
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sequence = new int[5];
        int n;

        System.out.print("Enter the first 5 elements of the sequence: ");
        for (int i = 0; i < 5; i++) {
            sequence[i] = scanner.nextInt();
        }

        if (isArithmetic(sequence) || isGeometric(sequence)) {
            System.out.print("Find which element: ");
            n = scanner.nextInt();

            int result = findNthElement(sequence, n);
            if (result != -1) {
                System.out.println("Element " + n + " is " + result);
            }
        } else {
            System.out.println("The sequence is neither arithmetic nor geometric.");
        }

        scanner.close();
    }
}