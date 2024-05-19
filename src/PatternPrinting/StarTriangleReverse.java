package PatternPrinting;
import java.util.Scanner;
public class StarTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j = 1 ; j<=n+ 1 -i ; j++){
                System.out.print( " * ");
            }
            System.out.println();
            /* Theory
            i=1 j =1 to 5;
            i=2 j=1 to 4;
            i=3 j=1 to 3;
            i=4 j=1 to 1;
            i =5 j=1 to 1;
            i+j(max) = n+1;
            j(max) =n+1-i;
            j<=n+1-i;
             */
            /*
            SQUARE - for(i = 1 to n) ; for(j = 1 to n)
            TRIANGLE - for(i =1 to n) ; for(j=1 to i)
            REVERSE TRIANGLE - for(i = 1 to n) ; for(j = 1  to j<=n+1-i)
             */
        }
    }
}
