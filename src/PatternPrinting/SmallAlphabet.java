package PatternPrinting;

import java.util.Scanner;

public class SmallAlphabet {
    public static void main(String[] args) {



    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows/columns");
    int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            System.out.print((char) (i + 96) + " ");
            //yaha par jab j wala loop chal rha hai tab i constant hai

        }
        System.out.println();
    }
}
}
