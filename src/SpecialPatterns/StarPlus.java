package SpecialPatterns;

import java.util.Scanner;

public class StarPlus {
    /*
HINT:-  Conditions of question:-
   n is odd; n=5
    *
    *
* * * * *
    *
    *
HINT :-
Seedha stars print nahi ho rahe hain ..
Pehle gaps Print ho  rahe  hain..
HINT:- Middle row aur middle column ko star print kardo;
mid = n/2 +1
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int mid = n/2 +1;
        for(int i =1; i<=n; i++){
            for(int j =1; j<=n; j++){
                if(i ==mid  || j ==mid) System.out.print( "*"+ " ");
                else System.out.print( " " + " ");

            }
            System.out.println();
        }
    }
}
