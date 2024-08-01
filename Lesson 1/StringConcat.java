class StringConcat {
    public static void main(String[] args) {
        String str1 = "Bonjour";
		String str2 = "Mademoiselle";

		// Using the + operator
		String result1 = str1 + " " + str2;

		// Using the concat method
		String result2 = str1.concat(" ").concat(str2);

		System.out.println("Concatenated string (using + operator): " + result1);
		System.out.println("Concatenated string (using concat method): " + result2);
	}
}

