package Recursion;
import java.util.*;
public class sumReturnType {
    public static int sum(int n){
        if(n==0 || n==1){//base case
            return n;
        }
        else return n + sum(n-1);//call
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
