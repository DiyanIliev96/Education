package Programming_Basics.ForrLoops_More_Exercise;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        double sectorA = 0;
        double sectorB = 0;
        double sectorV = 0;
        double sectorG = 0;
        for (int i = 1; i <= fans; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    sectorA += 1;
                    break;
                case "B":
                    sectorB += 1;
                    break;
                case "V":
                    sectorV += 1;
                    break;
                case "G":
                    sectorG += 1;
                    break;
            }
        }
        double percentInA = sectorA / fans * 100;
        double percentInB = sectorB / fans * 100;
        double percentInV = sectorV / fans * 100;
        double percentInG = sectorG / fans * 100;
        double percentFans = fans * 1.0 / capacity * 1.0 * 100;
        System.out.printf("%.2f%%%n", percentInA);
        System.out.printf("%.2f%%%n", percentInB);
        System.out.printf("%.2f%%%n", percentInV);
        System.out.printf("%.2f%%%n", percentInG);
        System.out.printf("%.2f%%", percentFans);
    }
}
