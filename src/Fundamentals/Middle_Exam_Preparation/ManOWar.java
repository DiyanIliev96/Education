package Fundamentals.Middle_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShipStatus = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> warShipStatus = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxHealth = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Retire")) {
            List<String> commands = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String type = commands.get(0);
            int damage = 0;
            int index = 0;
            switch (type) {
                case "Fire":
                index = Integer.parseInt(commands.get(1));
               damage = Integer.parseInt(commands.get(2));

                if (index >= 0 && index <= warShipStatus.size() - 1) {
                    warShipStatus.set(index, warShipStatus.get(index) - damage);
                }
                for (int current: warShipStatus) {
                    if (current <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    }
                }
                    break;

                case "Defend":
                int startIndex = Integer.parseInt(commands.get(1));
                int endIndex = Integer.parseInt(commands.get(2));
                damage = Integer.parseInt(commands.get(3));
                if (startIndex >= 0 && startIndex <= pirateShipStatus.size() - 1 && endIndex >= 0 && endIndex <= pirateShipStatus.size() - 1) {
                    for (int i = startIndex; i <= endIndex ; i++) {
                        pirateShipStatus.set(i, pirateShipStatus.get(i) - damage);
                    }
                }
                for (int current: pirateShipStatus) {
                    if (current <= 0) {
                        System.out.println("You lost! The pirate ship has sunken.");
                        return;
                    }
                }
                    break;
                case "Repair":
                    index = Integer.parseInt(commands.get(1));
                    int health = Integer.parseInt(commands.get(2));
                    if (index >= 0 && index <= pirateShipStatus.size() - 1) {
                      pirateShipStatus.set(index, pirateShipStatus.get(index) + health);
                        if (pirateShipStatus.get(index) > maxHealth) {
                            pirateShipStatus.set(index, maxHealth);
                        }
                    }
                    break;

                case "Status":
                int repair = 0;
                double needRepair = maxHealth * 0.2;
                    for (int i = 0; i <= pirateShipStatus.size() - 1 ; i++) {
                        if (pirateShipStatus.get(i) < needRepair) {
                            repair++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n",repair);
                    break;
            }
            input = scanner.nextLine();
        }
        int sumPirate = 0;
        for (int i = 0; i <= pirateShipStatus.size() - 1 ; i++) {
            sumPirate += pirateShipStatus.get(i);
        }
        int sumWar = 0;
        for (int i = 0; i <= warShipStatus.size() - 1 ; i++) {
            sumWar += warShipStatus.get(i);
        }
        System.out.printf("Pirate ship status: %d%n", sumPirate);
        System.out.printf("Warship status: %d", sumWar);
    }
}
