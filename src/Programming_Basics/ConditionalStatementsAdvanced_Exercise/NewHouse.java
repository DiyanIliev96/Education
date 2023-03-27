package Programming_Basics.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        double totalPrice = 0.0;
        switch (flower) {
            case "Roses":
                totalPrice = 5 * quantity;
                if (quantity > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }
                break;
            case "Dahlias":
                totalPrice = 3.80 * quantity;
                if (quantity > 90) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Tulips":
                totalPrice = 2.80 * quantity;
                if (quantity > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Narcissus":
                totalPrice = 3 * quantity;
                if (quantity < 120) {
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;
            case "Gladiolus":
                totalPrice = 2.50 * quantity;
                if (quantity < 80) {
                    totalPrice = totalPrice + (totalPrice * 0.20);
                }
                break;
        }
        double difference = Math.abs(budget - totalPrice);
        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",quantity,flower,difference);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.",difference);
        }

    }
}
