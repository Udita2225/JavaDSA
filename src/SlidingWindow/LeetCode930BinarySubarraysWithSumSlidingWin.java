package SlidingWindow;
//Leetcode 930. Binary Subarrays With Sum
/*
Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
A subarray is a contiguous part of the array.
Example 1:
Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
Example 2:
Input: nums = [0,0,0,0,0], goal = 0
Output: 15
Constraints:
1 <= nums.length <= 3 * 104
nums[i] is either 0 or 1.
0 <= goal <= nums.length
*/
public class LeetCode930BinarySubarraysWithSumSlidingWin {
/*
//Using HashMap & Prefix Sum
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
    int n =  nums.length;
    int count =0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=1; i<n; i++){
        nums[i] += nums[i-1];
    }
    for(int i=0; i<n; i++){
        int ele = nums[i];
        if(ele==goal) count++;
        int rem = ele - goal;
        if(map.containsKey(rem)){
            int freq = map.get(rem);
            count += freq;
        }
        map.put(ele, map.getOrDefault(ele,0)+1);
    }
    return count;
    }
}
*/

/*class Solution {
    public int atMost(int[] nums, int goal){
        int n = nums.length;
        int i=0, count=0;
        int sum = 0;
        for(int j=0; j<n; j++){
            sum += nums[j];
            while(i<n && sum>goal){
                sum -= nums[i];
                i++;
            }
            count += j-i+1;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        //Using Sliding Window
        if(goal==0) return atMost(nums,0);
        return atMost(nums, goal) - atMost(nums,goal-1);
    }
}
*/

}
