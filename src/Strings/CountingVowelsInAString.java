package Strings;
import java.util.*;
public class CountingVowelsInAString {
    public static void main(String[] args) {
//Input a string and count all the vowels in the given string.
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter A String : ");
     String s = sc.nextLine();
     int n =s.length();
     int count =0;
     for(int i =0; i<n; i++){
         char ch = s.charAt(i);
         if(isVowel(ch)==true) count++;
     }
        System.out.println(count);
    }
     public static boolean isVowel(char ch){
         if(ch=='a' || ch == 'A') return true;
         if(ch=='e' || ch == 'E') return true;
         if(ch=='i' || ch == 'I') return true;
         if(ch=='o' || ch == 'O') return true;
         if(ch=='u' || ch == 'U') return true;
         else return false;
     }
}

