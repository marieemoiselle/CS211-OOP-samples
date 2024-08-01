class PlaceholderSample{
    public static void main(String[] args) {
        int age = 27;
		float height = 1.54f;
		char grade = 'A';
		String name = "Fatima Marie";

		System.out.println("Age: " + age);
		System.out.println("Height: " + String.format("%.2f meters", height));
		System.out.println("Grade: " + grade);
		System.out.println("Name: " + name);
    }
}

/*
    OUTPUT
    Age: 27
    Height: 1.54 meters
    Grade: A
    Name: Fatima Marie
 */