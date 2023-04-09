package ForLoopMoreExercise;

import java.util.Scanner;

public class FilmPrimiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        String packagee = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (projection) {
            case "John Wick":
                if (packagee.equals("Drink")) {
                    price += 12 * tickets;
                } else if (packagee.equals("Popcorn")) {
                    price += 15 * tickets;
                } else {
                    price += 19 * tickets;
                }
                break;
            case "Star Wars":
                if (packagee.equals("Drink")) {
                    price += 18 * tickets;
                } else if (packagee.equals("Popcorn")) {
                    price += 25 * tickets;
                } else {
                    price += 30 * tickets;
                }
                break;
            case "Jumanji":
                if (packagee.equals("Drink")) {
                    price += 9 * tickets;
                } else if (packagee.equals("Popcorn")) {
                    price += 11 * tickets;
                } else {
                    price += 14 * tickets;
                }
                break;
        }
        if (projection.equals("Star Wars") && tickets >= 4) {
            price -= price * 0.3;
        } else if (projection.equals("Jumanji") && tickets == 2) {
            price -= price * 0.15;
        }
        System.out.printf("Your bill is %.2f leva.", price);
    }
}
