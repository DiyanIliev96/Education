package Fundamentals.TextProcessingLab;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i <= input.length - 1 ; i++) {

            for (int j = 0; j <=input[i].length() - 1 ; j++) {
                System.out.print(input[i]);
            }
        }
    }
}
