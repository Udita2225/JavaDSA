package DynamicProgrammingOnStrings;
//583. Delete Operation for Two Strings
/*
Given two strings word1 and word2, return the minimum number of steps required to make word1 and word2 the same.
In one step, you can delete exactly one character in either string.
Example 1:
Input: word1 = "sea", word2 = "eat"
Output: 2
Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".
Example 2:
Input: word1 = "leetcode", word2 = "etco"
Output: 4
Constraints:
1 <= word1.length, word2.length <= 500
word1 and word2 consist of only lowercase English letters.
*/
public class LeetCode583DeleteOperationForTwoStrings {
/* By Memoization +  Recursion
class Solution {
    public int LCS(int i, int j, StringBuilder a, StringBuilder b, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j] = 1 + LCS(i-1,j-1,a,b,dp);
        else return dp[i][j] =  Math.max(LCS(i-1,j,a,b,dp), LCS(i,j-1,a,b,dp));
    }
    public int minDistance(String word1, String word2) {
    StringBuilder a =  new StringBuilder(word1);
    StringBuilder b =  new StringBuilder(word2);
    int m =  word1.length();
    int n =  word2.length();
    int[][] dp = new int[m][n];
    for(int i=0; i<m; i++){
        Arrays.fill(dp[i],-1);
    }
    int common = LCS(m-1,n-1,a,b,dp);
    int x = m-common;
    int y = n-common;
    return x+y;
    }
}
*/
/*
// By Tabulation
class Solution {
    public int minDistance(String word1, String word2) {
    StringBuilder a =  new StringBuilder(word1);
    StringBuilder b =  new StringBuilder(word2);
    int m =  word1.length();
    int n =  word2.length();
    int[][] dp = new int[m+1][n+1];
    for(int i=1; i<=m; i++){
        for(int j=1; j<=n; j++){
            if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
            else dp[i][j] =  Math.max(dp[i-1][j],dp[i][j-1]);
        }
    }
    int x = m - dp[m][n];
    int y = n - dp[m][n];
    return x+y;
    }
}
*/
}
