import java.util.Scanner;
class CheckDigitChar{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        char digit = input.next().charAt(0);
        
        if (digit >= '0' && digit <= '9'){
            System.out.println(digit + " is a digit.");
        }
        else{
            System.out.println(digit + " is a not a digit.");
        }

        input.close();
    }
}