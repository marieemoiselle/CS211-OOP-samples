public class FunctionCategoryFour {
	public static double getTriangleArea(double base, double height) {
        double area = (base * height)/2;
		return area;
        // functions with parameters and return values
	}

	public static void main(String[] args) {
		double tribase = 45.0;
        double triheight = 15.4;
        double tri_area = getTriangleArea(tribase, triheight);
        System.out.println("The area of the triangle is: " + String.format("%.2f", tri_area));
        // sets the area to two decimal places
	}

    // output:
    // The area of the triangle is: 346.50
}