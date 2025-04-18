package Recursion;
import java.util.*;
public class NthStairPath {
    //Find no of ways to reach nth stair if 1 or 2 jumps are allowed at a time.
//    public static int Stair(int n){
//        if(n<=2){
//            return n;
//        }
//        return Stair(n-1)+Stair(n-2);
//    }
//    public static void main(String[] args) {
//    //Nth Stair Path
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//        System.out.println(Stair(n));
//
//    }
//}
    //If only 1 and 3 jumps are allowed
    public static int Stair(int n){
    if(n==1) return 1;
    if(n==2) return 1;
    if(n==3) return 2;
    return Stair(n-1)+Stair(n-3);
}
public static void main(String[] args) {
    //Nth Stair Path
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = sc.nextInt();
    System.out.println(Stair(n));
    }
}