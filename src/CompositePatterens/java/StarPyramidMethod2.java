package CompositePatterens.java;

import java.util.Scanner;

public class StarPyramidMethod2 {
    /*
    METHOD 2:-
    Using Extra Variables
    In each Row :-
    Number OF Spaces = n-1 ,Number Of space in each row are decreasing --
    Number OF Stars = 1; Number of Stars are increasing ++
    This method is effective only if stars and spaces are given;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = 1;
        //METHOD 1:-
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {//nsp - No.Of Spaces
                System.out.print(" " + " ");}//Spaces Loop
            for (int j = 1; j <= nst; j++) {//nst - No.Of Stars
                System.out.print("*" + " ");}
            System.out.println();
            nsp--;
            nst += 2;}
    }
}
