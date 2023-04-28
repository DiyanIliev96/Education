package Programming_Basics.WhileLoop_Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoneyForHoliday = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());
        int spendDays = 0;
        int Days = 0;
        String spendOrSave = "";
        while (currentMoney < neededMoneyForHoliday && spendDays < 5) {
            spendOrSave = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            Days ++;
          switch (spendOrSave) {
              case "save":
                  currentMoney += money;
                  spendDays = 0;
                  break;
              case "spend":
                  currentMoney -= money;
                  if (currentMoney < 0) {
                      currentMoney = 0;
                  }
                  spendDays ++;
                  break;
          }
        }
        if (spendDays == 5) {
            System.out.printf("You can't save the money.%n");
            System.out.printf("%d",Days);
        } if (currentMoney >= neededMoneyForHoliday) {
            System.out.printf("You saved the money for %d days.", Days);
        }
    }
}
