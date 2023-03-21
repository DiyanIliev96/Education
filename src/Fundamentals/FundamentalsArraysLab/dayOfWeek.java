package Fundamentals.FundamentalsArraysLab;

import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] day = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        int input = Integer.parseInt(scanner.nextLine());
        if (input >= 1 && input <= 7) {
            System.out.println(day[input - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
