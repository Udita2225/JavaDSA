package SpecialPatterns;

import java.util.Scanner;

public class FloydsTriangle {
    /*
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 1 3 14 15
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int a = 1; //initialising a only once outside the loop;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print( a++ + " ");
                //a += 1;
            }
            System.out.println();
        }
    } }



