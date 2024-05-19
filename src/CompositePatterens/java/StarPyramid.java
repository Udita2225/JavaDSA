package CompositePatterens.java;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        //METHOD 1:-
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");//Spaces Loop}
            }
                for ( int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();

                //METHOD 2:-
                //USING EXTRA VARIABLES


            }
        }
    }
