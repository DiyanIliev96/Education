package Programming_Basics.WhileLoop_Exercise;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int transaction = 0;
        int cash = 0;
        int card = 0;
        int cashTotal = 0;
        int cardTotal = 0;
        int cashAndCardTotal = 0;

        while (!input.equals("End")) {
            if (cashAndCardTotal >= sum) {
                break;
            }
            int productPrice = Integer.parseInt(input);
            if (transaction % 2 == 0 && productPrice <= 100) {
                cash++;
                cashTotal += productPrice;
                cashAndCardTotal += productPrice;
                System.out.println("Product sold!");
                if (cashAndCardTotal >= sum) {
                    break;
                }
                transaction++;
                input = scanner.nextLine();
                continue;
            } else if (productPrice > 100 && transaction % 2 == 0) {
                System.out.println("Error in transaction!");
                transaction++;
                input = scanner.nextLine();
                continue;
            }

            if (transaction % 2 == 1 && productPrice < 10) {
                System.out.println("Error in transaction!");
                transaction++;
                input = scanner.nextLine();

            } else if (productPrice >= 10 && transaction % 2 == 1) {
                card++;
                cardTotal += productPrice;
                cashAndCardTotal += productPrice;
                System.out.println("Product sold!");
                if (cashAndCardTotal >= sum) {
                    break;
                }
                transaction++;
                input = scanner.nextLine();
                continue;
            }
        }

        double averageCash = cashTotal * 1.0 / cash;
        double averageCard = cardTotal * 1.0 / card;
        if (cashAndCardTotal >= sum) {
            System.out.printf("Average CS: %.2f%n", averageCash);
            System.out.printf("Average CC: %.2f", averageCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}

