package Recursion;
import java.util.*;
import java.util.Scanner;
public class FactorialRecursion {
    public static int fact(int n){
        if(n==1 || n==0) return 1;
        int ans = n*fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        //By Using for loop
//        int fact =1;
//        for(int i =1; i<=n; i++){
//            fact *= i;5
//        }
//        System.out.println(fact);
        System.out.println(fact(n));

    }
}
