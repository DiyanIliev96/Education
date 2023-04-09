package Programming_Basics.ForrLoops_More_Exercise;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double waterBill = 0;
        double internetBill = 0;
        double otherBill = 0;
        double totalelectrecity = 0;
        double totalBill = 0;
        for (int i = 1; i <= months ; i++) {
            double electrecityBill = Double.parseDouble(scanner.nextLine());
            totalelectrecity += electrecityBill;
            waterBill += 20;
            internetBill += 15;
            otherBill += (electrecityBill + 20 + 15) + ((electrecityBill + 20 + 15) * 0.2);
        }
        totalBill += totalelectrecity + waterBill + internetBill + otherBill;
        double average = totalBill / months;
        System.out.printf("Electricity: %.2f lv%n",totalelectrecity);
        System.out.printf("Water: %.2f lv%n", waterBill);
        System.out.printf("Internet: %.2f lv%n", internetBill);
        System.out.printf("Other: %.2f lv%n", otherBill);
        System.out.printf("Average: %.2f lv", average);
    }
}
