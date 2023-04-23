package Fundamentals.Middle_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> houses = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        int index = 0;
        while (!input.equals("Love!")) {
            List<String> inputCommands = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            index += Integer.parseInt(inputCommands.get(1));

            if (index > houses.size() - 1) {
                index = 0;
            }
            if (houses.get(index) == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", index);
            } else {
                houses.set(index, houses.get(index) - 2);
                if (houses.get(index) == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", index);
                }
            }


            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", index);
        int count = 0;

        for (int i = 0; i <= houses.size() - 1; i++) {
            if (houses.get(i) != 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", count);
        }
    }
}
