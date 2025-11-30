package DynamicProgrammingOnStrings;
//516. Longest Palindromic Subsequence
/*
Given a string s, find the longest palindromic subsequence's length in s.
A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without
changing the order of the remaining elements.
Example 1:
Input: s = "bbbab"
Output: 4
Explanation: One possible longest palindromic subsequence is "bbbb".
Example 2:
Input: s = "cbbd"
Output: 2
Explanation: One possible longest palindromic subsequence is "bb".
Constraints:
1 <= s.length <= 1000
s consists only of lowercase English letters.
*/
public class LeetCode516LongestPalindromeSubsequence {
/*
//Memoization +  Recursion
//Time Complexity :- O(m^2)
//Auxillary Space Complexity :- O(m^2)
class Solution {
    public int MaxLength(int i,int j, StringBuilder a, StringBuilder b, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j] = 1+ MaxLength(i-1,j-1,a,b,dp);
        else return dp[i][j] = Math.max(MaxLength(i-1,j,a,b,dp), MaxLength(i,j-1,a,b,dp));
    }
    public int longestPalindromeSubseq(String s) {
    StringBuilder a =  new StringBuilder(s);
    StringBuilder b =  new StringBuilder(a).reverse();
    int m = s.length();
    int[][] dp = new int[m][m];
    for(int i=0; i<m; i++){
        Arrays.fill(dp[i],-1);
    }
    return MaxLength(m-1,m-1,a,b,dp);
    }
}
/*
Tabulation
class Solution {
    public int longestPalindromeSubseq(String s) {
    StringBuilder a =  new StringBuilder(s);
    StringBuilder b =  new StringBuilder(a).reverse();
    // StringBuilder b =  new StringBuilder(a.reverse());
    // a.reverse();
    int m = a.length();
    int[][] dp = new int[m+1][m+1];
    for(int i=1; i<=m; i++){
        for(int j=1; j<=m; j++){
        if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
        else{
            dp[i][j] =  Math.max(dp[i-1][j], dp[i][j-1]);
        }
        }
    }
    return dp[m][m];
    }
}

*/
}
