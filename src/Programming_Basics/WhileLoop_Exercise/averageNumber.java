package Programming_Basics.WhileLoop_Exercise;

import java.util.Scanner;

public class averageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double average = 0;
        int numCounts = 0;
        for (int i = 1; i <=n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            average += num;
            numCounts ++;
        }
        System.out.printf("%.2f", average / numCounts);
    }
}
