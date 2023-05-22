package Fundamentals.Middle_Exam_Preparation;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double total = 0;
        while (true) {
            if (input.equals("special") || input.equals("regular")) {
                break;
            }
            double price = Double.parseDouble(input);
            if (price <= 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            } else {
                total += price;
            }


            input = scanner.nextLine();
        }
        double taxes = total * 0.2;

        double totalWithTaxes = total + taxes;
        if (totalWithTaxes == 0) {
            System.out.println("Invalid order!");
            return;
        }

        if (input.equals("special")) {
            totalWithTaxes -= totalWithTaxes * 0.1;
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", total);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalWithTaxes);
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", total);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalWithTaxes);
        }
    }
}
