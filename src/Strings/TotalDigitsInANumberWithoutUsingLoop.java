package Strings;
import java.util.*;
public class TotalDigitsInANumberWithoutUsingLoop {
    public static void main(String[] args) {
//Return the total number of Digits in a number without using any loop.
//Hint : Try using inbuilt Integer.toString() function.

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number : ");
            int n = sc.nextInt();
            String s  = ""+ n ;
            //Iski jagah hum ek built-in function bhi use kar skte hain
            String k =Integer.toString(n);//This is a built-in function to convert an Integer to String.
            // s += n;
            System.out.println(s);
        System.out.println(s.length());

    }
}
