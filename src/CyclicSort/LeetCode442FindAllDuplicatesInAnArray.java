package CyclicSort;
//LeetCode 442 Find All Duplicates in an Array
/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears
at most twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to
store the output
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:
Input: nums = [1,1,2]
Output: [1]
Example 3:
Input: nums = [1]
Output: []
Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.
*/
public class LeetCode442FindAllDuplicatesInAnArray {
/*
class Solution {
    public void swap(int i, int j, int[] nums){
        nums[i] =  nums[i] + nums[j];
        nums[j] =  nums[i] - nums[j];
        nums[i] =  nums[i] - nums[j];
    }
    public List<Integer> findDuplicates(int[] nums) {
    int n =  nums.length;
    List<Integer> ans = new ArrayList<>();
    int i=0;
    while(i<n){
        if(nums[i] == i+1 || nums[i]==nums[nums[i]-1]) i++;
        else swap(i, nums[i]-1, nums);
    }
    for( i=0; i<n; i++) if(nums[i]!=i+1) ans.add(nums[i]);
    return ans;
    }
}
/* This is accepted. But using Constant auxillary space is required.
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    int n =  nums.length;
    List<Integer> ans = new ArrayList<>();
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0; i<n; i++) map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    for(int ele: map.keySet()) if(map.get(ele)==2) ans.add(ele);
    return ans;
    }
}
*/

}
