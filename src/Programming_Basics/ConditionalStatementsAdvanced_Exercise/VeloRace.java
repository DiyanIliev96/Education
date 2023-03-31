package Programming_Basics.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class VeloRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniors = Integer.parseInt(scanner.nextLine());
        int senior = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();
        double juniorTax = 0.0;
        double seniorTax = 0.0;
        double totalTax = 0.0;
        double moneyWon = 0.0;
        switch (trace) {
            case "trail":
                juniorTax = 5.50;
                seniorTax = 7;
                break;
            case "cross-country":
                if (senior + juniors >= 50) {
                    juniorTax = 8 - 8 * 0.25;
                    seniorTax = 9.50 - 9.50 * 0.25;
                } else {
                    juniorTax = 8;
                    seniorTax = 9.50;
                }
                break;
            case "downhill":
                juniorTax = 12.25;
                seniorTax = 13.75;
                break;
            case "road":
                juniorTax = 20;
                seniorTax = 21.50;
                break;
        }
                totalTax = juniors * juniorTax + senior * seniorTax;
                moneyWon = totalTax - totalTax * 0.05;
                System.out.printf("%.2f", moneyWon);
        }
    }

