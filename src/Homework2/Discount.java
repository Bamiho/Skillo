package Homework2;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        int price = scanner.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        if (price < 100) {
            System.out.println("The revenue is: " + (price * quantity));
            System.out.println("The discount is 0%.");
        } else if (price >= 100 && price <= 120) {
            double discountAmount1 = 0.15 * price; // Calculate 15% of the price
            double discountedPrice = price - discountAmount1; // Calculate discounted price
            System.out.println("The revenue is: " + (price * quantity));
            System.out.println("The discount is: " + (discountAmount1 * quantity));
        } else if (price > 120) {
            double discountAmount2 = 0.20 * price; // Calculate 20% of the price
            double discountedPrice2 = price - discountAmount2; // Calculate discounted price
            System.out.println("The revenue is: " + (price * quantity));
            System.out.println("The discount is: " + (discountAmount2 * quantity));
        }

        scanner.close();
    }
}
