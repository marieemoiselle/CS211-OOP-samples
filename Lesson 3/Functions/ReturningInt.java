public class ReturningInt {
	static int getRemainder(int dividend, int divisor) {
		int result = dividend % divisor;
		return result;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;

		int rem = getRemainder(num1, num2);
		// Calling the method

		System.out.println(num1 + " % " + num2 + " = " + rem);
	}
}

// Output:
// 10 % 3 = 1