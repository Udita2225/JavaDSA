package DynamicProgrammingOnStrings;
/*
Minimum number of deletions
Given a string s. The task is to remove or delete the minimum number of characters from the string s, so that the resultant string forms a palindrome. Find the minimum number of characters we need to remove.
Note: The order of characters should be maintained.
Examples:
Input: s = "aebcbda"
Output: 2
Explanation: Remove characters 'e' and 'd'. Resultant string will be "abcba" which is a palindromic string.
Input: s = "aba"
Output: 0
Explanation: We don’t remove any character.
Constraints:
1 ≤ s.size() ≤ 103
Expected Complexities
Time Complexity: O(n^2)
Auxiliary Space: O(n^2)
Topic Tags
Strings Dynamic Programming  palindrome Data Structures Algorithms
Related Articles
Minimum Number Deletions Make String Palindrome
*/
public class GFGMinimumNumberOfDeletions {
/*
// By Memoization +  Recursion
Time Complexity: O(n^n);
Auxillary Space Complexity: O(n^n)
class Solution {
    public int LPS(int i, int j, StringBuilder a, StringBuilder b, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j] =  1 + LPS(i-1,j-1,a,b,dp);
        else return dp[i][j] =  Math.max(LPS(i-1,j,a,b,dp), LPS(i,j-1,a,b,dp));
    }
    public int minDeletions(String s) {
        // code here
        StringBuilder a =  new StringBuilder(s);
        StringBuilder b =  new StringBuilder(s).reverse();
        int n = s.length();
        int[][] dp =  new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        return n - LPS(n-1,n-1,a,b,dp);
    }
}
*/
/*
class Solution {
    public int minDeletions(String s) {
        // code here
        // By Tabulation
        StringBuilder a =  new StringBuilder(s);
        StringBuilder b =  new StringBuilder(s).reverse();
        int n =  s.length();
        int[][] dp = new int[n+1][n+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] =  Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return n - dp[n][n];
    }
}
*/
}
