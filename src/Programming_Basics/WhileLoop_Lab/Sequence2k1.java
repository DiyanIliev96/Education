package Programming_Basics.WhileLoop_Lab;

import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int num = 1;
        while (number >= num) {
            System.out.println(num);
            num = num * 2 + 1;
        }

    }
}
