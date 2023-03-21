package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class NumberFromOneToTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double result = 0.0;
        boolean isValid = num > 0;
        do if (num > 0) {
           result = num * 2;
           System.out.printf("Result: %.2f",result);
           scanner.nextLine();
       } while (isValid == false);
        System.out.println("Negative number!");
        }
    }








