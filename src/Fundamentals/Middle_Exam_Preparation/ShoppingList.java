package Fundamentals.Middle_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemsList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            List<String> inputCommands = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = inputCommands.get(0);
            String item = "";
            switch (command) {
                case "Urgent":
                item = inputCommands.get(1);
                if (itemsList.contains(item)) {
                    break;
                } else {
                    itemsList.add(0, item);
                }
                    break;

                case "Unnecessary":
                    item = inputCommands.get(1);
                    itemsList.remove(item);
                    break;

                case "Correct":
                    item = inputCommands.get(1);
                    String newItem = inputCommands.get(2);
                    if (itemsList.contains(item)) {
                        int index = itemsList.indexOf(item);
                        itemsList.set(index, newItem);
                    }
                    break;

                case "Rearrange":
                    item = inputCommands.get(1);
                    if (itemsList.contains(item)) {
                        itemsList.remove(item);
                        itemsList.add(itemsList.size(), item);
                    }
                    break;
            }



            input = scanner.nextLine();
        }

        System.out.println(itemsList.toString().replaceAll("[\\[\\]]", ""));
    }
}
