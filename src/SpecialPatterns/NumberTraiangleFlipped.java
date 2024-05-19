package SpecialPatterns;

import java.util.Scanner;

public class NumberTraiangleFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        //Printing as a square
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if((i+j)>n){
                    System.out.print(j+ " ");
                }
                else{
                    System.out.print(" "+ " ");}}
            System.out.println();
        }
    }
}
//but ye jo triangle aaya hai wo required output nahi hai
//iske liye hum composite patterns ka use karna paregaa.