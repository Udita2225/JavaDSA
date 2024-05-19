package LOOPS;
import java.util.Scanner;
public class DispalyingAPuptoNthterm {//n= NO.of terms
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n");
        //Method 1
        /*
        a , a+d, a+2d, .....a+(n-1)d
        an=a+(n-1)d
        an=1+(n-1)2
        an=1+2n-2
        an=2n-1
         */
        int n = sc.nextInt(); // 1 3 5 7 9
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            System.out.println(i);
        }//n= no. of rounds
        /* For the AP:-
        4,7,10,13,16...
        an=a+(n-1)d
        an=4+(n-1)3
        an=4+3n-3
        an=3n+1(nth term)

         */
        //for(int i=4; i<=3*n+1; i+=3){
        // System.out.println(i);
        //}

    }
}
