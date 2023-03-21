package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double alaskaPrice = 0.0;
        double moroccoPrice = 0.0;
        switch (season) {
            case "Summer":
                if (budget <= 1000) {
                    alaskaPrice = budget * 0.65;
                    System.out.printf("Alaska - Camp - %.2f", alaskaPrice);
                } else if (budget > 1000 && budget <= 3000) {
                    alaskaPrice = budget * 0.80;
                    System.out.printf("Alaska - Hut - %.2f", alaskaPrice);
                } else if (budget > 3000) {
                    alaskaPrice = budget * 0.90;
                    System.out.printf("Alaska - Hotel - %.2f", alaskaPrice);
                }
                break;
            case "Winter":
                if (budget <= 1000) {
                    moroccoPrice = budget * 0.45;
                    System.out.printf("Morocco - Camp - %.2f",moroccoPrice);
                } else if (budget > 1000 && budget <= 3000) {
                    moroccoPrice = budget * 0.60;
                    System.out.printf("Morocco - Hut - %.2f", moroccoPrice);
                } else if (budget > 3000) {
                    moroccoPrice = budget * 0.90;
                    System.out.printf("Morocco - Hotel - %.2f", moroccoPrice);
                }
        }
    }
}
