package Programming_Basics.ForLoops_Exercise;

import java.util.Scanner;

public class Trekking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int k2 = 0;
        int everest = 0;
        for (int i = 1; i <= groups ; i++) {
            int peoples = Integer.parseInt(scanner.nextLine());
            if (peoples <= 5) {
                musala+= peoples;
            } else if (peoples >= 6 && peoples <= 12) {
                monblan+= peoples;
            } else if (peoples >= 13 && peoples <= 25 ) {
                kilimandjaro+= peoples;
            } else if (peoples >= 26 && peoples <= 40) {
                k2+= peoples;
            } else if (peoples >= 41) {
                everest+= peoples;
            }
        }
        int totalpeoples = musala + monblan + kilimandjaro + k2 + everest;
        System.out.printf("%.2f%%%n", (musala * 1.0) / totalpeoples * 100 );
        System.out.printf("%.2f%%%n", (monblan * 1.0) / totalpeoples * 100 );
        System.out.printf("%.2f%%%n", (kilimandjaro * 1.0) / totalpeoples * 100 );
        System.out.printf("%.2f%%%n", (k2 * 1.0) / totalpeoples * 100 );
        System.out.printf("%.2f%%", (everest * 1.0) / totalpeoples * 100 );

    }
}
