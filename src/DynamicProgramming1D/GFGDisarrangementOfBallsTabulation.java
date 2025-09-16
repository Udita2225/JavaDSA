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
public class GFGDisarrangementOfBallsTabulation {
/*    By Tabulation
// User function Template for Java

    class Solution {
        static int countDer(int n) {
            // Base case
            int[] dp = new int[n+1];
            if(n>0) dp[0] = 0;
            if(n>=1) dp[1] = 0;
            if(n>=2) dp[2] = 1;
            for(int i=3; i<=n; i++){
                dp[i] = (i-1) * (dp[i-1]+dp[i-2]);
            }
            return dp[n];
        }
    }*/
}
