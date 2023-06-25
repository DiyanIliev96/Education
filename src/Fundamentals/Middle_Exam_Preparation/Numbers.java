package Fundamentals.Middle_Exam_Preparation;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        double sum = 0;

        for (double sumNumbers : numbers) {
            sum += sumNumbers;
        }

        double averageNum = sum / numbers.size();

        for (int i = 0; i <= numbers.size() - 1; i++) {
            if (numbers.get(i) > averageNum) {
                result.add(numbers.get(i));
            }
        }

        if (result.size() - 1 < 0) {
            System.out.println("No");
            return;
        }

        result.sort(Comparator.reverseOrder());

        int count = 0;

        for (int printResult : result) {
            System.out.print(printResult + " ");
            count++;
            if (count == 5) {
                break;
            }
        }
    }
}
