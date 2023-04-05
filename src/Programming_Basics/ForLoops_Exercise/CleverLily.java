package Programming_Basics.ForLoops_Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washMachine = Double.parseDouble(scanner.nextLine());
        int priceForToy = Integer.parseInt(scanner.nextLine());
        int toyQuantity = 0;
        double moneyFromBd = 0;
        double sumMoney = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneyFromBd += 10;
                sumMoney += moneyFromBd;
                sumMoney -= 1;
            } else {
                toyQuantity += 1;
            }
        }
        double earnMoneyFromToy = toyQuantity * priceForToy;
        double totalMoney = sumMoney + earnMoneyFromToy;
        if (totalMoney >= washMachine) {
            System.out.printf("Yes! %.2f", totalMoney - washMachine);
        } else {
            System.out.printf("No! %.2f", Math.abs(totalMoney - washMachine));
        }
    }
}
