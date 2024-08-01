import java.util.Scanner;

class GetRemainder{
    public static void main(String[]args){
        
        Scanner fn = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = fn.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sn.nextInt();
        int remainder = num1%num2;
        System.out.print("Remainder of " + num1 + "/" + num2 + " is: " + remainder);

        fn.close();
        sn.close();
    }
}