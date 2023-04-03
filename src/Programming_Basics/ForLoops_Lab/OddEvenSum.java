package Programming_Basics.ForLoops_Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int evenSum =0;
        int oddSum = 0;
        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            evenSum = evenSum + currentNum;

        }
        for (int i = 1; i <=n ; i+=2) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            oddSum = oddSum + currentNum;
        }
    }
}
