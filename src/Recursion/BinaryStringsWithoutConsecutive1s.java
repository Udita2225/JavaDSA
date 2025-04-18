package Recursion;
import java.util.*;
public class BinaryStringsWithoutConsecutive1s {
    public static void printStrings(String s , int n){
        int  length = s.length();
       if(length==n){
           System.out.println(s);
           return;
       }
       /*
       For printing all the possible cases , just remove the if/else case
          int  length = s.length();
       if(length==n){
           System.out.println(s);
           return;
       }
       printStrings(s+1,n);
       printStrings(s+0,n);
       }
        */
       if(length==0 || s.charAt(length-1)=='0'){
           printStrings(s+"0",n);
           printStrings(s+"1", n);
       }
       else printStrings(s+"0",n);//It means s.charAt(length-1)==1
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        printStrings("",n);
    }
}
/*
Enter n :
3
000
001
010
100
101
 */