package Strings;
import java.util.*;
public class PalindromeOrNot {
    public static void main(String[] args) {
        //Not a very Good Code
        String str = "abcdcba";
        //There is no reverse function in Strings..
        //In order to get the reverse of the Strings , convert it to StringBuilder First;
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        //StringBuilder me hum String ko add kar sakte hai ..But kisi String me StringBuilder add karne ke liye
        //Use the hack String s = gtr + " ";
        String s = gtr + ""; //This is done in order to compare string with a string
        if(str.equals(s)){
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }
        //Much Better Code
        int i = 0;
        int n = str.length();
        int j = n - 1;
        boolean flag = true; //true-> PalinDrome
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
           }
            i++;
            j--;
        }
        if (flag == true) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
       }

    }
}