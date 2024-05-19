package CompositePatterens.java;

import java.util.Scanner;

public class NumberPyramidPalindrome {
    /*             1
                 1 2 1
               1 2 3 2 1
             1 2 3 4 3 2 1
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        //METHOD 1:-

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                /* //sp - space
                sp sp sp
                sp sp
                sp
                 */
                System.out.print(" " + " ");//Spaces Loop
            }
            for(int j = 1; j <= i; j++) {
                /*
                1
                1 2
                1 2 3
                1 2 3 4
                 */
                System.out.print(j + " ");
            }
            for(int j = i-1; j>=1 ; j--){
                /*
                1
                2 1
                3 2 1
                4 3 2 1
                 */
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
