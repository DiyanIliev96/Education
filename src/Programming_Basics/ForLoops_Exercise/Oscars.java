package Programming_Basics.ForLoops_Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actor = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        double actorPoints = 0;
        double actorTotalPoints = actorPoints + pointsFromAcademy;
        int jury = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= jury; i++) {
            String juryName = scanner.nextLine();
            double pointsFromJury = Double.parseDouble(scanner.nextLine());

            actorPoints = (juryName.length() * pointsFromJury) / 2;
            actorTotalPoints += actorPoints;
            if (actorTotalPoints >= 1250.5) {
                break;
            }
        }
        if (actorTotalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor , actorTotalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!",actor , 1250.5 - actorTotalPoints);
        }
    }
}
