package DynamicProgramming2D;
//279. Perfect Squares
/*
Given an integer n, return the least number of perfect square numbers that sum to n.
A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
Example 1:
Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4.
Example 2:
Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.
Constraints:
1 <= n <= 104
*/
public class LeetCode279PerfectSquaresMemoization {
/*
//Recursion + Memoization
class Solution {
    public boolean PerfectSquare(int n){
        int sqrt =  (int)Math.sqrt(n);
        return sqrt*sqrt==n;
    }
    public int minSquares(int n,int[] dp){
        if(PerfectSquare(n)) return 1;
        if(dp[n]!=-1) return dp[n];
        int min =  Integer.MAX_VALUE;
        for(int i=1; i*i<=n; i++){
            int rem = n - i*i;
            int count = 1 +  minSquares(rem,dp);
            min =  Math.min(min,count);
        }
        return dp[n] = min;
    }
    public int numSquares(int n) {
    int[] dp = new int[n+1];
    Arrays.fill(dp,-1);
    return minSquares(n,dp);
    }
}
*/
}
