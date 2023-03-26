package Programming_Basics.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        double boatPrice = 0.0;
        boolean isValid = season.equals("Summer") || season.equals("Spring") || season.equals("Winter");
        switch (season) {
            case "Spring":
                boatPrice = 3000;
                if (fishers <= 6) {
                    boatPrice -= boatPrice * 0.10;
                } else if (fishers >7 && fishers <=11) {
                    boatPrice -= boatPrice * 0.15;
                } else if (fishers > 12) {
                    boatPrice -= boatPrice * 0.25;
                }
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                if (fishers <= 6) {
                    boatPrice -= boatPrice * 0.10;
                } else if (fishers >7 && fishers <=11) {
                    boatPrice -= boatPrice * 0.15;
                } else if (fishers > 12) {
                    boatPrice -= boatPrice * 0.25;
                }
                break;
            case "Winter":
                boatPrice = 2600;
                if (fishers <= 6) {
                    boatPrice -= boatPrice * 0.10;
                } else if (fishers >7 && fishers <=11) {
                    boatPrice -= boatPrice * 0.15;
                } else if (fishers > 12) {
                    boatPrice -= boatPrice * 0.25;
                }
                break;
        }
        if (fishers % 2 == 0 && isValid) {
            boatPrice -= boatPrice * 0.05;
        }
        double difference = Math.abs(budget - boatPrice);
        if (budget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.",difference);
        } else  {
            System.out.printf("Not enough money! You need %.2f leva.",difference);
        }
    }
}