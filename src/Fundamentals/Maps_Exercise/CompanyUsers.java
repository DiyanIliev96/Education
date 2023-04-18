package Fundamentals.Maps_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> employersMap = new LinkedHashMap<>();


        String input = scanner.nextLine();


        while (!input.equals("End")) {
            List<String> commandsInput = Arrays.stream(input.split(" -> ")).collect(Collectors.toList());
            String company = commandsInput.get(0);
            String employerId = commandsInput.get(1);

           if (!employersMap.containsKey(company)) {
               employersMap.put(company, new ArrayList<>());
           }

           if (!employersMap.get(company).contains(employerId)) {
               employersMap.get(company).add(employerId);
           }





            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : employersMap.entrySet()) {
            List<String> employers = entry.getValue();

            System.out.printf("%s%n", entry.getKey());
            for (int i = 0; i <= employers.size() - 1 ; i++) {
                System.out.printf("-- %s%n",employers.get(i));
            }
        }

    }
}
