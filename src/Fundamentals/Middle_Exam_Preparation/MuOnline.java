package Fundamentals.Middle_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        int health = 100;
        int bitcoins = 0;

        for (int i = 0; i <= rooms.size() -1 ; i++) {
            List<String> currentEl = Arrays.stream(rooms.get(i).split(" ")).collect(Collectors.toList());

            String command = currentEl.get(0);
            int value = Integer.parseInt(currentEl.get(1));

            if (command.equals("potion")) {
                if (health + value > 100) {
                    System.out.printf("You healed for %d hp.%n", 100 - health);
                    health = 100;
                } else {
                    health += value;
                    System.out.printf("You healed for %d hp.%n", value);
                }

                System.out.printf("Current health: %d hp.%n", health);
            } else if (command.equals("chest")) {
                System.out.printf("You found %d bitcoins.%n", value);
                bitcoins += value;
            } else {
                health -= value;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", command);
                } else {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d", i + 1);
                    return;
                }
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n",bitcoins);
        System.out.printf("Health: %d", health);
    }
}
