package Programming_Basics.ForrLoops_More_Exercise;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moves = Integer.parseInt(scanner.nextLine());
        double result = 0;
        double from0to9 = 0;
        double from10to19 = 0;
        double from20to29 = 0;
        double from30to39 = 0;
        double from40to50 = 0;
        double invalidNumbers = 0;
        for (int i = 1; i <= moves ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number >= 0 && number <= 9) {
                from0to9 += 1;
                result += number * 0.2;
            } else if (number >= 10 && number <= 19) {
                from10to19 += 1;
                result += number * 0.3;
            } else if (number >= 20 && number <= 29) {
                from20to29 += 1;
                result += number * 0.4;
            } else if (number >= 30 && number <=39) {
                from30to39 += 1;
                result += 50;
            } else if (number >= 40 && number <=50) {
                from40to50 +=1;
                result += 100;
            } else {
                invalidNumbers += 1;
                result /= 2;
            }
        }
        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", from0to9 / moves * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", from10to19 / moves * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", from20to29 / moves * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", from30to39 / moves * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", from40to50 / moves * 100);
        System.out.printf("Invalid numbers: %.2f%%", invalidNumbers / moves * 100);
    }
}
