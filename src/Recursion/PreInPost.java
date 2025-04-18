package Recursion;
import java.util.*;
public class PreInPost {
    public static void pip(int n){
        if(n==0) return;
        System.out.println("pre "+n);
        pip(n-1);
        System.out.println("in "+n);
        pip(n-1);
        System.out.println("post "+n);
        /*
        pre 3
        pre 2
        pre 1
        in 1
        post 1
        in 2
        pre 1
        in 1
        post 1
        post 2
        in 3
        pre 2
        pre 1
        in 1
        post 1
        in 2
        pre 1
        in 1
        post 1
        post 2
        post 3

         */
    }
    public static void main(String[] args) {
        pip(3);
//public static void pip(int n){
//    if(n==0) return;
//    System.out.print(n+ " ");
//    pip(n-1);
//    System.out.print(n+ " ");
//    pip(n-1);
//    System.out.print(n+ " ");
//}
//    public static void main(String[] args) {
//        pip(4);
//        //Output
//        // 432111211123211121112343211121112321112111234
    }
}
