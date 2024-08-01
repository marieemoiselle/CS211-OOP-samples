import java.util.Scanner;
public class DigitCount {

    public static void main(String[] args) {
        int digits = 0;
        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        while(value > 0){
            digits++;
            value = value/10;
        }

        System.out.print("Number of digits in the given number is: " +digits);
        input.close();
    }
}