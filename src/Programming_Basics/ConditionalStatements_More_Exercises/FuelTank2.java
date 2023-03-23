package Programming_Basics.ConditionalStatements_More_Exercises;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();
        double price = 0;
        switch (fuelType) {
            case "Gas":
                if (clubCard.equals("Yes")) {
                    price +=  0.85;
                } else {
                    price +=  0.93;
                }
                break;
            case "Gasoline":
                if (clubCard.equals("Yes")) {
                    price +=  2.04;
                } else {
                    price += 2.22;
                }
                break;
            case "Diesel":
                if (clubCard.equals("Yes")) {
                    price += 2.21;
                } else {
                    price += 2.33;
                }
                break;
        }
        double result = litres * price;
        if (litres >= 20 && litres <= 25) {
            result -= result * 0.08;
        } else if (litres > 25) {
            result -= result * 0.10;
        }
        System.out.printf("%.2f lv.",result);
    }
}