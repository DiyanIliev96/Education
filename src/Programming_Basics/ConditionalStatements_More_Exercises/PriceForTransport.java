package Programming_Basics.ConditionalStatements_More_Exercises;

import java.util.Scanner;

public class PriceForTransport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kmToTravel = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        if (kmToTravel < 20 && dayOrNight.equals("day") ) {
            double priceForTravelDayTaxi = kmToTravel * 0.79 + 0.70;
            System.out.printf("%.2f", priceForTravelDayTaxi);
        } if (kmToTravel < 20 && dayOrNight.equals("night")) {
            double priceForTravelNightTaxi = kmToTravel * 0.90 + 0.70;
            System.out.printf("%.2f", priceForTravelNightTaxi);
        } if (kmToTravel >= 20 && kmToTravel < 100 && dayOrNight.equals("day")) {
            double priceForTravelDayTaxi = kmToTravel * 0.79 + 70;
            double priceForTravelDayBus = kmToTravel * 0.09;
            System.out.printf("%.2f", Math.min(priceForTravelDayBus, priceForTravelDayTaxi));
        } if (kmToTravel >= 20 && kmToTravel < 100 && dayOrNight.equals("night")) {
            double priceForTravelNightBus = kmToTravel * 0.09;
            double priceForTravelNightTaxi = kmToTravel * 0.90 + 0.70;
            System.out.printf("%.2f", Math.min(priceForTravelNightBus, priceForTravelNightTaxi));
        }
        if (kmToTravel >= 100 && dayOrNight.equals("day")) {
            double priceForTravelDayTrain = kmToTravel * 0.06;
            double priceForTravelDayTaxi = kmToTravel * 0.79 + 0.70;
            double priceForTravelDayBus = kmToTravel * 0.09;
            System.out.printf("%.2f", Math.min(priceForTravelDayBus ,Math.min(priceForTravelDayTrain, priceForTravelDayTaxi)));
        } if (kmToTravel >= 100 && dayOrNight.equals("night")) {
            double priceForTravelNightTrain = kmToTravel * 0.06;
            double priceForTravelNightBus = kmToTravel * 0.09;
            double priceForTravelNightTaxi = kmToTravel * 0.90 + 70;
            System.out.printf("%.2f", Math.min(priceForTravelNightTrain, Math.min(priceForTravelNightBus , priceForTravelNightTaxi)));
        }
    }
}
