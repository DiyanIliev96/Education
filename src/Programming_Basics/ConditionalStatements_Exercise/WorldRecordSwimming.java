package Programming_Basics.ConditionalStatements_Exercise;

import java.util.Scanner;

public class WorldRecordSwimming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSecFor1m = Double.parseDouble(scanner.nextLine());
        double timeToSwim = distance * timeInSecFor1m;
        double slowdown = Math.floor(distance / 15);
        double slowdown1 = (slowdown * 12.5);
        double totalTime = timeToSwim + slowdown1;
        if (totalTime >= record) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - record);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", (totalTime));
        }
    }
}
