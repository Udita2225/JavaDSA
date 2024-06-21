package SpecialPatterns;

import java.util.Scanner;

public class CompositePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        //Printing as a square
        /*COMPOSITE PATTERNS USE
        Mixture of two patterns
       Two Loops inside a Loop..
         */
        /*
                  5
                4 5
              3 4 5
            2 3 4 5
          1 2 3 4 5

          */
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
