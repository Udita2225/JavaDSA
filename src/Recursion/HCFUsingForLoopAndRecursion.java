package Recursion;
import java.util.*;
public class HCFUsingForLoopAndRecursion {
    //HCF - Highest Common Factor GCD - Greatest Common Divisor (Both are same)
    //In this code hcf is iterative code and gcd is recursive code
    //By Using for loop
    //Here the Time Complexity is O(min(a,b)) This is not a good Time Complexity.
    public static int hcf(int a, int b){
        int min = Math.min(a,b);
        for(int i = min; i>=1; i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
    return 1;
    }
    //By Using Recursion gcd - Recursive code
    //Here the time complexity is
    public static int gcd(int a , int b){
        if(b%a==0) return a;
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        //By using for loop
        System.out.println(hcf(a,b));
        //By Using Recursion (Recursive loop)
        System.out.println(gcd(a,b));

    }
}
