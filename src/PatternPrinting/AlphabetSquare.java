package PatternPrinting;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows/columns");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(j+64) + " ");
            }
            /* A -65, B- 66, Z-90
            a -97, b-98,    z-122
            '0'-48;
            '9' -57;
             */
            //j+64 ko typecast kar do
            System.out.println();
        }
    }
}