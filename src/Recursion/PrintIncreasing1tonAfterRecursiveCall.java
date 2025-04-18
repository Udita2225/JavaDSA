package Recursion;
import java.util.*;
public class PrintIncreasing1tonAfterRecursiveCall {
        //AFTER RECURSIVE CALL
        //This code is exactly same as the code of printing decreasing n to 1
        //The only difference is that we have interchanged the call and work statement
        public static void print(int n){
            if(n==0) return;//base case
            //Return matlab khatam
            print(n-1);//call
            System.out.print(n + " ");//work
            // 1 2 3 4 5 6 //call pehle kaam baad me
        }
//        public static void print(int n){
//            if(n==0) return;//base case
//            //Return matlab khatam
//            System.out.print(n + " ");
//            print(n-1);//call
//            System.out.print(n + " ");//work
//       } Output: -  5 4  3 2 1 1 2 3 4 5
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            print(n);
    }
}
