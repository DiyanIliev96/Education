package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        boolean workingDay = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
        || day.equals("Friday");
        boolean weekendDay = day.equals("Saturday") || day.equals("Sunday");
        if (workingDay) {
            System.out.println("Working day");
        } else if (weekendDay) {
            System.out.println("Weekend");
        } else {
            System.out.println("Error");
        }
    }
}
