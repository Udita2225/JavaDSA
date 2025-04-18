package Recursion;
import java.util.*;
//public class PrintIncreasing1tonByRecursion {
//    static int n ;//Global Variable
//    public static void print(int x){
//        if(x>n) return;
//        System.out.println(x);
//        print(x+1);
//    }
//    public static void main(String[] args) {
//            Scanner sc =new Scanner(System.in);
//            System.out.print("Enter n : ");
//             n = sc.nextInt();
//            print(1);
//    }
//}
//Extra Parameter
public class PrintIncreasing1tonByRecursion {
    public static void print(int x, int n){
        if(x>n) return ;//base case
        System.out.println(x);//work
        print(x+1,n);//call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        print(1, n);
    }
}