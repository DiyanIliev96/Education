package Programming_Basics.ForLoops_Exercise;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= tabs || salary <= 0; i++) {
            String website = scanner.nextLine();
            switch (website) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                break;
            }
        }
        if (salary > 0) {
            System.out.println(salary);
        } else {
            System.out.println("You have lost your salary.");
        }
    }
}
