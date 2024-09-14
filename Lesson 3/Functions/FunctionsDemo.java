public class FunctionsDemo {
    public static int getProduct(int num1, int num2) {
		int product = num1 * num2;
		return product;
	}

	public static void main(String[] args) {
		int result = getProduct(7, 21);
		System.out.println("The product is: " + result);
	}
}

// Output: The product is 147