public class ReturningInt {
	static int getProduct(int dividend, int divisor) {
		int result = dividend / divisor;
		return result;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;

		int rem = getProduct(num1, num2);
		// Calling the method

		System.out.println(num1 + " % " + num2 + " = " + rem);
	}
}

// Output:
// 10 % 3 = 1