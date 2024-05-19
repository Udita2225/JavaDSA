package CompositePatterens.java;

import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        //METHOD 1:-
        /*
        * * * * * * *
        * * *   * * *
        * *       * *
        *           *
        Print the first line separatly
        And then divide the pattern into three pars..
         */
        for(int k =1; k<=2*n-1; k++){
            System.out.print("*"+ " ");
        }
        n--;
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= n+1-i ; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j<=2*i-1; j++){
                System.out.print(" "+ " ");
            }
            /*
            int nsp = 1 before loop i
            for(int j=1; j<=nsp; j++){
            //spaces
            System.out.print(" "+" ");
            }
            nsp +=1;
            */
            for(int j =1; j<=n+1-i; j++){
                System.out.print("*"+ " ");
            }
                System.out.println();

        }
    }
}