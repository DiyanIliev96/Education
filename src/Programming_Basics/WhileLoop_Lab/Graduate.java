package Programming_Basics.WhileLoop_Lab;

import java.util.Scanner;

public class Graduate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String student = scanner.nextLine();
        int gradesQuantity = 0;
        double grade = 0;
        int badGrade = 0;
        while (gradesQuantity != 12 && badGrade != 2) {
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if (currentGrade >= 4) {
                grade += currentGrade;
                gradesQuantity ++;
            } else  {
                badGrade ++;
                gradesQuantity += 1;
            }
        }
        if (badGrade == 2) {
            System.out.printf("%s has been excluded at %d grade", student , gradesQuantity - 1);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f",student , grade / gradesQuantity);
        }

    }
}
