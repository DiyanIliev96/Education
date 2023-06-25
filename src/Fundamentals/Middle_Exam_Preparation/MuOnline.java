package Fundamentals.Middle_Exam_Preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = scanner.nextLine();
        List<String> dungeonRooms = Arrays.stream(commands.split("\\|+")).collect(Collectors.toList());

        int health = 100;
        int bitcoins = 0;
        boolean isFinish = true;
        for (int i = 0; i <= dungeonRooms.size() - 1 ; i++) {
            List<String> commandsInput = Arrays.stream(dungeonRooms.get(i).split(" ")).collect(Collectors.toList());
            String type = commandsInput.get(0);
            int amount = Integer.parseInt(commandsInput.get(1));
            if (type.equals("potion")) {

                if (health + amount > 100) {
                    amount = 100 - health;
                    health = 100;
                } else {
                    health += amount;
                }
                System.out.printf("You healed for %d hp.%n", amount);
                System.out.printf("Current health: %d hp.%n", health);
            } else if (type.equals("chest")) {
                bitcoins += amount;
                System.out.printf("You found %d bitcoins.%n", amount);
            } else {
                health -= amount;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", type);
                } else {
                    System.out.printf("You died! Killed by %s.%n",type);
                    System.out.printf("Best room: %d", i + 1);
                    return;
                }
            }
        }
        System.out.printf("You've made it!%n");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d", health);
    }
}
