package Programming_Basics.ConditionalStatements_More_Exercises;


import java.util.Scanner;

public class FuelTank1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        int LitresInTank = Integer.parseInt(scanner.nextLine());
        switch (fuelType) {

            case "Diesel":
                if (LitresInTank >= 25) {
                    System.out.println("You have enough diesel.");
                } else {
                    System.out.println("Fill your tank with diesel!");
                }
                break;

            case "Gasoline":
                if (LitresInTank >= 25) {
                    System.out.println("You have enough gasoline.");
                } else {
                    System.out.println("Fill your tank with gasoline!");
                }
                break;

            case "Gas":
                if (LitresInTank >= 25) {
                    System.out.println("You have enough gas.");
                } else {
                    System.out.println("Fill your tank with gas!");
                }
                break;

            default:
                System.out.println("Invalid fuel!");
                }

        }
        }




