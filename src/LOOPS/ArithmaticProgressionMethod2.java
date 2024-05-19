package LOOPS;
import java.util.Scanner;
public class ArithmaticProgressionMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        //AP - 4,7,10,13
        //Method 2 Without Nth term formula
        /*for loop = n rounds
        Now not printing i ,
        Making a different variable a
         */
        int a =4 , d=3;
        for(int i =1; i<=n; i++){//n = number of rounds
            System.out.println(a);
            a +=d;
//For negative series //5 , 1, -3, -7
            //int a=5, d=-4
        }
    }
}
