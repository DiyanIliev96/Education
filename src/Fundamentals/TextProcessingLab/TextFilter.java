package Fundamentals.TextProcessingLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();


        for (int i = 0; i <= bannedWords.length - 1; i++) {
            String replaceWord = "*".repeat(bannedWords[i].length());
            text = text.replace(bannedWords[i], replaceWord);
        }
        System.out.println(text);
    }
}
