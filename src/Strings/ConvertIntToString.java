package Strings;
import java.util.*;
public class ConvertIntToString {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        String s  = ""+ n ;
       // s += n;
        System.out.println(s);
    }
}
