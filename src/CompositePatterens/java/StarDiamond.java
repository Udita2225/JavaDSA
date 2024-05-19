package CompositePatterens.java;

import java.util.Scanner;

public class StarDiamond {
       /*       *
              * * *       nsp = n-1   nsp--
            * * * * *     nst = 1     nst+=2
          * * * * * * *   for n=4
            * * * * *     nsp = 1     nsp++
              * * *       nst = (nst-=4)  nsp-=2
                *
       */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");}//Spaces Loop
                for (int j = 1; j <= nst; j++) {
                    System.out.print("*" + " ");}
                nsp--;
                nst += 2;
                System.out.println();
            }
        nsp= 1;
        nst= nst-4;
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");}//Spaces Loop
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");}
            nsp++;
            nst -= 2;
            System.out.println();
        }
        }
    }
