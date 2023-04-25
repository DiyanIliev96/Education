package Programming_Basics.WhileLoop_Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGrades = Integer.parseInt(scanner.nextLine());
        int bad = 0;
        double score = 0;
        int tasks = 0;
        boolean stop = true;
        String task = "";
        while (bad < badGrades) {
            String problemName = scanner.nextLine();
            if ("Enough".equals(problemName)) {
                stop = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                bad ++;
            }
                score += grade;
                tasks ++;
            task = problemName;

        }
        double average = score / tasks;
        if (stop) {
            System.out.printf("You need a break, %d poor grades.", bad);
        } else {
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n", tasks);
            System.out.printf("Last problem: %s", task);
        }
    }
}
