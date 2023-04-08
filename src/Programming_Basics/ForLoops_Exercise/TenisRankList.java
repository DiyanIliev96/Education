package Programming_Basics.ForLoops_Exercise;

import java.util.Scanner;

public class TenisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        double totalPoints = + startingPoints;
        double winnings = 0;
        for (int i = 1; i <= tournaments ; i++) {
            String etap = scanner.nextLine();
            switch (etap) {
                case "W":
                    totalPoints += 2000;
                    winnings += 1;
                    break;
                case "F":
                    totalPoints += 1200;
                    break;
                case "SF":
                    totalPoints += 720;
                    break;
            }
        }
        double winingsPercent = (winnings / tournaments) * 100;
        System.out.printf("Final points: %.0f%n", totalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor((totalPoints - startingPoints) / tournaments));
        System.out.printf("%.2f%%",winingsPercent);

    }
}
