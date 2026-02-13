package DynamicProgrammingOnStrings;

public class LeetCode647PalindromicSubstrings {
/* 647. Palindromic Substrings
Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.



Example 1:

Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:

Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".


Constraints:

1 <= s.length <= 1000
s consists of lowercase English letters.

*/

/*
class Solution {
    public int countSubstrings(String s) {
    int n = s.length();
    int[][] dp = new int[n][n];
    int count = 0;
    for(int k=0; k<n; k++){
        int i=0, j=k;
        while(j<n){
            if(i==j){
                dp[i][j] = 1;
                count++;
            }
            else if(j==i+1){
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j] = 1;
                    count++;
                }
            }
            else{
                if(s.charAt(i)==s.charAt(j)){
                    if(dp[i+1][j-1]==1){
                        dp[i][j] = 1;
                        count++;
                    }
                }
            }
            i++;
            j++;
        }
    }
    return count;
    }
}

/*
My naadan code :_)
class Solution {
    public int countSubstrings(String s) {
    int n = s.length();
    int[][] dp = new int[n][n];
    int count = 0;
    for(int k=0; k<n; k++){ //Loop kitni baar chal raha hai
        int i=0;
        int j=k;
        if(k==0){
            while(j<n){
                dp[i][j] = 1;
                i++;
                j++;
            }
        }
        else if(k==1){
            while(j<n){
            if(s.charAt(i)==s.charAt(j)) dp[i][j] = 1;
            i++;
            j++;
            }
        }
        else{
            while(j<n){
            if(s.charAt(i)==s.charAt(j)) dp[i][j] = dp[i+1][j-1];
            i++; j++;
            }
        }
    }
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            count += dp[i][j];
        }
    }
    return count;
    }
}
*/

/*
// Brute Force - Accepted but not Optimal 825ms and beats only 9.22%
class Solution {
    public boolean Palindrome(int i, int j, String s){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public int countSubstrings(String s) {
    int n = s.length();
    int count = 0;
    for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
            if(Palindrome(i,j,s)) count++;
        }
    }
    return count;
    }
}*/
}
