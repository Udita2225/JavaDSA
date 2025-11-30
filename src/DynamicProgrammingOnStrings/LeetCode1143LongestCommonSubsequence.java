package DynamicProgrammingOnStrings;
//1143. Longest Common Subsequence
/*
Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common
subsequence, return 0.
A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted
without changing the relative order of the remaining characters.
For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings.
Example 1:
Input: text1 = "abcde", text2 = "ace"
Output: 3
Explanation: The longest common subsequence is "ace" and its length is 3.
Example 2:
Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
Example 3:
Input: text1 = "abc", text2 = "def"
Output: 0
Explanation: There is no such common subsequence, so the result is 0.
Constraints:
1 <= text1.length, text2.length <= 1000
text1 and text2 consist of only lowercase English characters.
*/
public class LeetCode1143LongestCommonSubsequence {
/*To avoid the base case conversion step, we can make dp larger i.e., m+1, n+1
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m+1][n+1]; // extra row & col for base case (0)

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[m][n]; // bottom-right cell has the final answer
        //It stores the LCS of subsequence(a,0,m-1) & subsequence(b,0,n-1)
    }
}*/
/*
class Solution {
    // TC:- O(m*n) SC:- O(m*n)
    public int longestCommonSubsequence(String text1, String text2) {
    StringBuilder a = new StringBuilder(text1);
    StringBuilder b = new StringBuilder(text2);
    int m = a.length();
    int n = b.length();
    int[][] dp =  new int[m][n];
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            int p = (i>=1 && j>=1)?dp[i-1][j-1]:0;
            int q = (j>=1)? dp[i][j-1] : 0;
            int r = (i>=1)? dp[i-1][j] : 0;
            if(a.charAt(i)==b.charAt(j)) dp[i][j] = 1 + p;
            else dp[i][j] =  Math.max(q,r);
        }
    }
    return dp[m-1][n-1];
    //It stores LCS of subsequence(a,0,m-1) & subsequence(b,0,n-1)
    }
}
*/
/*
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
    int m =  text1.length();
    int n =  text2.length();
    int[][] dp = new int[m][n];
    for(int i=0; i<m; i++){
        if(text1.charAt(i)==text2.charAt(0))
        dp[i][0] = 1;
        else if(i>0) dp[i][0] = dp[i-1][0];
    }
    for(int j=0; j<n; j++){
        if(text1.charAt(0)==text2.charAt(j))
        dp[0][j] = 1;
        else if(j>0) dp[0][j] = dp[0][j-1];
    }
    for(int i=1; i<m; i++){
        for(int j=1; j<n; j++){
            if(text2.charAt(j)==text1.charAt(i)) dp[i][j] = 1 + dp[i-1][j-1];
            else{
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }
    return dp[m-1][n-1];
    }
}
*/
/* Time Complexity:- O(m*n)
// Auxillary Space Complexity:- O(m*n)
class Solution {
    public int MaxLength(int i, int j,StringBuilder text1, StringBuilder text2, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(text1.charAt(i) == (text2.charAt(j))){
            return dp[i][j] = 1 + MaxLength(i-1,j-1,text1,text2,dp);
        }
        else{
            return dp[i][j] = Math.max(MaxLength(i,j-1,text1,text2,dp),MaxLength(i-1,j,text1,text2,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
    int m = text1.length();
    int n = text2.length();
    int[][] dp=  new int[m][n];
    for(int i=0; i<m; i++){
        Arrays.fill(dp[i],-1);
    }
    //String is pass-by Value
    //StringBuilder is pass-by Reference
    StringBuilder a =  new StringBuilder(text1);
    StringBuilder b =  new StringBuilder(text2);
    return MaxLength(m-1,n-1,a, b,dp);
    }
}
*/

    /*
class Solution {
    public int MaxLength(int i, int j,String text1, String text2, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(text1.charAt(i) == (text2.charAt(j))){
            return dp[i][j] = 1 + MaxLength(i-1,j-1,text1,text2,dp);
        }
        else{
            return dp[i][j] = Math.max(MaxLength(i,j-1,text1,text2,dp),MaxLength(i-1,j,text1,text2,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
    int m = text1.length();
    int n = text2.length();
    int[][] dp=  new int[m][n];
    for(int i=0; i<m; i++){
        Arrays.fill(dp[i],-1);
    }
    return MaxLength(m-1,n-1,text1, text2,dp);
    }
}
*/
}
