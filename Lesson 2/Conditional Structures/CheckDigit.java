import java.util.Scanner;
class CheckDigit{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        char digit = input.next().charAt(0);

        if (digit == '0'){
            System.out.println(digit + " is a digit.");
        }
        else if(digit == '1'){
            System.out.println(digit + " is a digit.");
        }
        else if(digit == '2'){
            System.out.println(digit + " is a digit.");
        }
        else if(digit == '3'){
            System.out.println(digit + " is a digit.");
        }
        else if(digit == '4'){
            System.out.println(digit + " is a digit.");
        }
        else if(digit == '5'){
            System.out.println(digit + " is a digit.");
        }
        else if(digit == '6'){
            System.out.println(digit + " is a digit.");
        }
        else if(digit == '7'){
            System.out.println(digit + " is a digit.");
        }
        else if(digit == '8'){
            System.out.println(digit + " is a digit.");
        }
        else if(digit == '9'){
            System.out.println(digit + " is a digit.");
        }
        else {
            System.out.println(digit + " is not a digit.");
        }

        input.close();
    }
}