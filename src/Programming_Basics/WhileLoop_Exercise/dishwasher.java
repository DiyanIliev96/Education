package Programming_Basics.WhileLoop_Exercise;

import java.util.Scanner;

public class dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dishDetergent = Integer.parseInt(scanner.nextLine());
        double dishDetergentInML = dishDetergent * 750;
        int dishCount = 0;
        int potCount = 0;
        int reload = 0;
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            reload++;
            int dishes = Integer.parseInt(input);
            if (reload % 3 == 0) {
                dishDetergentInML -= dishes * 15;
                potCount += dishes;
                if (dishDetergentInML < 0) {
                    break;
                } else {
                    input = scanner.nextLine();
                    continue;
                }
            }
            dishDetergentInML -= dishes * 5;
            dishCount += dishes;
            if (dishDetergentInML < 0) {
                break;
            }
            input = scanner.nextLine();
        }
        if (dishDetergentInML >= 0) {
            System.out.printf("Detergent was enough!%n");
            System.out.printf("%d dishes and %d pots were washed.%n", dishCount, potCount);
            System.out.printf("Leftover detergent %.0f ml.", dishDetergentInML);
        } else {
            System.out.printf("Not enough detergent, %.0f ml. more necessary!", Math.abs(dishDetergentInML));
        }
    }
}
