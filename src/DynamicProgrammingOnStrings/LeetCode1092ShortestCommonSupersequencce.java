package DynamicProgrammingOnStrings;

public class LeetCode1092ShortestCommonSupersequencce {
//1092. Shortest Common Supersequence

/*
Given two strings str1 and str2, return the shortest string that has both str1 and str2 as subsequences. If there are multiple valid strings, return any of them.

A string s is a subsequence of string t if deleting some number of characters from t (possibly 0) results in the string s.

Example 1:

Input: str1 = "abac", str2 = "cab"
Output: "cabac"
Explanation:
str1 = "abac" is a subsequence of "cabac" because we can delete the first "c".
str2 = "cab" is a subsequence of "cabac" because we can delete the last "ac".
The answer provided is the shortest such string that satisfies these properties.
Example 2:

Input: str1 = "aaaaaaaa", str2 = "aaaaaaaa"
Output: "aaaaaaaa"


Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of lowercase English letters.

Seen this question in a real interview before?
1/5
Yes
No
Accepted
299,876/485.8K
Acceptance Rate
61.7%
Topics
icon
Companies
Hint 1
We can find the length of the longest common subsequence between str1[i:] and str2[j:] (for all (i, j)) by using dynamic programming.
Hint 2
We can use this information to recover the shortest common supersequence.
*/

/*
class Solution {
    public String lcs(int[][] dp, String str1, String str2){
        int m = dp.length;
        int n = dp[0].length;
        int i=m-1;
        int j=n-1;
        StringBuilder lcs =  new StringBuilder();
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                lcs.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]) i--;
            else j--;
        }
        return lcs.reverse().toString();
    }
    public String shortestCommonSupersequence(String str1, String str2) {
    int m = str1.length();
    int n = str2.length();
    int[][] dp =  new int[m+1][n+1];
    for(int i=1; i<=m; i++){
        for(int j=1; j<=n; j++){
            if(str1.charAt(i-1)==str2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
            else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        }
    }
    int lengthOfSCS =  m + n - dp[m][n];
    System.out.println(lengthOfSCS);
    String lcs = lcs(dp,str1,str2);
    System.out.println(lcs);
    int i = 0;
    int j = 0;
    int k = 0;
    StringBuilder ans  =  new StringBuilder();
    while(k<lcs.length()){
        while(i<str1.length() && str1.charAt(i)!=lcs.charAt(k)){
            ans.append(str1.charAt(i));
            i++;
        }
        while(j<str2.length() && str2.charAt(j)!=lcs.charAt(k)){
            ans.append(str2.charAt(j));
            j++;
        }
        // Now str1.charAt(i)==lcs.charAt(k) && str2.charAt(j)==lcs.charAt(k)
        ans.append(lcs.charAt(k));
        i++;
        j++;
        k++;
    }
    System.out.println(ans);
    while(i<str1.length()){
        ans.append(str1.charAt(i));
        i++;
    }
    while(j<str2.length()){
        ans.append(str2.charAt(j));
        j++;
    }
    return ans.toString();
    }
}
*/

}
