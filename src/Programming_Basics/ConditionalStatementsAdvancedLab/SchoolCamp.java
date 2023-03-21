package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double priceNight = 0.0;
        String sport = null;
        switch (groupType) {
            case "boys":
                if (season.equals("Winter")) {
                    sport = "Judo";
                    priceNight = 9.60;
                } else if (season.equals("Spring")) {
                    sport = "Tennis";
                    priceNight =7.20;
                } else if (season.equals("Summer")) {
                    sport = "Football";
                    priceNight = 15.0;
                }
                break;
            case "girls":
                if (season.equals("Winter")) {
                   sport = "Gymnastics";
                    priceNight = 9.60;
                } else if (season.equals("Spring")) {
                    sport = "Athletics";
                    priceNight = 7.20;
                } else if (season.equals("Summer")) {
                    sport = "Volleyball";
                    priceNight = 15;
                }
                break;
            case "mixed":
                if (season.equals("Winter")) {
                    sport = "Ski";
                    priceNight = 10;
                } else if (season.equals("Spring")) {
                    sport = "Cycling";
                    priceNight = 9.50;
                } else if (season.equals("Summer")) {
                    sport = "Swimming";
                    priceNight = 20;
                }
                break;
        }
        double vacationPrice = nights * priceNight * students;
        if (students >= 50) {
            vacationPrice = vacationPrice - vacationPrice * 0.50;
        } else if (students >= 20) {
            vacationPrice = vacationPrice - vacationPrice * 0.15;
        } else if (students >= 10) {
            vacationPrice = vacationPrice - vacationPrice * 0.05;
        }
        System.out.printf("%s %.2f lv.",sport,vacationPrice);
    }
}
