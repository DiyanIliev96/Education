package Programming_Basics.WhileLoop_Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            int currentNum = Integer.parseInt(input);
            if (min > currentNum) {
                min = currentNum;
            }
            input = scanner.nextLine();
        }
        System.out.println(min);
    }
}
