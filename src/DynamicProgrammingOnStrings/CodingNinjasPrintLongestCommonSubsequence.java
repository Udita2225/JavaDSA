package DynamicProgrammingOnStrings;
/*
Problem statement
You are given two strings ‘s1’ and ‘s2’.
Return the longest common subsequence of these strings.
If there’s no such string, return an empty string. If there are multiple possible answers, return any such string.
Note:
Longest common subsequence of string ‘s1’ and ‘s2’ is the longest subsequence of ‘s1’ that is also a subsequence of ‘s2’.
A ‘subsequence’ of ‘s1’ is a string that can be formed by deleting one or more (possibly zero) characters from ‘s1’.
Example:
Input: ‘s1’  = “abcab”, ‘s2’ = “cbab”
Output: “bab”
Explanation:
“bab” is one valid longest subsequence present in both strings ‘s1’ , ‘s2’.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
5 6
ababa
cbbcad
Expected Answer:
"bba"
Output on console:
1
Explanation of sample output 1:
“bba” is only possible longest subsequence present in both s1 = “ababa” and s2 = “cbbcad”. '1' is printed if the returned
string is equal to "bba".
Sample Input 2:
3 3
xyz
abc
Expected Answer:
""
Output on console:
1
Explanation of sample output 2:
There’s no subsequence of ‘s1’ that is also present in ‘s2’. Thus an empty string is returned and '1' is printed.
Expected Time Complexity:
Try to solve this in O(n*m). Where ‘n’ is the length of ‘s1’ and ‘m’ is the length of ‘s2’.
Constraints:
1 <= n, m <= 10^3
Time Limit: 1 sec
*/
public class CodingNinjasPrintLongestCommonSubsequence {
/*
public class Solution {
    public static String findLCS(int n, int m, String s1, String s2){
        // Write your code here.
         StringBuilder a =  new StringBuilder(s1);
        StringBuilder b =  new StringBuilder(s2);
        int max = 0;
        int[][] dp = new int[n+1][m+1];
        StringBuilder  ans = new StringBuilder();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j] =  1 + dp[i-1][j-1];
                }
                else dp[i][j] =  Math.max(dp[i-1][j],dp[i][j-1]);
                }
        }
        int i = n;
        int j = m;
        while(i>0 && j>0){
            if(a.charAt(i-1)==b.charAt(j-1)){
                ans.append(a.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]) i--;
            else j--;
        }
        return ans.reverse().toString();
    }
}
*/
/* LeetCode
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
    int m = text1.length();
    int n = text2.length();
    int[][] dp = new int[m+1][n+1];
    for(int i=1; i<=m; i++){
        for(int j=1; j<=n; j++){
        if(text1.charAt(i-1)==text2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
        else dp[i][j] =  Math.max(dp[i-1][j], dp[i][j-1]);
        }
    }
    int i = m;
    int j = n;
    StringBuilder ans = new StringBuilder();
    while(i>0 && j>0){
        if(text1.charAt(i-1)==text2.charAt(j-1)){
            ans.append(text1.charAt(i-1));
            i--; j--;
        }
        else if(dp[i-1][j]>dp[i][j-1]) i--;
        else j--;
    }
    System.out.println(ans.reverse().toString());
    return dp[m][n];
    }
}
*/
}
