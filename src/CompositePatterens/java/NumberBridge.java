package CompositePatterens.java;

import java.util.Scanner;

public class NumberBridge {
    /*
    1 2 3 4 5 6 7
    1 2 3   5 6 7
    1 2       6 7
    1           7
    //Not a simple numberBRIDGE
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

//       for (int i = 1; i <= 2 * n - 1; i++) {
//            System.out.print(i+ " ");}
//            System.out.println();
//        n--;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n + 1 - i; j++) {
//                System.out.print(j + " ");}
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print(" "+ " ");}
//            for (int j = 5; j <= n+5-i; j++) {
//                System.out.print(j+ " ");}
//            System.out.println();}
        /*
        1 2 3 4 5 6 7
        1 2 3   5 6 7
        1 2       5 7
        1           7
         */
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print(i+ " ");}
            System.out.println();
        n--;
        int nsp =1;
        for(int i =1; i<=n; i++){
            int a=1;
            for(int j=1; j<=n+1-i; j++){
                System.out.print(a++ + " ");}
            for(int j=1; j<=nsp; j++){
                System.out.print(" "+" ");
                a++;//very important}
            nsp +=2;
            for(j=1; j<=n+1-i; j++){
                System.out.print(a++ + " ");}
            System.out.println();
        }}}}