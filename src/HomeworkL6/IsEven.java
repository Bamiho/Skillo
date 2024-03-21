package HomeworkL6;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number.");

        int num = scanner.nextInt(); // Use the 'scanner' object to read an integer input
        boolean result = isEven(num);
        System.out.println("Is " + num + " even? " + result);
    }

    public static boolean isEven(int num) {
        // Check if the remainder when divided by 2 is 0
        return num % 2 == 0;
    }
}