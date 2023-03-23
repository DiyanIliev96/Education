package Programming_Basics.ConditionalStatements_More_Exercises;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double litresFuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();
        double priceForFuel = 0.0;
        double priceForFuelWithDiscount = 0.0;
        double priceforFuelWithoutDiscount = 0.0;
        switch (fuelType) {
            case "Gas":
                if (clubCard.equals("Yes")) {
                    if (litresFuel >= 20 && litresFuel <= 25) {
                        priceForFuel = litresFuel * 0.93 - litresFuel * 0.08;
                        priceForFuelWithDiscount = priceForFuel - priceForFuel * 0.08;
                        System.out.printf("%.2f lv.", priceForFuelWithDiscount);
                    }
                    else if (litresFuel > 25) {
                        priceForFuel = litresFuel * 0.93 - litresFuel * 0.08;
                        priceForFuelWithDiscount = priceForFuel - priceForFuel * 0.10;
                        System.out.printf("%.2f lv.", priceForFuelWithDiscount);
                    }
                    else if (litresFuel < 20) {
                        priceForFuel = litresFuel * 0.93 - litresFuel * 0.08;
                        System.out.printf("%.2f lv.", priceForFuel);
                        break;
                    }
                }
        }
        switch (fuelType) {
            case "Gas":
                if (clubCard.equals("No")){
                    if (litresFuel >= 20 && litresFuel <= 25) {
                        priceForFuel = litresFuel * 0.93;
                        priceForFuelWithDiscount = priceForFuel - priceForFuel * 0.08;
                        System.out.printf("%.2f lv.", priceForFuelWithDiscount);
                    }
                    else if (litresFuel > 25) {
                        priceForFuel = litresFuel * 0.93;
                        priceForFuelWithDiscount = priceForFuel - priceForFuel * 0.10;
                        System.out.printf("%.2f lv.", priceForFuelWithDiscount);
                    }
                    else if (litresFuel < 20) {
                        priceforFuelWithoutDiscount = litresFuel * 0.93;
                        System.out.printf("%.2f lv.", priceforFuelWithoutDiscount);
                    }
                    break;
                }
        }
        switch (fuelType) {
            case "Gasoline":
                if (clubCard.equals("Yes")){
                    if (litresFuel >= 20 && litresFuel <= 25) {
                        priceForFuel = litresFuel * 2.22 - litresFuel * 0.18;
                        priceForFuelWithDiscount = priceForFuel - priceForFuel * 0.08;
                        System.out.printf("%.2f lv.", priceForFuelWithDiscount);
                    }
                    else if (litresFuel > 25) {
                        priceForFuel = litresFuel * 2.22 - litresFuel * 0.18;
                        priceForFuelWithDiscount = priceForFuel - priceForFuel * 0.10;
                        System.out.printf("%.2f lv.", priceForFuelWithDiscount);
                    }
                    else if (litresFuel < 20) {
                        priceForFuel = litresFuel * 2.22 - litresFuel * 0.18;
                        System.out.printf("%.2f lv.", priceForFuel);
                        break;
                    }
                }
        }
        switch (fuelType) {
            case "Gasoline":
                if (clubCard.equals("No")) {
                    if (litresFuel >= 20 && litresFuel <= 25) {
                        priceForFuel = litresFuel * 2.22;
                        priceForFuelWithDiscount = priceForFuel - priceForFuel * 0.08;
                        System.out.printf("%.2f lv.", priceForFuelWithDiscount);
                    }
                    else if (litresFuel > 25) {
                        priceForFuel = litresFuel * 2.22;
                        priceForFuelWithDiscount = priceForFuel - priceForFuel * 0.10;
                        System.out.printf("%.2f lv.", priceForFuelWithDiscount);
                    }
                    else if (litresFuel < 20) {
                        priceforFuelWithoutDiscount = litresFuel * 2.22;
                        System.out.printf("%.2f lv.", priceforFuelWithoutDiscount);
                        break;
                    }
                }
        }
        switch (fuelType) {
            case "Diesel":
                if (clubCard.equals("Yes")) {
                    if (litresFuel >= 20 && litresFuel <= 25) {
                        priceForFuel = litresFuel * 2.33 - litresFuel * 0.12;
                        priceForFuelWithDiscount = priceForFuel - priceForFuel * 0.08;
                        System.out.printf("%.2f lv.", priceForFuelWithDiscount);
                    }
                    else if (litresFuel > 25) {
                        priceForFuel = litresFuel * 2.33 - litresFuel * 0.12;
                        priceForFuelWithDiscount = priceForFuel - priceForFuel * 0.10;
                        System.out.printf("%.2f lv.", priceForFuelWithDiscount);
                    }
                    else if (litresFuel < 20) {
                        priceForFuel = litresFuel * 2.33 - litresFuel * 0.12;
                        System.out.printf("%.2f lv.", priceForFuel);
                        break;
                    }
                }
        }
        switch (fuelType) {
            case "Diesel":
                if (clubCard.equals("No")) {
                    if (litresFuel >= 20 && litresFuel <= 25) {
                        priceForFuel = litresFuel * 2.33;
                        priceForFuelWithDiscount = priceForFuel - priceForFuel * 0.08;
                        System.out.printf("%.2f lv.", priceForFuelWithDiscount);
                    }
                    else if (litresFuel > 25) {
                        priceForFuel = litresFuel * 2.33;
                        priceForFuelWithDiscount = priceForFuel - priceForFuel * 0.10;
                        System.out.printf("%.2f lv.", priceForFuelWithDiscount);
                    }
                    else if (litresFuel < 20) {
                        priceforFuelWithoutDiscount = litresFuel * 2.33;
                        System.out.printf("%.2f lv.", priceforFuelWithoutDiscount);
                        break;
                    }
                }
        }
        }
    }




