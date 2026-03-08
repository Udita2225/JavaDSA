package DynamicProgrammingMatrixChainMultiplication;
/*
1547. Minimum Cost to Cut a Stick
Given a wooden stick of length n units. The stick is labelled from 0 to n. For example, a stick of length 6 is labelled as follows:


Given an integer array cuts where cuts[i] denotes a position you should perform a cut at.

You should perform the cuts in order, you can change the order of the cuts as you wish.

The cost of one cut is the length of the stick to be cut, the total cost is the sum of costs of all cuts. When you cut a stick, it will be split into two smaller sticks (i.e. the sum of their lengths is the length of the stick before the cut). Please refer to the first example for a better explanation.

Return the minimum total cost of the cuts.



Example 1:


Input: n = 7, cuts = [1,3,4,5]
Output: 16
Explanation: Using cuts order = [1, 3, 4, 5] as in the input leads to the following scenario:

The first cut is done to a rod of length 7 so the cost is 7. The second cut is done to a rod of length 6 (i.e. the second part of the first cut), the third is done to a rod of length 4 and the last cut is to a rod of length 3. The total cost is 7 + 6 + 4 + 3 = 20.
Rearranging the cuts to be [3, 5, 1, 4] for example will lead to a scenario with total cost = 16 (as shown in the example photo 7 + 4 + 3 + 2 = 16).
Example 2:

Input: n = 9, cuts = [5,6,1,4,2]
Output: 22
Explanation: If you try the given cuts ordering the cost will be 25.
There are much ordering with total cost <= 25, for example, the order [4, 6, 5, 2, 1] has total cost = 22 which is the minimum possible.


Constraints:

2 <= n <= 106
1 <= cuts.length <= min(n - 1, 100)
1 <= cuts[i] <= n - 1
All the integers in cuts array are distinct.
*/
public class LeetCode1547MinimumCostToCutAStick {
    /*
    class Solution {
    public int mcm(int i, int j, int[] ans, int[][] dp){
        if(i>j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int minCost = Integer.MAX_VALUE;
        for(int k=i; k<=j; k++){
            int len = ans[j+1] - ans[i-1];
            int tc =  mcm(i,k-1,ans,dp) + mcm(k+1,j,ans,dp) + len;
            minCost = Math.min(minCost, tc);
        }
        return dp[i][j] =  minCost;
    }
    public int minCost(int n, int[] cuts) {
    int p =  cuts.length;
    int[] ans =  new int[p+2];
    for(int i=0; i<p; i++){
        ans[i] = cuts[i];
    }
    int m =  ans.length;
    ans[m-2] = 0;
    ans[m-1] = n;
    Arrays.sort(ans);
    int[][] dp =  new int[m-1][m-1];
    for(int i=0; i<m-1; i++){
        Arrays.fill(dp[i],-1);
    }
    return mcm(1,m-2,ans,dp);
    }
}
/* Tabulation
class Solution {
    public int minCost(int n, int[] cuts) {
    int p = cuts.length;
    int[] arr = new int[p+2];
    int m =  arr.length;
    // Copy-Paste
    for(int i=0; i<p; i++){
        arr[i] = cuts[i];
    }
    arr[m-2] = 0;
    arr[m-1] = n;
    Arrays.sort(arr);
    int[][] dp = new int[m][m];
    for(int i=m-2; i>0; i--){
        for(int j=1; j<=m-2; j++){
            if(i>j) dp[i][j] = 0;
            else{
                int min = Integer.MAX_VALUE;
                for(int k=i; k<=j; k++){
                    int len = arr[j+1] - arr[i-1];
                    int tc = dp[i][k-1] + dp[k+1][j] + len;
                    min = Math.min(min,tc);
                }
                dp[i][j] = min;
            }
        }
    }
    return dp[1][m-2];
    }
}
     */

    /*
    class Solution {
    public int cost(int i, int j, int[] arr,int[][] dp){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int min = Integer.MAX_VALUE;
        for(int k=i; k<=j; k++){
            int len = arr[j+1] -arr[i-1];
            int totalCost =  cost(i,k-1,arr,dp) + cost(k+1,j,arr,dp) + len;
            min =  Math.min(min,totalCost);
        }
        return dp[i][j] = min;
    }
    public int minCost(int n, int[] cuts) {
    int[] arr =  new int[cuts.length+2];
    int i;
    for(i=0; i<cuts.length; i++){
        arr[i] = cuts[i];
    }
    arr[i++] = 0;
    arr[i] = n;
    Arrays.sort(arr); // len = m
    // i =  1 to m-2 && j=m-2 to 1
    int m = arr.length;
    int[][] dp = new int[m-1][m-1];
    for(int k=0; k<m-1; k++){
        Arrays.fill(dp[k], -1);
    }
    return cost(1,arr.length-2,arr,dp);
    }
}
    */
}
