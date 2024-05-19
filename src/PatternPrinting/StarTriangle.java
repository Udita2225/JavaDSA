package PatternPrinting;
import java.util.Scanner;
public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //STAR TRIANGLE
        /*Theory
        Differences in triangle and square(for(i =1 to n) , for (j=1 to n)
        Triangle for(i=1 to n) for (j =1 to i)
        Triangle me bahar wala loop to n times hi chalega
        In this star triangle, in each line the number of stars that are printed is equal to the row number
         */
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
