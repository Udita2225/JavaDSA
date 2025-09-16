package DynamicProgramming1D;
//1137. N-th Tribonacci Number
/*
The Tribonacci sequence Tn is defined as follows:
T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
Given n, return the value of Tn.
Example 1:
Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
Example 2:
Input: n = 25
Output: 1389537
Constraints:
0 <= n <= 37
The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.
*/
public class Leetcode1137NthTribonacciNumberMemoization {
/* By Recursion + Memoization
TC:- O(n)
Sc:- O(n)
class Solution {
    public int tribo(int n, int[] dp){
        if(n<=1) return n;
        if(n==2) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = tribo(n-1,dp)+ tribo(n-2,dp)+ tribo(n-3,dp);
    }
    public int tribonacci(int n) {
    int[] dp =  new int[n+1];
    Arrays.fill(dp,-1);
    return tribo(n,dp);
    }
}
/* By Recursion - Time Limit Exceeded
TC:- O(2^n)
SC:- O(n)
class Solution {
    public int tribonacci(int n) {
    if(n<=1) return n;
    if(n==2) return 1;
    return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }
}
*/
}
