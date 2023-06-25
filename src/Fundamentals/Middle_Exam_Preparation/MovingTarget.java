package Fundamentals.Middle_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            List<String> inputCommands = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            int index = Integer.parseInt(inputCommands.get(1));
            String commandType = inputCommands.get(0);

            switch (commandType) {
                case "Shoot":
                    int power = Integer.parseInt(inputCommands.get(2));
                    if (index >= 0 && index <= targets.size() - 1) {
                        targets.set(index, targets.get(index) - power);
                        if (targets.get(index) <= 0) {
                            targets.remove(index);
                        }
                    }

                    break;

                case "Add":
                    int value = Integer.parseInt(inputCommands.get(2));
                    if (index >= 0 && index <= targets.size() - 1) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;

                case "Strike":
                    int radius = Integer.parseInt(inputCommands.get(2));

                    if (index >= 0 && index <= targets.size() - 1 && index - radius >= 0 && index + radius <= targets.size() - 1) {
                        targets.subList(index - radius, index + radius + 1).clear();
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }



            input = scanner.nextLine();
        }

        System.out.println(targets.toString().replaceAll("[\\[\\]]", "").replaceAll(", ", "|"));
    }
}
