package Programming_Basics.WhileLoop_Lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double balance = 0;
        while (!input.equals("NoMoreMoney")) {
            double currentMoney = Double.parseDouble(input);
            if (currentMoney < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", currentMoney);
            balance += currentMoney;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", balance);
    }
}
