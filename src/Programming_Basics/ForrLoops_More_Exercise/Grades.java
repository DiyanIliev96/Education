package Programming_Basics.ForrLoops_More_Exercise;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        double over5 = 0;
        double between400to499 = 0;
        double between300to399 = 0;
        double fail = 0;
        double avarageGrade = 0;
        for (int i = 1; i <= students ; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 3.00) {
                fail += 1;
                avarageGrade += grade;
            } else if (grade >= 3.00 && grade <= 3.99) {
                between300to399 += 1;
                avarageGrade += grade;
            } else if (grade >= 4.00 && grade <= 4.99) {
                between400to499 += 1;
                avarageGrade += grade;
            } else {
                over5 += 1;
                avarageGrade += grade;
            }
        }
        avarageGrade /= students;
        System.out.printf("Top students: %.2f%%%n", over5 / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", between400to499 / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", between300to399 / students * 100);
        System.out.printf("Fail: %.2f%%%n", fail / students * 100);
        System.out.printf("Average: %.2f", avarageGrade);
    }
}
