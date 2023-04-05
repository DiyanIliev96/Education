package Programming_Basics.ForLoops_Exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        for (int i = 1; i <= n && i <= 1000; i++) {
            int addedNum = Integer.parseInt(scanner.nextLine());
            if (addedNum < 200) {
                p1 = p1 + 1;
            } else if (addedNum > 200 && addedNum < 399) {
                p2 = p2 + 1;
            } else if (addedNum > 400 && addedNum < 599) {
                p3 = p3 + 1;
            } else if (addedNum > 600 && addedNum < 799) {
                p4 = p4 + 1;
            } else if (addedNum > 800) {
                p5 = p5 + 1;
            }
        }
        double p1InPercent = p1 / 20 * 100;
        double p2inPercent = p2 / 20 * 100;
        double p3InPercent = p3 / 20 * 100;
        double p4InPercent = p4 / 20 * 100;
        double p5InPercent = p5 / 20 * 100;
        System.out.printf("%.2f%n %.2f%n %.2f%n %.2f%n %.2f", p1InPercent,p2inPercent,p3InPercent,p4InPercent,p5InPercent);
    }
}
