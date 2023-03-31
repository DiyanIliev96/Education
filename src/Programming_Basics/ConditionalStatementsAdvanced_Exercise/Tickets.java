package Programming_Basics.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String ticketType = scanner.nextLine();
        int members = Integer.parseInt(scanner.nextLine());
        double transportPrice = 0.0;
        double priceForTickets = 0.0;
        double totalPrice = 0.0;
          if (members >=1 && members <5) {
              transportPrice = budget * 0.75;
          } else if (members >= 5 && members <10) {
              transportPrice = budget* 0.60;
          } else if (members >=10 && members < 25) {
              transportPrice = budget * 0.50;
          } else if (members >= 25 && members <50) {
              transportPrice = budget * 0.40;
          } else if (members >= 50) {
              transportPrice = budget * 0.25;
          }
          switch (ticketType) {
              case "VIP":
                  priceForTickets = members * 499.99;
                  totalPrice = priceForTickets + transportPrice;
                  break;
              case "Normal":
                  priceForTickets = members * 249.99;
                  totalPrice = priceForTickets + transportPrice;
                  break;
           }
double difference = Math.abs(totalPrice - budget);
          if (budget >= totalPrice) {
              System.out.printf("Yes! You have %.2f leva left.",difference);
          } else {
              System.out.printf("Not enough money! You need %.2f leva.", difference);
          }
        }
    }
