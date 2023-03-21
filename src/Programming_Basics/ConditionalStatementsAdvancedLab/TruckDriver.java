package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());
        double kmPrice = 0.0;
        switch (season) {
            case "Spring":
                if (kmPerMonth <= 5000) {
                    kmPrice = 0.75;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    kmPrice = 0.95;
                } else if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
                    kmPrice = 1.45;
                }
                break;
            case "Autumn":
                if (kmPerMonth <= 5000) {
                    kmPrice = 0.75;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    kmPrice = 0.95;
                } else if (kmPerMonth > 10000 && kmPerMonth <= 20000) {
                    kmPrice = 1.45;
                }
                break;
            case "Summer":
                if (kmPerMonth <= 5000) {
                    kmPrice = 0.90;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    kmPrice = 1.10;
                } else if (kmPerMonth > 10000 && kmPerMonth <= 20000){
                    kmPrice = 1.45;
                }
                break;
            case "Winter":
                if (kmPerMonth <= 5000) {
                    kmPrice = 1.05;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000) {
                    kmPrice = 1.25;
                } else if (kmPerMonth >10000 && kmPerMonth <= 20000) {
                    kmPrice = 1.45;
                }
                break;
        }
        double salary = (kmPerMonth * kmPrice) * 4;
        double salaryWithTaxes = salary - salary *0.10;
        System.out.printf("%.2f",salaryWithTaxes);
    }
}
