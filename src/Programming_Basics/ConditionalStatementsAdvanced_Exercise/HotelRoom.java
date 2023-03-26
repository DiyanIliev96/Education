package Programming_Basics.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;
        double priceApartament = 0;
        switch (month) {
            case "May":
            case "October":
                priceStudio = nights * 50;
                priceApartament = nights * 65;
                if (nights > 7 && nights < 14) {
                    priceStudio -= priceStudio * 0.05;
                } else if (nights > 14) {
                    priceStudio -= priceStudio * 0.30;
                }
                break;
            case "June":
            case "September":
                priceStudio = 75.20 * nights;
                priceApartament = 68.70 * nights;
                if (nights > 14) {
                    priceStudio -= priceStudio * 0.20;
                }
                break;
            case "July":
            case "August":
                priceStudio = nights * 76;
                priceApartament = nights * 77;
                break;
        }
        if (nights > 14) {
            priceApartament -= priceApartament * 0.10;
        }
        System.out.printf("Apartment: %.2f lv. \n",priceApartament);
        System.out.printf("Studio: %.2f lv.",priceStudio);
    }
}
