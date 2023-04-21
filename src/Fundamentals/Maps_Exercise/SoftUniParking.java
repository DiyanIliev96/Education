package Fundamentals.Maps_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingUsersMap = new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            String typeInput = input.get(0);
            String name = input.get(1);
            String licensePlateNumber = "";

            switch (typeInput) {
                case "register":
                    licensePlateNumber = input.get(2);
                if (!parkingUsersMap.containsKey(name) || !parkingUsersMap.containsValue(licensePlateNumber)) {
                    parkingUsersMap.put(name, licensePlateNumber);

                    System.out.printf("%s registered %s successfully%n", name, licensePlateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                }


                    break;


                case "unregister":

                    if (parkingUsersMap.containsKey(name)) {
                        parkingUsersMap.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", name);
                    }



                    break;
            }
        }

        for (Map.Entry<String, String> entry : parkingUsersMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
