import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the total amount of items bought
        System.out.print("Enter the total amount of items bought (in rupees): ");
        int totalAmount = scanner.nextInt();

        // Input the amount of money given by the customer
        System.out.print("Enter the amount of money given by the customer (in rupees): ");
        int moneyGiven = scanner.nextInt();

        // Calculate the change to be returned
        int change = moneyGiven - totalAmount;

        if (change < 0) {
            System.out.println("Not enough money given. Please provide sufficient payment.");
        } else {
            System.out.println("Change to be returned: " + change + " rupees");

            // Calculate and print the number of coins and notes to return
            int tenRupeeNotes = change / 10;
            change %= 10;
            int twoRupeeCoins = change / 2;

            System.out.println("Number of 10 rupee notes: " + tenRupeeNotes);
            System.out.println("Number of 2 rupee coins: " + twoRupeeCoins);
        }

        scanner.close();
    }
}
