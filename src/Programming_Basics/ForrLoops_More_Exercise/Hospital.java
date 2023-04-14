package Programming_Basics.ForrLoops_More_Exercise;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int treatedPacients = 0;
        int unTreatedPacients = 0;
        for (int i = 1; i <= period ; i++) {
            int pacients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0) {
                if (unTreatedPacients > treatedPacients) {
                    doctors +=1;
                    treatedPacients += 1;
                    unTreatedPacients -= 1;
                }
                else {
                    treatedPacients += doctors;
                    unTreatedPacients = pacients - doctors;
                }
            }
        }
        System.out.printf("Treated patients: %d. %n",treatedPacients);
        System.out.printf("Untreated patients: %d.", unTreatedPacients);
    }
}
