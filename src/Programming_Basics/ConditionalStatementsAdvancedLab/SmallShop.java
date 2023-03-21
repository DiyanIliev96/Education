package ConditionalStatementsAdvancedLab;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        switch (product) {
            case "coffee":
                if (town.equals("Sofia")) {
                    price += 0.50;
                } else if (town.equals("Plovdiv")) {
                    price += 0.40;
                } else if (town.equals("Varna")) {
                    price += 0.45;
                } System.out.printf("%.1f", price  * quantity);
                break;
            case "water":
                if (town.equals("Sofia")) {
                    price += 0.80;
                } else if (town.equals("Plovdiv")) {
                    price += 0.70;
                } else if (town.equals("Varna")) {
                    price += 0.70;
                } System.out.printf("%.1f", price  * quantity);
                break;
            case "beer":
                if (town.equals("Sofia")) {
                    price += 1.20;
                } else if (town.equals("Plovdiv")) {
                    price += 1.15;
                } else if (town.equals("Varna")) {
                    price += 1.10;
                } System.out.printf("%.1f", price  * quantity);
                break;
            case "sweets":
                if (town.equals("Sofia")) {
                    price += 1.45;
                } else if (town.equals("Plovdiv")) {
                    price += 1.30;
                } else if (town.equals("Varna")) {
                    price += 1.35;
                }
                System.out.printf("%.4f", price * quantity);
                break;
            case "peanuts":
                if (town.equals("Sofia")) {
                    price += 1.60;
                } else if (town.equals("Plovdiv")) {
                    price += 1.50;
                } else if (town.equals("Varna")) {
                    price += 1.55;
                } System.out.printf("%.1f", price  * quantity);
                    break;

        }
    }
}
