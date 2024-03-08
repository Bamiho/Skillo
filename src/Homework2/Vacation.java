package Homework2;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner destinationScanner = new Scanner(System.in);
        System.out.println("Enter the type of destination that you prefer (beach or mountain): ");
        String destination = destinationScanner.nextLine();
        if (!destination.equals("beach") && !destination.equals("mountain") && !destination.equals("Beach")&& !destination.equals("Mountain")){
            System.out.println("Invalid value!");}

        Scanner daysScanner = new Scanner(System.in);
            System.out.println("Enter the desired number of days for your vacation:");
            int days = daysScanner.nextInt();

         Scanner numberOfPeopleScanner = new Scanner(System.in);
            System.out.println("Enter the number of people going: ");
            int numberOfPeople = numberOfPeopleScanner.nextInt();

        Scanner budgetScanner = new Scanner(System.in);
        System.out.println("Enter your budget: ");
        int budget = budgetScanner.nextInt();

            int budgetPerDay = budget/days;

            if ((budget < 50) && (destination.equals("beach") || (destination.equals("Beach")))){
                System.out.println("We recommend a vacation in Bulgaria.");}

                else if ((budget > 50) && (destination.equals("beach") || (destination.equals("Beach")))){
                    System.out.println("We recommend a vacation outside Bulgaria.");
        }

        }
}
