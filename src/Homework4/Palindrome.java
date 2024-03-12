package Homework4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        int originalNumber, number, reversedNumber = 0, remainder;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number: ");
        number = scanner.nextInt();
        originalNumber = number;

        while (number > 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
