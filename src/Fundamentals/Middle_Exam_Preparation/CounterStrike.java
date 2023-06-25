package Fundamentals.Middle_Exam_Preparation;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());


        int wins = 0;
        String input = scanner.nextLine();

        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);
          if (energy < distance) {
              System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wins , energy);
              energy -= distance;
              return;
          }
            energy -= distance;
          wins++;
            if (wins % 3 == 0) {
                energy += wins;
            }


            input = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d",wins,energy);
    }
}
