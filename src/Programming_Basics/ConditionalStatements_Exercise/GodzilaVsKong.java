package Programming_Basics.ConditionalStatements_Exercise;

import java.util.Scanner;

public class GodzilaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double OneToiletPrice = Double.parseDouble(scanner.nextLine());
        double decorePrice = budget * 0.10;
        double priceStatistsToilet = statists * OneToiletPrice;
        if (statists > 150) {
            priceStatistsToilet = priceStatistsToilet - priceStatistsToilet * 0.10;
        }
        double priceForMovie = decorePrice + priceStatistsToilet;
        if (priceForMovie <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - priceForMovie);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", priceForMovie - budget);
        }

    }
}
