package Programming_Basics.ConditionalStatements_More_Exercises;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lozeArea = Integer.parseInt(scanner.nextLine());
        double grapeFromSqM = Double.parseDouble(scanner.nextLine());
        int wineForSale = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double grapeForWine = lozeArea * grapeFromSqM;
        double producedWine = grapeForWine * 0.40 / 2.5;
        double difference = Math.abs(producedWine - wineForSale);
        if (producedWine >= wineForSale) {
            double wineForWorkers = difference / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n" +
                    "%.0f liters left -> %.0f liters per person.\n", Math.ceil(producedWine), Math.ceil(difference), Math.ceil (wineForWorkers));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(difference));
        }


    }
}
