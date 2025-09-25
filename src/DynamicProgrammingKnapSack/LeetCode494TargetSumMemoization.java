package DynamicProgrammingKnapSack;
//494. Target Sum
/*
You are given an integer array nums and an integer target.
You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and
then concatenate all the integers.
For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the
expression "+2-1".
Return the number of different expressions that you can build, which evaluates to target.
Example 1:
Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3
Example 2:
Input: nums = [1], target = 1
Output: 1
Constraints:
1 <= nums.length <= 20
0 <= nums[i] <= 1000
0 <= sum(nums[i]) <= 1000
-1000 <= target <= 1000
*/
public class LeetCode494TargetSumMemoization {
/*
class Solution {
    static int sum;
    public int Ways(int i, int[] nums, int res, int target, int[][] dp){
        if(i==nums.length) {
            if(res==target) return 1;
            else return 0;
        }
        if(dp[i][res+sum]!=-1) return dp[i][res+sum];
        int add = Ways(i+1,nums,res-nums[i],target,dp);
        int sub = Ways(i+1,nums,res+nums[i],target,dp);
        return dp[i][res+sum] = add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
    // i -> 0 to n-1 || res = -sum to sum
    // dp[i][res+sum] -> ways(i,res)
    sum = 0;
    int n = nums.length;
    for(int ele:nums) sum+=ele;
    int[][] dp = new int[n][2*sum+1];
    for(int i=0; i<n; i++){
        Arrays.fill(dp[i],-1);
    }
    return Ways(0,nums,0,target,dp);
    }
}
 */
}
