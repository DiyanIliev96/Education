package Fundamentals.TextProcesing_Exercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());
        int explosion = 0;


        for (int i = 0; i <text.length() - 1 ; i++) {
            if (text.charAt(i) == '>') {
                explosion += Integer.parseInt(String.valueOf(text.charAt(i + 1)));
                text.delete(i, explosion + i);
            }
        }
    }
}
