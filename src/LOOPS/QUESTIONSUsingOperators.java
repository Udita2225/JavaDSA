package LOOPS;
import java.util.Scanner;
public class QUESTIONSUsingOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt();
        //Program to count the digits of a number
        int count=0;
        while(n!=0){
           n/=10;
           count++;
        }//this code is wrong when n>0 and number is difficult
         System.out.println(count);


    }
}
