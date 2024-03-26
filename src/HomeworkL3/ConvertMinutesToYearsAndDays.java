package HomeworkL3;

import java.util.Scanner;

public class ConvertMinutesToYearsAndDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes you would like to convert: ");
        double minutes = scanner.nextInt();

        double years = minutes*0.0000019013;
        double days = minutes/1440;
        double yearsRounded = Math.round(years);
        double daysRounded = Math.round(days);

        System.out.println(minutes + " minutes are equal to " + daysRounded + " days or " + yearsRounded + " years.");

    }
}
