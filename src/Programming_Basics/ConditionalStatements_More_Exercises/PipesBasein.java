package Programming_Basics.ConditionalStatements_More_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PipesBasein {
    private static final DecimalFormat df = new DecimalFormat("0.00");



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double V = Double.parseDouble(scanner.nextLine());
        double P1 = Double.parseDouble(scanner.nextLine());
        double P2 = Double.parseDouble(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        double P1debitforhour = P1 * H;
        double P2debitforhour = P2 * H;
        double totalfull = P1debitforhour + P2debitforhour;
        double procentFull = ((P1debitforhour + P2debitforhour) / V) * 100;
        double procentP1 = (P1debitforhour / totalfull) * 100;
        double procentP2 = (P2debitforhour / totalfull) * 100;
        double overflows = (P1debitforhour + P2debitforhour) - V;
        boolean a = V < totalfull;
        if (V > totalfull) {
            System.out.println("The pool is " + df.format(procentFull) + "% " + "full. " + "Pipe 1: " + df.format(procentP1) + "%. " + "Pipe 2: " + df.format(procentP2) + "%.");
        }
        else if (a) {
            System.out.println("For " + df.format(H) + " hours the pool overflows with " + df.format(overflows) + " liters.");


        }
    }
}


