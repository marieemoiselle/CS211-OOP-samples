import java.util.Scanner;

class NestedIfElse {
    public static void main(String [] args){
        int num = 0;
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = inputNum.nextInt();
        if (num >= 0){
            if (num % 2 == 0){
                System.out.println(num + " is an even number.");
            }
            else {
                System.out.println(num + " is an odd number.");
            }
        }
        else {
            System.out.println("The number is a negative number.");
        }
        inputNum.close();
    }
}
