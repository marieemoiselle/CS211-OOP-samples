import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Enter a year: ");
            int year = input.nextInt();

            if (year % 400 == 0) {
                System.out.println("Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } finally {
            input.close();
        }
    }
}
