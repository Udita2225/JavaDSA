package Recursion;
import java.util.*;
public class SumParameterisedVoidType {
    public static void sum(int n, int s){
        if(n==0){//base case
            System.out.print(s);
            return;
        }
        sum(n-1, s+n);//call and work
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        sum(n,0);
    }
}
