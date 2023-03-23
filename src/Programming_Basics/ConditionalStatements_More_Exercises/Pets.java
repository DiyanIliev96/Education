package Programming_Basics.ConditionalStatements_More_Exercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int leftFoodKg = Integer.parseInt(scanner.nextLine());
        double foodPerDayForDogInKg = Double.parseDouble(scanner.nextLine());
        double foodPerDayForCatInKg = Double.parseDouble(scanner.nextLine());
        double foodPerDayForTurtleInGrams = Double.parseDouble(scanner.nextLine());
        double needFoodPerDayForDog = days * foodPerDayForDogInKg;
        double needFoodPerDayForCat = days * foodPerDayForCatInKg;
        double needFoodPerDayForTurtle = days * foodPerDayForTurtleInGrams / 1000;
        double totalFoodNeed = needFoodPerDayForCat + needFoodPerDayForDog + needFoodPerDayForTurtle;
        double difference = Math.abs(totalFoodNeed - leftFoodKg);
        if (totalFoodNeed <= leftFoodKg) {
            System.out.printf("%.0f kilos of food left.", Math.floor(difference));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(difference));
        }

    }
}
