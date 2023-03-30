package Programming_Basics.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class StudentByTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());// часът на изпита
        int examMin = Integer.parseInt(scanner.nextLine());// минутите на изпита
        int arrivalHour = Integer.parseInt(scanner.nextLine());// часът на пристигане
        int arrivalMin = Integer.parseInt(scanner.nextLine());// минутите на пристигане
        double totalTimeExam = examHour * 60 + examMin;// общо минути на изпита
        double totalTimeArrival = arrivalHour * 60 + arrivalMin;// общо минути на пристигане
        double hourExam =0;
        double minExam =0;
        hourExam = totalTimeExam / 60;// час на изпита
        minExam = totalTimeExam % 60;// минута на изпита
        double hourArrival = 0;
        double minArrival = 0;
        hourArrival = totalTimeArrival / 60;// час на пристигане
        minArrival = totalTimeArrival % 60;// минута на пристигане

    }
}
