package Programming_Basics.WhileLoop_Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputSteps = scanner.nextLine();
        int totalSteps = 0;
        int goaldiff;
        while (!inputSteps.equals("Going home")) {
            int steps = Integer.parseInt(inputSteps);
             totalSteps += steps;

             if (totalSteps >= 10000) {
                 break;
             }
             inputSteps = scanner.nextLine();
        }
        if (inputSteps.equals("Going home")) {
            int goingHomeSteps = Integer.parseInt(scanner.nextLine());
            totalSteps += goingHomeSteps;
        }
        if (totalSteps >= 10000) {
            goaldiff = Math.abs(totalSteps - 10000);
            System.out.printf("Goal reached! Good job!%n");
            System.out.printf("%d steps over the goal!", goaldiff);
        } else {
            goaldiff = Math.abs(totalSteps - 10000);
            System.out.printf("%d more steps to reach goal.", goaldiff);
        }

        }
    }

