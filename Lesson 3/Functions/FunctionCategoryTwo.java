import java.util.Random;

public class FunctionCategoryTwo {
	public static int getRandomValue() {
		Random random = new Random();
		int randomNumber = random.nextInt(100); 
		// generate a random number between 0 and 99
        // functions without parameters but with return values
		return randomNumber;
	}

	public static void main(String[] args) {
		int randomNum = getRandomValue(); 
		// calling the method

		System.out.println("Random Number: " + randomNum);
	}
}

// Output:
// Random Number: 14
// Note that the value of the number changes, as it is randomly generated