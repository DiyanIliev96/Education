package Fundamentals.Middle_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        int moves = 0;
        while (!input.equals("end")) {
            moves++;
            List<String> indexes = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            int firstIndex = Integer.parseInt(indexes.get(0));
            int secondIndex = Integer.parseInt(indexes.get(1));
            int middleIndex = numbersList.size()  / 2;
            if (firstIndex == secondIndex || firstIndex < 0 || firstIndex > numbersList.size() - 1
                    || secondIndex < 0 || secondIndex > numbersList.size() - 1) {
                System.out.println("Invalid input! Adding additional elements to the board");
                numbersList.add(middleIndex, - + moves + "a");
                numbersList.add(middleIndex, - + moves + "a");
                input = scanner.nextLine();
                continue;
            }
                String firstEl = numbersList.get(firstIndex);
                String secondEl = numbersList.get(secondIndex);


            if (firstEl.equals(secondEl)) {
                System.out.printf("Congrats! You have found matching elements - %s!%n", firstEl);
                numbersList.remove(firstEl);
                numbersList.remove(secondEl);
            } else {
                System.out.println("Try again!");
            }
            if (numbersList.size() == 0) {
                System.out.printf("You have won in %d turns!", moves);
                return;
            }

            input = scanner.nextLine();
        }
        System.out.println("Sorry you lose :(");
        System.out.println(numbersList.toString().replaceAll("[\\[\\]\\,]", ""));


    }
}
