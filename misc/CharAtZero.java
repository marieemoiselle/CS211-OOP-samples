import java.util.Scanner;
class CharAtZero {
    public static void main(String[]args){
        Scanner chValue = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch1 = chValue.next().charAt(1);
        System.out.println("Character is: " +ch1);

        chValue.close();
    }
}
