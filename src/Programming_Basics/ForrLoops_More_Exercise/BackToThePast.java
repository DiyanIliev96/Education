package Programming_Basics.ForrLoops_More_Exercise;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ivanYears = 17;
        double legacyMoney = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());
        for (int i = 1800; i <=yearToLive ; i++) {
            if (i % 2 == 0) {
                ivanYears += 1;
                legacyMoney -= 12000;
            } else {
                ivanYears += 1;
                legacyMoney -= 12000 + 50 * ivanYears;
            }
        }
        if (legacyMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", legacyMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(legacyMoney));
        }
    }
}
