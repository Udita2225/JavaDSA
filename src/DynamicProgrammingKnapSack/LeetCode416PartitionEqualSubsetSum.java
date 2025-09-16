package DynamicProgrammingKnapSack;
//416. Partition Equal Subset Sum
/*
Given an integer array nums, return true if you can partition the array into two subsets such that the sum of the
elements in both subsets is equal or false otherwise.
Example 1:
Input: nums = [1,5,11,5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].
Example 2:
Input: nums = [1,2,3,5]
Output: false
Explanation: The array cannot be partitioned into equal sum subsets.
Constraints:
1 <= nums.length <= 200
1 <= nums[i] <= 100
*/
public class LeetCode416PartitionEqualSubsetSum {
/*
class Solution {
    public boolean isPossible(int i, int[] nums, int sum, int[][] dp){
        if(sum==0) return true;
        if(i==nums.length) return false;
        if(dp[i][sum]!=-1) return dp[i][sum]==1;
        boolean skip =  isPossible(i+1,nums,sum,dp);
        boolean pick =  false;
        if(nums[i]<=sum) pick = isPossible(i+1,nums,sum-nums[i],dp);
        dp[i][sum] = skip||pick ? 1 : 0;
        return skip||pick;
    }
    public boolean canPartition(int[] nums) {
    int sum = 0;
    int n = nums.length;
    for(int i=0; i<n; i++){
        sum += nums[i];
    }
    if(sum%2!=0) return false;
    else{
        int[][] dp = new int[n][(sum/2)+1];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        return isPossible(0,nums,sum/2,dp);
    }
    }
}
*/
}
