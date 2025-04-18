package Recursion;
import java.util.*;
public class PrintDecreasingnto1ByUsingRecursion {
    public static void print(int n){
        if(n==0) return;//base case
        //Return matlab khatam
        System.out.print(n + " ");//work
        print(n-1);//call
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        print(n);
        //Using for loop
//        for(int i =n; i>0; i--){
//            System.out.println(i);
//        }
    }
}
//Output for n=5;
/*
5
4
3
2
1
 */