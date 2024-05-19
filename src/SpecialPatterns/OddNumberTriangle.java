package SpecialPatterns;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print((2*j - 1) + " ");
//            }
//            System.out.println();
//
//        }
        /*
        //METHOD 1
        j = 1,2,3,4,5
        2j-1 = 1,3,5,7,9 //with maths isme structure change nahi huwa
        //METHOD 2
        Printing first n numbers of this AP:-
        for(int j=1; j<=2*i-1; j+=2{
        sout(j + " ");}
        //METHOD 3
        BEST METHOD
        Printing number a
        for(int i=1; i<=n; i++)
        {
        int a =1;
        for (int j =1; j<=i; j++){
        sout(a + "");
        a += 2;
        }
        sout();}}
         */
        for(int i=1; i<=n; i++){
            int a =1;
            for(int j =1 ; j<=i; j++){
                System.out.print(a + "");
                a +=2;//yaha par hum koi bhi A.P likh sakte hain
            }
            System.out.println();
        }
    }

}
