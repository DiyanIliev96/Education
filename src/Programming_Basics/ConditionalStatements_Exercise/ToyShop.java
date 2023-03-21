package Programming_Basics.ConditionalStatements_Exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ToyShop {
    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int numberPuzzles = Integer.parseInt(scanner.nextLine());
        int numberDolls = Integer.parseInt(scanner.nextLine());
        int numberBears = Integer.parseInt(scanner.nextLine());
        int numberMinions = Integer.parseInt(scanner.nextLine());
        int numberTrucks = Integer.parseInt(scanner.nextLine());
        int totalNumbers = numberPuzzles + numberDolls + numberBears + numberMinions + numberTrucks;
        //double profit = numberPuzzles * 2.60 + numberDolls * 3 + numberBears * 4.10 + numberMinions * 8.20 + numberTrucks * 2;
        double puzzlePrice = numberPuzzles * 2.60;
        double dollsPrice = numberDolls * 3;
        double bearsPrice = numberBears * 4.10;
        double minionsPrice = numberMinions * 8.20;
        double trucksPrice = numberTrucks * 2;
        double profit = puzzlePrice + dollsPrice + bearsPrice + minionsPrice + trucksPrice;
        if (totalNumbers >= 50) {
            profit = profit - (profit * 0.25);
        }
        double totalProfit = profit - (profit * 0.10);
        if (totalProfit >= holidayPrice) {
            System.out.printf("Yes! %.2f lv left.", totalProfit - holidayPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed." , holidayPrice - totalProfit);
        }

    }
}
