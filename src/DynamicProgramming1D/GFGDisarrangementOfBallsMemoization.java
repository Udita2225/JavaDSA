package DynamicProgramming1D;
//Disarrangement of balls
/*
You are given n balls numbered from 1 to n and there are n baskets numbered from 1 to n in front of you. The ith basket
is meant for the ith ball. Calculate the number of ways in which no ball goes into its respective basket.
Note: The answer will always fit into a 32-bit integer.
Examples:
Input: n = 2
Output: 1
Explanation: For two balls {1, 2}, there is only one possible derangement {2, 1}.
Input: n = 3
Output: 2
Explanation: For three balls {1, 2, 3}, there are two possible derangements {3, 1, 2} and {2, 3, 1}.
Constraints:
1 ≤ n ≤ 12
Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)
Topic Tags
Combinatorial
*/
public class GFGDisarrangementOfBallsMemoization {
/*


Recursion + Memoization
// User function Template for Java
class Solution {
    static int DisArrange(int n, int[] dp){
        if(n<=1) return 0;
        if(n==2) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] =  (n-1)*(DisArrange(n-1,dp)+ DisArrange(n-2,dp));
    }
    static int countDer(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return DisArrange(n,dp);
    }
}


Simple Recursion
// User function Template for Java

class Solution {
    static int countDer(int n) {
        // Base case
        if(n<=1) return 0;
        if(n==2) return 1;
        return (n-1) * (countDer(n-1)+countDer(n-2));
    }
}
*/
}
