package PatternPrinting;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows/columns");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j =1; j<=n; j++){
                System.out.print(j + " "); //agar j ki jagah i likhenge to ek line me 1 1 1 1  is time ke liye i
                                            // constant rahega
                                            /* 1111
                                               2222
                                               3333
                                             */
            }
            System.out.println();
        }
    }
}

