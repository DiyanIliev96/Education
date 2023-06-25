package Fundamentals.Middle_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();


        while (!input.equals("end")) {
            List<String> inputCommands = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = inputCommands.get(0);
            int index1 = 0;
            int index2 = 0;
            int currentEl = 0;
            switch (command) {
                case "swap":
                    index1 = Integer.parseInt(inputCommands.get(1));
                    index2 = Integer.parseInt(inputCommands.get(2));
                    currentEl = numbersList.get(index1);
                    numbersList.set(index1, numbersList.get(index2));
                    numbersList.set(index2, currentEl);
                    break;
                case "multiply":
                    index1 = Integer.parseInt(inputCommands.get(1));
                    index2 = Integer.parseInt(inputCommands.get(2));
                    currentEl = numbersList.get(index1);
                    numbersList.set(index1, numbersList.get(index1) * numbersList.get(index2));
                    break;
                case "decrease":
                    for (int i = 0; i <= numbersList.size() - 1 ; i++) {
                        numbersList.set(i, numbersList.get(i) - 1);
                    }
                    break;




            }





            input = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\]]", ""));
    }
}
