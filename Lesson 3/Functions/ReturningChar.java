public class ReturningChar {

	static char concatChars(char ch1, char ch2, char ch3) {
		char[] result = new char[4];
		result[0] = ch1;
		result[1] = ch2;
		result[2] = ch3;
		result[3] = '\0'; 
		// Null-terminator to create a valid string
		return result[0]; 
		// Returning the first character
	}

	public static void main(String[] args) {
		char char1 = 'E';
		char char2 = 'y';
        char char3 = 'y';

		char char4 = concatChars(char1, char2, char3); // Calling the method

		System.out.println("Character is " + char4);
	}
}