package Fundamentals.Middle_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            List<String> commandsInput = Arrays.stream(input.split(" - ")).collect(Collectors.toList());
            String type = commandsInput.get(0);
            String currentItem = commandsInput.get(1);
            switch (type) {
                case "Collect":
                if (items.contains(currentItem)) {
                    break;
                } else {
                    items.add(currentItem);
                }
                    break;

                case "Drop":
                    items.remove(currentItem);
                    break;

                case "Combine Items":
                    List<String> combineItems = Arrays.stream(currentItem.split(":")).collect(Collectors.toList());
                    String oldItem = combineItems.get(0);
                    String newItem = combineItems.get(1);
                    if (items.contains(oldItem)) {
                        int index = items.indexOf(oldItem);
                        items.add(index + 1, newItem);
                    } else {
                        break;
                    }
                    break;


                case "Renew":
                if (items.contains(currentItem)) {
                    items.remove(currentItem);
                    items.add(items.size(), currentItem);
                }

                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", items));
    }
}
