public class FibonacciRecursive {
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n; 
			// Base case: Fibonacci of 0 and 1 is the number itself
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2); 
			// Recursive case: f(n) = f(n-1) + f(n-2)
		}
	}
	public static void main(String[] args) {
		int position = 6;
		System.out.println("Position: " + position);
		System.out.println("Fibonacci number: " + fibonacci(position));
	}
}

// Output
// Position: 6
// Fibonacci number: 8