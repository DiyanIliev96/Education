package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double cabrioPrice = 0.0;
        double jeepPrice = 0.0;
        switch (season) {
            case "Summer":
                if (budget <= 100) {
                    cabrioPrice = budget * 0.35;
                    System.out.println("Economy class");
                    System.out.printf("Cabrio - %.2f", cabrioPrice);
                } else if (budget > 100 && budget <= 500) {
                    cabrioPrice = budget * 0.45;
                    System.out.println("Compact class");
                    System.out.printf("Cabrio - %.2f", cabrioPrice);
                } else if (budget > 500) {
                    jeepPrice = budget * 0.90;
                    System.out.println("Luxury class");
                    System.out.printf("Jeep - %.2f", jeepPrice);
                }
                break;
            case "Winter":
                if (budget <= 100) {
                    jeepPrice = budget * 0.65;
                    System.out.println("Economy class");
                    System.out.printf("Jeep - %.2f", jeepPrice);
                } else if (budget >100 && budget <= 500) {
                    jeepPrice = budget * 0.80;
                    System.out.println("Compact class");
                    System.out.printf("Jeep - %.2f", jeepPrice);
                } else if (budget > 500) {
                    jeepPrice = budget * 0.90;
                    System.out.println("Luxury class");
                    System.out.printf("Jeep - %.2f",jeepPrice);
                }

            }
        }
    }

