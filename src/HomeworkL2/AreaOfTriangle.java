package HomeworkL2;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the triangle's width:");
        double width = scanner.nextDouble();

        System.out.println("Enter the triangle's height:");
        double height = scanner.nextDouble();

        double area = (width*height)/2;
        System.out.println("The area is: " + area);
    }
}
