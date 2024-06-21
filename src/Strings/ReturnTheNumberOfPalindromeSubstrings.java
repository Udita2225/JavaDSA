package Strings;
import java.util.*;
public class ReturnTheNumberOfPalindromeSubstrings {

        /*
        Given a string s, return the number of palindromic substrings in it
        Input s = "abc" a ab abc b bc c
        Output :- 3
         */
        public static boolean isPalindrome(String s){
            int i =0;
            int j = s.length()-1;
            while(i<j){
                if(s.charAt(i) != s.charAt(j)) return false;
                i++;
                j--;
            }
            return true;}
        public static void main(String[] args){
            String str = "abcba";
            int count =0;
            for(int i=0; i<str.length(); i++){
                for(int j =i+1; j<=str.length(); j++){
                    if(isPalindrome(str.substring(i,j))==true){
                        System.out.print(str.substring(i,j)+ " ");
                        count++;
                    }
                }
            }
            System.out.println( "\nThe number of palindromic Substrings :" + count);
        }
}
//Repetition is considered here
//THis can be avoided using Hashmap