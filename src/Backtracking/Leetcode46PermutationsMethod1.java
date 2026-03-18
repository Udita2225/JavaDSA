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
public class Leetcode46PermutationsMethod1 {
    /* Here the time complexity is O(n*n!  and space complexity is O(n*n!))
// We can improve space complexity using a different method
class Solution {
    public void helper(int[] nums, List<Integer> arr, List<List<Integer>> ans, boolean[] used){
        if(arr.size()==nums.length){
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(used[i]==true) continue;
            used[i] = true;
            arr.add(nums[i]);//choose
            helper(nums,arr,ans,used);//explore
            arr.remove(arr.size()-1);//undo
            used[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
    int n =  nums.length;
    boolean[] used = new boolean[n]; //O(n)
    List<List<Integer>> ans = new ArrayList<>();//mandatory
    List<Integer> arr =  new ArrayList<>(); //O(n)
    helper(nums,arr,ans,used);
    return ans;
    }
}
*/
}
