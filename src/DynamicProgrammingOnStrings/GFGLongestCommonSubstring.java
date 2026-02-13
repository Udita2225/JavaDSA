package DynamicProgrammingOnStrings;
//Longest Common Substring
/*
You are given two strings s1 and s2. Your task is to find the length of the longest common substring among the given
strings.
Examples:
Input: s1 = "ABCDGH", s2 = "ACDGHR"
Output: 4
Explanation: The longest common substring is "CDGH" with a length of 4.
Input: s1 = "abc", s2 = "acb"
Output: 1
Explanation: The longest common substrings are "a", "b", "c" all having length 1.
Input: s1 = "YZ", s2 = "yz"
Output: 0
Constraints:
1 <= s1.size(), s2.size() <= 103
Both strings may contain upper and lower case alphabets.
Expected Complexities
Time Complexity: O(n * m)
Auxiliary Space: O(n * m)
Company Tags
Morgan StanleyAmazonMicrosoft
Topic Tags
StringsDynamic ProgrammingData StructuresAlgorithms
Related Articles
Longest Common Substring Dp 29Longest Common Substring Space Optimized Dp Solution
*/
public class GFGLongestCommonSubstring {
/*
class Solution {
    int max = 0;
    public int LongestSubstring(int i, int j, StringBuilder s1, StringBuilder s2, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1){
            max = Math.max(dp[i][j], max);
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j] = 1 + LongestSubstring(i-1,j-1,s1,s2,dp);
            max = Math.max(dp[i][j], max);
            return dp[i][j];
        }
        else return dp[i][j] = 0;
    }
    public int longCommSubstr(String x, String y) {
        // code here
        int m = x.length();
        int n = y.length();
        StringBuilder s1 = new StringBuilder(x);
        StringBuilder s2 = new StringBuilder(y);
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                LongestSubstring(i,j,s1,s2,dp);
            }
        }
        return max;
    }
}
/*
By Tabulation
class Solution {
    public int longCommSubstr(String s1, String s2) {
        // code here
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        int max = 0;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    max = Math.max(dp[i][j], max);
                }
                else dp[i][j] = 0;
            }
        }
        return max;
    }
}

*/
}
