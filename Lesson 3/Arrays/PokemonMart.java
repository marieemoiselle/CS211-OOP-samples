import java.util.*;

public class PokemonMart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input total and payment
        System.out.print("Enter total: ");
        int total = sc.nextInt();

        System.out.print("Your payment: ");
        int payment = sc.nextInt();

        if (payment < total) {
            System.out.println("You don't have enough money.");
        } else if (payment == total) {
            System.out.println("Thank you for shopping!");
        } else {
            int change = payment - total;
            System.out.println("Your change is " + change + ". Here's your change:");

            // Denominations in descending order
            int[] denominations = {1000, 500, 200, 100, 50, 20, 10, 5, 1};
            String[] labels = {
                "1000-peso bill", "500-peso bill", "200-peso bill",
                "100-peso bill", "50-peso bill", "20-peso coin",
                "10-peso coin", "5-peso coin", "1-peso coin"
            };

            for (int i = 0; i < denominations.length; i++) {
                int count = change / denominations[i];  // how many of this denom
                change %= denominations[i];            // reduce remaining change

                if (count > 0) {
                    System.out.println(count + " " + labels[i]);
                }
            }
        }
        sc.close();
    }
}