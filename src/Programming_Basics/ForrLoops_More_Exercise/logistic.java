package Programming_Basics.ForrLoops_More_Exercise;

import java.util.Scanner;

public class logistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cargoQuantity = Integer.parseInt(scanner.nextLine());
        int tonsWithBus = 0;
        int tonsWithTruck = 0;
        int tonsWithTrain = 0;
        for (int i = 1; i <= cargoQuantity ; i++) {
            int cargoTons = Integer.parseInt(scanner.nextLine());
            if (cargoTons <= 3) {
                tonsWithBus += cargoTons;
            } else if (cargoTons >= 4 && cargoTons <= 11) {
                tonsWithTruck += cargoTons;
            } else if (cargoTons >= 12) {
                tonsWithTrain += cargoTons;
            }
        }
        int totalTons = tonsWithBus + tonsWithTruck + tonsWithTrain;
        double avarageTonPrice = (tonsWithBus * 1.0 * 200 + tonsWithTruck * 1.0 * 175 + tonsWithTrain * 1.0 * 120) / totalTons;
        System.out.printf("%.2f%n", avarageTonPrice);
        System.out.printf("%.2f%%%n",tonsWithBus * 1.0 / totalTons * 100);
        System.out.printf("%.2f%%%n",tonsWithTruck * 1.0 / totalTons * 100);
        System.out.printf("%.2f%%",tonsWithTrain * 1.0 / totalTons * 100);
    }
}
