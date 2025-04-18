package Recursion;
import java.util.*;
public class SkipACharacterStringRecursion {
    //Skip a Character
    //Remove all occurrences of 'a' from a String.
    public static void skip (int i, String s , String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        /*
        if(s.charAt(i) != 'a') ans += s.charAt(i);
        skip(i+1, s, ans);
        */
        if(s.charAt(i) != 'a') skip(i+1,s,ans+s.charAt(i));
        else skip(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s = "Raghav Garg";
        skip(0, s, ""); //"" This is an empty string
    }
}
//Output :- Rghv Grg