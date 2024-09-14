public class ParameterTypes{
    public static void getDifference(int x, int y) { 
        // x and y are formal parameters
		int difference = x - y;
		System.out.println(x + " - " + y + " = " + difference);
    }
	public static void main(String[] args) {
		// method call with actual parameters
		getDifference(20, 9);
	}
}

//Output: 20 - 9 = 11