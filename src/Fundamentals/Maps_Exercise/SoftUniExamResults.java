package Fundamentals.Maps_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> usernamesSubmissionsMap = new LinkedHashMap<>();
        Map<String, Integer> languageCountMap = new LinkedHashMap<>();

        String input = scanner.nextLine();


        while (!input.equals("exam finished")) {
            List<String> typeInput = Arrays.stream(input.split("\\-")).collect(Collectors.toList());
            String username = typeInput.get(0);
            String banOrLangugage = typeInput.get(1);

            if (banOrLangugage.equals("banned")) {
                usernamesSubmissionsMap.remove(username);
            } else {
                int points = Integer.parseInt(typeInput.get(2));

                usernamesSubmissionsMap.putIfAbsent(username, points);
                languageCountMap.putIfAbsent(banOrLangugage, 0);
                Integer currentPoints = languageCountMap.get(banOrLangugage);
                languageCountMap.put(banOrLangugage, currentPoints + 1);
                if (usernamesSubmissionsMap.get(username) < points) {
                    usernamesSubmissionsMap.put(username, points);
                }
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : usernamesSubmissionsMap.entrySet()) {
            System.out.printf("%s | %d%n",entry.getKey(), entry.getValue() );
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : languageCountMap.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }


    }
}
