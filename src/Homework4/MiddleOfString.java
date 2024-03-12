package Homework4;

import java.util.Scanner;

public class MiddleOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        displayMiddleCharacter(input); // Call the method to display the middle character(s)
    }

    public static void displayMiddleCharacter(String str) {
        int length = str.length();
        int middle = length / 2; // Method to display the middle character(s) of a string

        if (length % 2 == 0) {
            System.out.println("Middle characters: " + str.charAt(middle - 1) + ", " + str.charAt(middle));
        } else {
            System.out.println("Middle character: " + str.charAt(middle)); // Check if the length is even or odd and display accordingly
        }
    }
}