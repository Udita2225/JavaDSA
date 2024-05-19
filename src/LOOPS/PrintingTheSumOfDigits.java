package LOOPS;
import java.util.Scanner;
public class PrintingTheSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n =sc.nextInt();
        //HINTS:- Previous Question
        //5+1+8+7 = 7+8+1+5
        //n%10 = Last Digit
        /* n =5187
        sum =0
        sum =0+n
        ALGORITHM:
        int sum =0;
        while(n!=0){
        int lastDigit= n%10;//Remainder is the last Digit
        sum+= lastDigit;
        n/=10;

         */
        //code
        int sum =0;
        while(n!=0){
            int lastdigit = n%10;
            sum+= lastdigit;
            n/=10;
        }
        System.out.println(sum);

    }
}
