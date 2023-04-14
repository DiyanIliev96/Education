package Programming_Basics.ForrLoops_More_Exercise;

import java.util.Scanner;

public class p04Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int patients;
        int treatPats = 0;
        int untreatPats = 0;

        int doctors = 7;

        for (int i = 1; i <= days; i++)
        {
            patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0)
            {
                if (treatPats < untreatPats)
                {
                    doctors++;
                }

                if (patients >= doctors)
                {
                    treatPats = treatPats + doctors;
                    untreatPats = untreatPats + (patients - doctors);
                }
                else
                {
                    treatPats = treatPats + patients;
                }

            }
            else
            {
                if (patients >= doctors)
                {
                    treatPats = treatPats + doctors;
                    untreatPats = untreatPats + (patients - doctors);
                }
                else
                {
                    treatPats = treatPats + patients;
                }

            }
        }
        System.out.printf("Treated patients: %d. %n",treatPats);
        System.out.printf("Untreated patients: %d.", untreatPats);
    }
    }

