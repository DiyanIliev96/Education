package Programming_Basics.ConditionalStatements_More_Exercises;

import java.util.Scanner;

public class SleepingTom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int breakingDays = Integer.parseInt(scanner.nextLine());
        int breakingDaysPlayTime = breakingDays * 127;
        int workDaysPlayTime = (365 - breakingDays) * 63;
        int totalPlayTime = breakingDaysPlayTime + workDaysPlayTime;
        int difference = 30000 - (breakingDaysPlayTime + workDaysPlayTime);
        int hours = difference / 60;
        int minutes = difference % 60;
        int difference1 = totalPlayTime - 30000;
        int hours1 = difference1 / 60;
        int minutes1 = difference1 % 60;
        if (30000 > totalPlayTime) {
            System.out.println("Tom sleeps well");
            System.out.println((hours + " hours and " + minutes + " minutes less for play"));
        }
         if (totalPlayTime > 30000) {
            System.out.println("Tom will run away");
            System.out.println(hours1 + " hours and " + minutes1 + " minutes more for play");
        }





    }
}
