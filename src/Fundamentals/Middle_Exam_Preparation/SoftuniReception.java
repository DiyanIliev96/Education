package Fundamentals.Middle_Exam_Preparation;

import java.util.Scanner;

public class SoftuniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmploy = Integer.parseInt(scanner.nextLine());
        int secondEmploy = Integer.parseInt(scanner.nextLine());
        int thirdEmploy = Integer.parseInt(scanner.nextLine());
        int totalEff = firstEmploy + secondEmploy + thirdEmploy;
        int students = Integer.parseInt(scanner.nextLine());

        int hours = 1;

        while (students > 0) {
            if (hours % 4 == 0) {
                hours++;
                continue;
            } else {
                students -= totalEff;
                hours++;
            }

        }
        System.out.printf("Time needed: %dh.", hours - 1);
    }
}
