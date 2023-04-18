package Fundamentals.Maps_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Course {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courseAndStudentsMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> inputRegisterRequest = Arrays.stream(input.split(" : ")).collect(Collectors.toList());
            String courseName = inputRegisterRequest.get(0);
            String studentName = inputRegisterRequest.get(1);

            if (!courseAndStudentsMap.containsKey(courseName)) {
                courseAndStudentsMap.put(courseName, new ArrayList<>());
                courseAndStudentsMap.get(courseName).add(studentName);
            } else {
                courseAndStudentsMap.get(courseName).add(studentName);
            }




            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : courseAndStudentsMap.entrySet()) {
            List<String> students = entry.getValue();
            System.out.printf("%s: %d%n", entry.getKey(), students.size());
            for (int i = 0; i <= students.size() - 1 ; i++) {
                System.out.printf("-- %s%n", students.get(i));
            }
        }

    }
}
