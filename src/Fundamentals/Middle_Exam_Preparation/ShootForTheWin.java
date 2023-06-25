package Fundamentals.Middle_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        int shots = 0;

        while (!input.equals("End")) {
            int index = Integer.parseInt(input);
            int currentElement = 0;
            if (index < 0 || index > targetsList.size() - 1) {
                input = scanner.nextLine();
                continue;
            }

            if (targetsList.get(index) >= 0) {
                currentElement = targetsList.get(index);
                targetsList.set(index, -1);
                shots++;
                for (int i = 0; i <= targetsList.size() - 1 ; i++) {
                    if (targetsList.get(i) > currentElement && targetsList.get(i) > 0) {
                        targetsList.set(i, targetsList.get(i) - currentElement);
                    } else if (targetsList.get(i) <= currentElement && targetsList.get(i) > 0) {
                        targetsList.set(i, targetsList.get(i) + currentElement);
                    }
                }
            }






            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", shots);
        System.out.println(targetsList.toString().replaceAll("[\\[\\,\\]]", ""));
    }
}
