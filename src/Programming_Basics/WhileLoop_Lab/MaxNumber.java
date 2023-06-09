package Programming_Basics.WhileLoop_Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        while (!input.equals("Stop")) {
            int currentNum = Integer.parseInt(input);
            if (currentNum > max) {
                max = currentNum;
            }
            input = scanner.nextLine();
        }
        System.out.println(max);
    }
}
