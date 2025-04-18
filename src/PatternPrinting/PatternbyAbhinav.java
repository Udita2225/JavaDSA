package PatternPrinting;
import java.util.*;
public class PatternbyAbhinav{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt();
        for(int i =1; i<n; i++ ){
            for(int j=1; j<=n-i;j++){
                System.out.print(" "+ " ");
            }
            for(int  j=1; j<=i; j++ ){
                System.out.print(" "+ i + "  ");
            }
                    System.out.println();
        }
        for(int i =1; i<=n; i++){
            System.out.print(" "+n+ "  ");
        }
        System.out.println();
        for(int i =1; i<n; i++ ){
            for(int j=1; j<=i;j++){
                System.out.print(" "+ " ");
            }
            for(int j=1; j<=n-i;j++){
                System.out.print(" "+(n-i)+ "  ");
            }
            System.out.println();
        }
    }
}
/*
Enter a number : 3
     1
   2   2
 3   3   3
   2   2
     1
*/