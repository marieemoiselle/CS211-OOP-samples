public class PassByValue {
	public static void changeValue(int num) {
		num = 100; // changes made to the formal parameter
	}

	public static void main(String[] args) {
		int num = 98;
		changeValue(num); // passing num by value
		System.out.println("Value after method call: " + num);
	}
}

// Output:
// Value after method call: 98