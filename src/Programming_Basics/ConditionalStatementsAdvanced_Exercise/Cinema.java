package Programming_Basics.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double profit = 0.0;
        switch (type) {
            case "Premiere":
                profit = r * c * 12.00;
                break;
            case "Normal":
                profit = r * c * 7.50;
                break;
            case "Discount":
                profit = r * c * 5.00;
                break;
        }
        System.out.printf("%.2f", profit);
    }
}
