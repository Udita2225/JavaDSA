package DynamicProgramming1D;
//509. Fibonacci Number
/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is
the sum of the two preceding ones, starting from 0 and 1. That is,
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
Example 1:
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
Constraints:
0 <= n <= 30
*/
public class LeetCode509FibonacciNumber {
/*
// Tabulation Iterative DP
// Bottom- Up DP - TC:- O(n), SC:- O(n)
// DP = Using previous results to compute new results
class Solution {
    public int fib(int n) {
    if(n<=1) return n;
    int[] dp =  new int[n+1];
    dp[0] = 0; dp[1] = 1;
    for(int i=2; i<=n; i++){
        dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
    }
}


//Top-Down DP
//Recursion + Memoization
class Solution {
    // static int[] dp; It is not recommended
    public int fibo(int n, int[] dp){
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n]; //new
        // int ans = fibo(n-1, dp) + fibo(n-2, dp);
        // dp[n] = ans; //new
        // return ans;
        return dp[n] = fibo(n-1, dp) + fibo(n-2,dp);
    }
    public int fib(int n) {
    //The name of array can be dp, memo, lookup
    int[] dp = new int[n+1]; //Index from 0 to n
    return fibo(n, dp);
    }
}
*/
// Using Pure Recursion
/*
class Solution {
    public int fib(int n) {
    if(n==0) return 0;
    if(n==1 || n==2) return 1;
    return fib(n-1)+fib(n-2);
    }
}
*/
}
