package Backtracking;
/*
46. Permutations
Medium
Topics
premium lock icon
Companies
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]


Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.
*/
public class Leetcode46PermutataionsOptimizedSpace {
    /*
    Auxillary Space - O(1)
    Output Space 0(n*n!)

    class Solution {
    public void swap(int i, int j, int[] nums){
        int temp =  nums[i];
        nums[i] =  nums[j];
        nums[j] =  temp;
    }
    public void helper(int[] nums, int idx, List<List<Integer>> ans){
        if(idx==nums.length-1){
            List<Integer> arr = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                arr.add(nums[i]);
            }
            ans.add(arr);
            return;
        }
        for(int x=idx; x<nums.length; x++){
           swap(x,idx,nums);
           helper(nums, idx+1, ans);
           swap(x,idx,nums);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    helper(nums,0,ans);
    return ans;
    }
}
     */
}
