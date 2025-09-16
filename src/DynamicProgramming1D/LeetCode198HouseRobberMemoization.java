package DynamicProgramming1D;
//198. House Robber
/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and
it will automatically contact the police if two adjacent houses were broken into on the same night.
Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can
rob tonight without alerting the police.
Example 1:
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 2:
Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.
Constraints:
1 <= nums.length <= 100
0 <= nums[i] <= 400
*/
public class LeetCode198HouseRobberMemoization {

/* By using Take and Skip Method
class Solution {
    public int amount(int[] nums, int i, int[] dp){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take = nums[i] + amount(nums, i+2,dp);
        int skip = amount(nums, i+1,dp);
        return dp[i] = Math.max(take,skip);
    }
    public int rob(int[] nums) {
        // 'i' varies from 0 to n-1
        // dp will store the value of amount(i)
        int n =  nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return amount(nums,0,dp);
    }
}
/*Recursion + Memoization
class Solution {
    public int MaxMoney(int[] nums, int idx, int[] dp){
        if(idx>=nums.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx] =  nums[idx] + Math.max(MaxMoney(nums,idx+2,dp), MaxMoney(nums, idx+3,dp));
    }
    public int rob(int[] nums) {
    int n =  nums.length;
    int[] dp =  new int[n];
    Arrays.fill(dp,-1);
    return Math.max(MaxMoney(nums,0,dp), MaxMoney(nums,1,dp));
    }
}
//Pure Recursion
//Time Complexity -O(2^n)
class Solution {
    public int MaxMoney(int[] nums, int idx){
    int n = nums.length;
    if(idx>=n) return 0;
    return nums[idx] + Math.max(MaxMoney(nums, idx+2), MaxMoney(nums, idx+3));
    }
    public int rob(int[] nums) {
    return Math.max(MaxMoney(nums,0), MaxMoney(nums,1));
    }
}
*/
}
