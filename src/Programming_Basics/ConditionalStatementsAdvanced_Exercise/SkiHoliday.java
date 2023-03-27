package Programming_Basics.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class SkiHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine()) - 1;
        String type = scanner.nextLine();
        String grade = scanner.nextLine();
        double totalPrice = 0;
        double room = 18.00;
        double apartment = 25.00;
        double presidentApartment = 35.00;
        switch (type) {
            case "room for one person":
                totalPrice = room * days;
                break;
            case "apartment":
                if (days < 10) {
                    totalPrice = apartment * days;
                    totalPrice -= totalPrice * 0.30;
                } else if (days >= 10 && days < 15) {
                    totalPrice = apartment * days;
                    totalPrice -= totalPrice * 0.35;
                } else {
                    totalPrice = apartment * days;
                    totalPrice -= totalPrice * 0.50;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    totalPrice = presidentApartment * days;
                    totalPrice -= totalPrice * 0.10;
                } else if (days >= 10 && days < 15) {
                    totalPrice = presidentApartment * days;
                    totalPrice -= totalPrice * 0.15;
                } else {
                    totalPrice = presidentApartment * days;
                    totalPrice -= totalPrice * 0.20;
                }
                break;
        }
              if (grade.equals("positive")) {
                  totalPrice += totalPrice * 0.25;
              } else if (grade.equals("negative")) {
                  totalPrice -= totalPrice * 0.10;
              }
        System.out.printf("%.2f",totalPrice);
    }
}