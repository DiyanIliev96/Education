package ConditionalStatementsAdvancedLab;


import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysantemumQuantity = Integer.parseInt(scanner.nextLine());
        int roseQuantity = Integer.parseInt(scanner.nextLine());
        int tulipsQuantity = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double chrysantemumPrice = 0.0;
        double rosePrice = 0.0;
        double tulipsPrice = 0.0;
        double bouquetPrice = 0.0;
        int buyedFlowers = chrysantemumQuantity + roseQuantity + tulipsQuantity;
        switch (season) {
            case "Spring":
                chrysantemumPrice += 2;
                rosePrice += 4.10;
                tulipsPrice += 2.50;
                if (holiday.equals("Y")) {
                    chrysantemumPrice = 2 + 2 * 0.15;
                    rosePrice = 4.10 + 4.10 * 0.15;
                    tulipsPrice = 2.50 + 2.50 * 0.15;
                }
                break;
            case "Summer":
                chrysantemumPrice += 2;
                rosePrice += 4.10;
                tulipsPrice += 2.50;
                if (holiday.equals("Y")) {
                    chrysantemumPrice = 2 + 2 * 0.15;
                    rosePrice = 4.10 + 4.10 * 0.15;
                    tulipsPrice = 2.50 + 2.50 * 0.15;
                }
                break;
            case "Winter":
                chrysantemumPrice += 3.75;
                rosePrice += 4.50;
                tulipsPrice += 4.15;
                if (holiday.equals("Y")){
                    chrysantemumPrice = 3.75 + 3.75 * 0.15;
                    rosePrice = 4.50 + 4.50 * 0.15;
                    tulipsPrice = 4.15 + 4.15 * 0.15;
                }
                break;
            case "Autumn":
                chrysantemumPrice += 3.75;
                rosePrice += 4.50;
                tulipsPrice += 4.15;
                if (holiday.equals("Y")){
                    chrysantemumPrice = 3.75 + 3.75 * 0.15;
                    rosePrice = 4.50 + 4.50 * 0.15;
                    tulipsPrice = 4.15 + 4.15 * 0.15;
                    break;
                }
        }
        bouquetPrice = chrysantemumPrice * chrysantemumQuantity + rosePrice * roseQuantity + tulipsPrice * tulipsQuantity;
        if (season.equals("Spring") && tulipsQuantity > 7) {
            bouquetPrice = bouquetPrice - bouquetPrice * 0.05;
        } else if (season.equals("Winter") && roseQuantity >= 10) {
            bouquetPrice = bouquetPrice - bouquetPrice * 0.10;
        } if (buyedFlowers > 20) {
            bouquetPrice -= bouquetPrice * 0.20 ;
        }
            System.out.printf("%.2f", bouquetPrice + 2);
    }
}
