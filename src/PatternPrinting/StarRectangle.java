package PatternPrinting;
import java.util.Scanner;
public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int n = sc.nextInt();
        System.out.println("Enter number of columns");
        int m = sc.nextInt();
        //Rows - No.of Lines
        //Columns - How Much in each line
        //Nested Loops (Loops inside Loop)
        for(int i =1; i<=n; i++){//i is controlling no. of rows
            for(int j=1; j<=m; j++){//columns
                System.out.print(" * ");//yaha par ln mat likhna kyoki humne same line me print karna hai
            }
            System.out.println();
        }
   /*     *  *  *  *
          *  *  *  *
          *  *  *  *
    */
    }
}
