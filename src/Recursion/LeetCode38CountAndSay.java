package Recursion;
import java.util.*;
//LeetCode38. Count and Say
public class LeetCode38CountAndSay {
/*
The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
countAndSay(1) = "1"
countAndSay(n) is the run-length encoding of countAndSay(n - 1).
Run-length encoding (RLE) is a string compression method that works by replacing consecutive identical characters
(repeated 2 or more times) with the concatenation of the character and the number marking the count of the characters
(length of the run). For example, to compress the string "3322251" we replace "33" with "23", replace "222" with "32",
replace "5" with "15" and replace "1" with "11". Thus the compressed string becomes "23321511".
Given a positive integer n, return the nth element of the count-and-say sequence.
Example 1:
Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = RLE of "1" = "11"
countAndSay(3) = RLE of "11" = "21"
countAndSay(4) = RLE of "21" = "1211"
Example 2:
Input: n = 1
Output: "1"
Explanation:
This is the base case.
Constraints:
1 <= n <= 30
*/
public static void main(String[] args) {
  /*  class Solution {
        public String countAndSay(int n) {
            if(n==1) return "1"; //base case
            String s =countAndSay(n-1) + "*";//Hack for avoiding the extra three lines afer while loop
            //now we have to modify s
            String ans = "";
            int i =0, j=0;
            while(j<s.length()){
                if(s.charAt(i)==s.charAt(j)) j++;
                else{
                    int len =j-i;
                    ans += len;
                    ans += s.charAt(i);
                    i=j;
                }
            }
            return ans;
            //We can use a hack in order to avoid writing these three following codes
            //We can add any character except numbers while calling countAndSay(n-1) as this will
            //cause the added character to get remained.

        /*int len = j-i;
        ans+=len;
        ans+=s.charAt(i);
        return ans;}
        }
   */
        }
    }




