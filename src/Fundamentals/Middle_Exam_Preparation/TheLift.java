package Fundamentals.Middle_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peoples = Integer.parseInt(scanner.nextLine());
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i <= wagons.size() - 1 ; i++) {
            if (peoples == 0) {
                break;
            }

            for (int j = wagons.get(i); j <4 ; j++) {
                if (peoples == 0) {
                    break;
                }
                wagons.set(i, wagons.get(i) + 1);
                peoples--;
            }

        }
        if (peoples == 0 && wagons.get(wagons.size() - 1) < 4) {
            System.out.println("The lift has empty spots!");
            System.out.print(wagons.toString().replaceAll("[\\[\\]\\,]", ""));
        } else if (peoples > 0 && wagons.get(wagons.size() - 1) == 4) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peoples);
            System.out.print(wagons.toString().replaceAll("[\\[\\]\\,]", ""));
        } else {
            System.out.print(wagons.toString().replaceAll("[\\[\\]\\,]", ""));
        }
    }
}
