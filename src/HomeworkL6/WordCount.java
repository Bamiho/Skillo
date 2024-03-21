package HomeworkL6;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        int count = countWords(input);
        System.out.println("Word count: " + count); // Call the method to count words and display the result
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0; // Check if the input string is null or empty
        }

        String[] words = str.split("\\s+"); // Split the string into words using whitespace as the delimiter

        return words.length;
    }
}
