package CyclicSort;
//448. Find All Numbers Disappeared in an Array
/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range
[1, n] that do not appear in nums.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:
Input: nums = [1,1]
Output: [2]
Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as
extra space.
*/
public class LeetCode448FindAllNumbersDisappearedInArray {
/*
class Solution {
    public void swap(int i, int j, int[] nums){
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> ans =  new ArrayList<>();
    int n =  nums.length;
    int i=0;
    while(i<n){
        if((nums[i] == i + 1) || (nums[i]==nums[nums[i]-1])) i++;
        else swap(i,nums[i]-1, nums);
    }
    for(int k=0; k<n; k++) if(nums[k]-1 != k) ans.add(k+1);
    return ans;
    }
}
/*
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    int n = nums.length;
    HashSet<Integer> set = new HashSet<>();
    List<Integer> ans = new ArrayList<>();
    for(int i=0; i<n; i++){
        set.add(nums[i]);
    }
    for(int i=1; i<=n; i++){
        if(!set.contains(i)) ans.add(i);
    }
    return ans;
    }
}
*/
}
