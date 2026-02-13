package DynamicProgrammingOnTrees;
/*
96. Unique Binary Search Trees
Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.

Example 1:

Input: n = 3
Output: 5
Example 2:

Input: n = 1
Output: 1

Constraints:

1 <= n <= 19
*/
public class LeetCode96UniqueBinarySearchTrees {
    /*
    class Solution {
    public int Trees(int n, int[] dp){
        if(n<=1) return 1;
        if(dp[n]!=0) return dp[n];
        for(int i=1; i<=n; i++){
            int left = Trees(i-1,dp);
            int right = Trees(n-i,dp);
            int mul = left*right;
            dp[n] += mul;
        }
        return dp[n];
    }
    public int numTrees(int n) {
    int[] dp = new int[n+1];
    return Trees(n,dp);
    }
}
/*
// TC:- O(n^2)
// AS:- O(n)
class Solution {
    public int numTrees(int n) {
    int[] dp =  new int[n+1];
    if(n<=1) return 1;
    dp[0] = 1;
    dp[1] = 1;
    dp[2] = 2;
    for(int i=3; i<=n; i++){
        for(int j=1; j<=i; j++){
            int left = j-1;
            int right = i-j;
            int mul = dp[left] * dp[right];
            dp[i] += mul;
        }
    }
    return dp[n];
    }
}
*/
}
