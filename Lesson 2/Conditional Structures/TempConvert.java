import java.util.Scanner;

class TempConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Enter a Celsius value: ");
            double cel = input.nextDouble();
            double fah = (cel * 9 / 5) + 32;
            System.out.println(String.format("%.2f Celsius is %.2f Fahrenheit", cel, fah));
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } finally {
            input.close();
        }
    }
}
