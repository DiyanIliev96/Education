package Programming_Basics.WhileLoop_Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weidth = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cakeSize = weidth * length;
        String cakes = scanner.nextLine();
        while (!cakes.equals("STOP") || cakeSize <= 0) {
            int pieces = Integer.parseInt(cakes);
            cakeSize -= pieces;
            if (cakeSize <= 0) {
                break;
            }
            cakes = scanner.nextLine();
        }
        if (cakeSize <= 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeSize));
        } else {
            System.out.printf("%d pieces are left.", cakeSize);
        }
        }
    }

