package Programming_Basics.WhileLoop_Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = Integer.parseInt(scanner.nextLine());
        while (sum < num) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;
        }
        System.out.println(sum);
    }
}
