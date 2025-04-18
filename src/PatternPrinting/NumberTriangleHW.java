package PatternPrinting;
import java.util.Scanner;
public class NumberTriangleHW {
    /*
    1
    2 2
    3 3 3
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n  = sc.nextInt();
        int a=n;
        for( int i = 1; i<=n; i++){

            for(int j =1; j<=i; j++){
                System.out.print(a+ " ");
                a--;
            }
            System.out.println();
        }

    }
}
