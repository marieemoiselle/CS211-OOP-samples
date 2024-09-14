public class FunctionCategoryThree {
	public static void welcomePerson(String name) {
		System.out.println("Welcome, " + name + "!");
		// functions with parameters but without return values
	}

	public static void main(String[] args) {
		String person = "Marie";
		welcomePerson(person);
	}
}

// Output:
// Welcome, Marie!