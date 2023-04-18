package Fundamentals.Maps_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> legendaryItemsMap = new LinkedHashMap<>();
        legendaryItemsMap.put("shards", 0);
        legendaryItemsMap.put("fragments", 0);
        legendaryItemsMap.put("motes", 0);
        Map<String, Integer> junkItemsMap = new LinkedHashMap<>();

        boolean isBuy = false;

        while (!isBuy) {

            String input = scanner.nextLine();
            String[] inputItems = input.split(" ");


            for (int i = 0; i <= inputItems.length - 1 ; i+= 2) {
                int quantity = Integer.parseInt(inputItems[i]);
                String item = inputItems[i + 1].toLowerCase();

                switch (item) {
                    case "shards":
                        legendaryItemsMap.put("shards", legendaryItemsMap.get("shards")+ quantity);
                        break;
                    case "fragments":
                    legendaryItemsMap.put("fragments",legendaryItemsMap.get("fragments")+ quantity);
                        break;
                    case "motes":
                    legendaryItemsMap.put("motes", legendaryItemsMap.get("motes")+ quantity);
                        break;
                    default:
                        if (!junkItemsMap.containsKey(item)) {
                            junkItemsMap.put(item, quantity);
                        } else {
                            int currentQuantity = junkItemsMap.get(item);
                            junkItemsMap.put(item, currentQuantity + quantity);
                        }

                }
                if (legendaryItemsMap.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    legendaryItemsMap.put("shards", legendaryItemsMap.get("shards") - 250);
                    isBuy = true;
                    break;
                } else if (legendaryItemsMap.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    legendaryItemsMap.put("fragments", legendaryItemsMap.get("fragments") - 250);
                    isBuy = true;
                    break;
                } else if (legendaryItemsMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    legendaryItemsMap.put("motes", legendaryItemsMap.get("motes") - 250);
                    isBuy = true;
                    break;
                }

            }

        }
        for (Map.Entry<String, Integer> entry : legendaryItemsMap.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : junkItemsMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

    }
}
