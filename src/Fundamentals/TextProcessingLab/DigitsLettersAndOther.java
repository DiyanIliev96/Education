package Fundamentals.TextProcessingLab;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String digits = "";
        String letters = "";
        String others = "";

        for (int i = 0; i <= text.toCharArray().length - 1 ; i++) {
            if (Character.isDigit(text.charAt(i))) {
                digits += text.charAt(i);
            } else if (Character.isLetter(text.charAt(i))) {
                letters += text.charAt(i);
            } else {
                others += text.charAt(i);
            }
        }
        System.out.printf("%s%n", digits);
        System.out.printf("%s%n",letters);
        System.out.printf("%s", others);
    }
}
