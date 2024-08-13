import java.util.Scanner;

public class DiscountCalculator {
    
    // Constants for discount rates
    private static final double HIGH_DISCOUNT_RATE = 0.10;
    private static final double LOW_DISCOUNT_RATE = 0.05;
    
    // Function to calculate the discount and final price
    public static double[] calculateDiscount(double totalAmount) {
        double discountRate;
        if (totalAmount > 5000) {
            discountRate = HIGH_DISCOUNT_RATE;
        } else {
            discountRate = LOW_DISCOUNT_RATE;
        }
        
        double discount = totalAmount * discountRate;
        double finalPrice = totalAmount - discount;
        
        return new double[]{discount, finalPrice};
    }
    
    // Main program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the total purchase amount
        System.out.print("Enter the total purchase amount: ");
        double totalAmount = scanner.nextDouble();
        
        // Calculate the discount and final price
        double[] results = calculateDiscount(totalAmount);
        double discount = results[0];
        double finalPrice = results[1];
        
        // Print the results with two decimal places
        System.out.printf("Initial Purchase Amount: %.2f%n", totalAmount);
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("Final Price: %.2f%n", finalPrice);
        
        scanner.close();
    }
}
