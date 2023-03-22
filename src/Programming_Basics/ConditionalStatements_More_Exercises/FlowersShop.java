package Programming_Basics.ConditionalStatements_More_Exercises;

import java.util.Scanner;

public class FlowersShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolia = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double priceForPresent = Double.parseDouble(scanner.nextLine());
        double profit = magnolia * 3.25 + hyacinth * 4.0 + rose * 3.50 + cactus * 8.0;
        double profitWithTaxes = profit - (profit * 0.05);
        double difference = Math.abs(profitWithTaxes - priceForPresent);
        if (priceForPresent > profitWithTaxes) {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(difference));
        } else {
            System.out.printf("She is left with %.0f leva.", Math.floor(difference));
        }
    }
}
