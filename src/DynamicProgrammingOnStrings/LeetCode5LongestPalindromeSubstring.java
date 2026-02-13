package DynamicProgrammingOnStrings;

// Leetcode 5 Longest Palindromic Substring
/*
Given a string s, return the longest palindromic substring in s.



Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"


Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.

Hint 1
How can we reuse a previously computed palindrome to compute a larger palindrome?
Hint 2
If “aba” is a palindrome, is “xabax” a palindrome? Similarly is “xabay” a palindrome?
Hint 3
Complexity based hint:
If we use brute-force and check whether for every start and end position a substring is a palindrome we have O(n^2) start - end pairs and O(n) palindromic checks. Can we reduce the time for palindromic checks to O(1) by reusing some previous computation.

*/
public class LeetCode5LongestPalindromeSubstring {
/*
  class Solution {
    public String longestPalindrome(String s) {
    int n = s.length();
    int maxLen = 0;
    int[][] dp = new int[n][n];
    int startIdx = 0;
    int lastIdx = 0;
    for(int k=0; k<n; k++){
        int i=0;
        int j=k;
        while(j<n){
            if(i==j){
                dp[i][j] = 1;
            }
            else if(j==i+1){
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j] = 2;
                }
            }
            else{
                if(s.charAt(i)==s.charAt(j)){
                    if(dp[i+1][j-1]!=0){
                        dp[i][j] = j-i+1;
                    }
                }
            }
            if(dp[i][j]>maxLen){
                maxLen = dp[i][j];
                startIdx = i;
                lastIdx = j;
            }
            i++;
            j++;
        }
    }
    return s.substring(startIdx, lastIdx+1);
    }
}
/* Very Bad Time Complexity:- 1570ms Beats only 9.79%
class Solution {
    public boolean Palindrome(int i, int j, String s){
        int x =i;
        int y =j;
        while(x<=y){
            if(s.charAt(x)!=s.charAt(y)) return false;
            x++;
            y--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
    int n = s.length();
    int maxLen = 0;
    String ans = "";
    for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
            if(Palindrome(i,j,s)){
                int len =  j-i+1;
                if(len>maxLen){
                    String str  = s.substring(i,j+1);
                    ans = str;
                    maxLen = len;
                }
            }
        }
    }
    return ans;
    }
}*/
}
