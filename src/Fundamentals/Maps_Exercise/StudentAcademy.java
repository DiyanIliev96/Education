package Fundamentals.Maps_Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsAndGradeMap = new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsAndGradeMap.containsKey(name)) {
                studentsAndGradeMap.put(name, new ArrayList<>());
                studentsAndGradeMap.get(name).add(grade);
            } else {
                studentsAndGradeMap.get(name).add(grade);
            }

        }

        for (Map.Entry<String, List<Double>> entry : studentsAndGradeMap.entrySet()) {
            List<Double> studentsGrades = entry.getValue();
            double avg = 0;
            if (studentsGrades.size() == 1) {
                avg = studentsGrades.get(0);
            } else {
                for (int i = 0; i <= studentsGrades.size() - 1 ; i++) {
                    avg += studentsGrades.get(i);
                }
                avg = avg / studentsGrades.size();
            }

           if (avg >= 4.50) {
               System.out.printf("%s -> %.2f%n", entry.getKey(), avg);
           }
        }

    }
}
