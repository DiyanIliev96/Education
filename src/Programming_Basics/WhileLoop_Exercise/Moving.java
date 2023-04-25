package Programming_Basics.WhileLoop_Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weidth = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int freeSpace = weidth * lenght * height;
        String boxes = scanner.nextLine();
        while (!boxes.equals("Done")) {
            int boxesQuantity = Integer.parseInt(boxes);
            freeSpace -= boxesQuantity;
            if (freeSpace < 0) {
                break;
            }
            boxes = scanner.nextLine();
        }
        if (freeSpace < 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
        } else {
            System.out.printf("%d Cubic meters left.", freeSpace);
        }
    }
}
