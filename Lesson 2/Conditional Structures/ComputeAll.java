import java.util.Scanner;
public class ComputeAll {

    public static void main(String[] args) {
        Scanner fn = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = fn.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sn.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        int quot = num1 / num2;
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " +prod);
        System.out.print("Quotient: "+quot);
    }
}