class StringCompare{
	public static void main(String[] args) {
		String str1 = "strawberry";
		String str2 = "strawberry";

		// content comparison
		boolean isEqual = str1.equals(str2);

		// lexicographic comparison
		int result = str1.compareTo(str2);

		System.out.println("Content comparison: " + isEqual);
		System.out.println("Lexicographic comparison: " + result);
	}
}