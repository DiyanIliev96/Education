package Fundamentals.Maps_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<Double>> orders = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("buy")) {
            List<String> inputOrders = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            double price = Double.parseDouble(inputOrders.get(1));
            double quantity = Double.parseDouble(inputOrders.get(2));
            String item = inputOrders.get(0);

            if (!orders.containsKey(item)) {
                orders.put(item, new ArrayList<>());
               orders.get(item).add(price);
               orders.get(item).add(quantity);
            } else {
                List<Double> values = orders.get(item);
                if (values.get(0) != price) {
                    orders.get(item).set(0, price);
                }
                double valueQuantity = values.get(1);

                orders.get(item).set(1, valueQuantity + quantity);
            }




            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<Double>> entry : orders.entrySet()) {
            List<Double> sum = entry.getValue();
            System.out.printf("%s -> %.2f%n", entry.getKey(), sum.get(0) * sum.get(1) );
        }

    }
}
