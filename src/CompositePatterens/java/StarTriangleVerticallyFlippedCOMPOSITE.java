package CompositePatterens.java;

import java.util.Scanner;

public class StarTriangleVerticallyFlippedCOMPOSITE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("#"+ " ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //row by row print ho raha hai
        //# and * saath me print ho raha hai
    }
}