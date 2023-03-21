package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class Animals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();
        boolean isValid = animal.equals("crocodile") || animal.equals("tortoise") || animal.equals("snake");
        if (animal.equals("dog")) {
            System.out.println("mammal");
        } else if (isValid) {
            System.out.println("reptile");
        } else {
            System.out.println("unknown");
        }
    }
}
