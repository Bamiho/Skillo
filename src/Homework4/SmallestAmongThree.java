package Homework4;

import java.util.Scanner;

public class SmallestAmongThree {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter three numbers:");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();

            double smallest = findSmallest(num1, num2, num3);

            System.out.println("The smallest number is: " + smallest);

            scanner.close();
        }

        public static double findSmallest(double num1, double num2, double num3) {
            return Math.min(Math.min(num1, num2), num3);
        }
    }
