public class ReturningDouble {
	static double getAverage(double num1, double num2, double num3) {
		double average = (num1 + num2 + num3) / 3.0;
		return average;
	}

	public static void main(String[] args) {
		double num1 = 89.0;
		double num2 = 90.0;
		double num3 = 91.0; 

		double avg = getAverage(num1, num2, num3); 
		// calling the method with three arguments

		System.out.println("Average: " +avg);
    }
}

//Output: Average: 90.0