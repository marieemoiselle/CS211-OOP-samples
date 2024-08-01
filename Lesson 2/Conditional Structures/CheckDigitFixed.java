import java.util.Scanner;
class CheckDigitFixed{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        char digit = input.next().charAt(0);
        if (digit == '0' || digit == '1' || digit == '2' || digit == '3' || digit == '4' || digit == '5' || digit == '6' || digit == '7' ||digit == '8' || digit == '9'){
            System.out.print(digit + " is a digit.");
        }
        else {
            System.out.println(digit + " is not a digit.");
        }

        input.close();
    }
}