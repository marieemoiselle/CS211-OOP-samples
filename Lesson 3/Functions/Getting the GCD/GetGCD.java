import java.util.Scanner;
class GetGCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int result = computeGCD(num1, num2);
        System.out.println("GCD of " + num1 + " & " + num2 + " is: " + result);
        input.close();
    }
    
    public static int computeGCD(int a, int b) {
        // base case: if b is 0, then a is the GCD
        if (b == 0) {
            return a;
        }
        // recursive step: GCD(a, b) = GCD(b, a % b)
        return computeGCD(b, a % b);
    }

}