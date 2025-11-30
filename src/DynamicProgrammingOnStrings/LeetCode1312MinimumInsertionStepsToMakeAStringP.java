package DynamicProgrammingOnStrings;
//1312. Minimum Insertion Steps to Make a String Palindrome
/*
Given a string s. In one step you can insert any character at any index of the string.
Return the minimum number of steps to make s palindrome.
A Palindrome String is one that reads the same backward as well as forward.
Example 1:
Input: s = "zzazz"
Output: 0
Explanation: The string "zzazz" is already palindrome we do not need any insertions.
Example 2:
Input: s = "mbadm"
Output: 2
Explanation: String can be "mbdadbm" or "mdbabdm".
Example 3:
Input: s = "leetcode"
Output: 5
Explanation: Inserting 5 characters the string becomes "leetcodocteel".
Constraints:
1 <= s.length <= 500
s consists of lowercase English letters.
*/
public class LeetCode1312MinimumInsertionStepsToMakeAStringP {
/*
//Steps = s.length() - LPS(s) Longest Palindromic Sequence
//By Using Memoization +  Recursion
class Solution {
    public int MaxLen(int i, int j, StringBuilder a, StringBuilder b, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j] = 1 +  MaxLen(i-1, j-1, a, b, dp);
        else return dp[i][j] = Math.max(MaxLen(i,j-1,a,b,dp), MaxLen(i-1,j,a,b,dp));
    }
    public int minInsertions(String s) {
        StringBuilder a =  new StringBuilder(s);
        StringBuilder b =  new StringBuilder(s).reverse();
        int n =  s.length();
        int[][] dp =  new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        return n - MaxLen(n-1,n-1,a,b,dp);
    }
}
/* By Using Tabulation
class Solution {
    public int minInsertions(String s) {
    StringBuilder a = new StringBuilder(s);
    StringBuilder b = new StringBuilder(s).reverse();
    int m =  s.length();
    int[][] dp = new int[m+1][m+1];
    for(int i=1; i<=m; i++){
        for(int j=1; j<=m; j++){
            if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j]  = 1 + dp[i-1][j-1];
            else dp[i][j] =  Math.max(dp[i-1][j], dp[i][j-1]);
        }
    }
    return m - dp[m][m];
    }
}
*/
}
