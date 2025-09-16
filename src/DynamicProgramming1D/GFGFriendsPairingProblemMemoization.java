package DynamicProgramming1D;
//Friends Pairing Problem
/*
Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only
once. Find out the total number of ways in which friends can remain single or can be paired up.
Examples :
Input: n = 3
Output: 4
Explanation:
{1}, {2}, {3} : All single
{1}, {2,3} : 2 and 3 paired but 1 is single.
{1,2}, {3} : 1 and 2 are paired but 3 is single.
{1,3}, {2} : 1 and 3 are paired but 2 is single.
Note that {1,2} and {2,1} are considered same.
Input: n = 2
Output: 2
Explanation:
{1} , {2} : All single.
{1,2} : 1 and 2 are paired.
Input: n = 1
Output: 1
Constraints:
1 ≤ n ≤ 18
Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)
Topic Tags
ModularArithmetic Algorithms Recursion
*/
public class GFGFriendsPairingProblemMemoization {
/*// User function Template for Java

    class Solution {
        public long Ways(int n, long[] dp){
            if(n<=2) return n;
            if (dp[n]!=-1) return dp[n];
            return dp[n] = Ways(n-1,dp) + (n-1)*Ways(n-2,dp);
        }
        public long countFriendsPairings(int n) {
            // code here
            long[] dp = new long[n+1];
            Arrays.fill(dp,-1);
            return Ways(n, dp);
        }
    }
/*
class Solution {
    public long countFriendsPairings(int n) {
        // code here
        if(n<=2) return n;
        return countFriendsPairings(n-1) + (n-1) * countFriendsPairings(n-2);
    }
}
*/

}
