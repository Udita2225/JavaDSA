package CyclicSort;
//LeetCode 287 Find the Duplicate Number
/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and using only constant extra space.
Example 1:
Input: nums = [1,3,4,2,2]
Output: 2
Example 2:
Input: nums = [3,1,3,4,2]
Output: 3
Example 3:
Input: nums = [3,3,3,3,3]
Output: 3
Constraints:
1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
Follow up:
How can we prove that at least one duplicate number must exist in nums?
Can you solve the problem in linear runtime complexity?
*/
public class LeetCode287FindTheDuplicateNumber {
    /* Using Frequency array
class Solution {
    public int findDuplicate(int[] nums) {
    int n= nums.length;
    int[] freq =  new int[n];
    for(int i=0; i<n; i++){
        if(freq[nums[i] - 1] == 1) return nums[i];
        freq[nums[i] - 1] = 1;
    }
    return -1;
    }
}
/* By Using Zeroth Index
class Solution {
    public void swap(int i, int j, int[] nums){
        // int temp =  nums[i];
        // nums[i] =  nums[j];
        // nums[j] = temp;
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
    public int findDuplicate(int[] nums) {
    while(true){
        if(nums[0] ==  nums[nums[0]]) return nums[0];
        swap(0,nums[0],nums);
      }
    }
}
// Using HashMaps
class Solution {
    public int findDuplicate(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int n =  nums.length;
    for(int i=0; i<n; i++){
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    }
    for(int ele: map.keySet()) if(map.get(ele) >= 2) return ele;
    return -1;
    }
}

/*
class Solution {
    public void swap(int i, int j, int[] nums){
        int temp =  nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int findDuplicate(int[] nums) {
    int n =  nums.length;
    int i=0;
    while(i<n){
        if(nums[i] == i+1) i++;
        else if(nums[i]==nums[nums[i]-1]) return nums[i];
        else swap(i,nums[i]-1,nums);
    }
    return nums[n-1];
    }
}
/* This is a right code But Uses Extra Space with space complexity O(n) which is strictly restricted
class Solution {
    public int findDuplicate(int[] nums) {
    int n =  nums.length;
    HashSet<Integer> set = new HashSet<>();
    for(int i=0; i<n; i++){
        if(set.contains(nums[i])) return nums[i];
        set.add(nums[i]);
    }
    return -1;
    }
}
*/
}
