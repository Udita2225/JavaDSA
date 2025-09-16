package SlidingWindow;
//2799. Count Complete Subarrays in an Array
/*
You are given an array nums consisting of positive integers.
We call a subarray of an array complete if the following condition is satisfied:
The number of distinct elements in the subarray is equal to the number of distinct elements in the whole array.
Return the number of complete subarrays.
A subarray is a contiguous non-empty part of an array.
Example 1.
Input: nums = [1,3,1,2,2]
Output: 4
Explanation: The complete subarrays are the following: [1,3,1,2], [1,3,1,2,2], [3,1,2] and [3,1,2,2].
Example 2:
Input: nums = [5,5,5,5]
Output: 10
Explanation: The array consists only of the integer 5, so any subarray is complete. The number of subarrays that we can choose is 10.
Constraints:
1 <= nums.length <= 1000
1 <= nums[i] <= 2000
*/
public class LeetCode2799CountCompleteSubarraysInAnArraySW {
/*
Sliding Window
class Solution {
    public int atMost(int[] nums, int k){
    int n = nums.length;
    int i=0;
    int count=0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int j=0; j<n; j++){
        map.put(nums[j], map.getOrDefault(nums[j],0)+1);
        while(map.size()>k){
            int freq = map.get(nums[i]);
            freq--;
            if(freq==0) map.remove(nums[i]);
            else map.put(nums[i],freq);
            i++;
        }
        count += j-i+1;
    }
    return count;
    }
    public int countCompleteSubarrays(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for(int x=0; x<nums.length; x++){
        set.add(nums[x]);
    }
    int k = set.size();
    return atMost(nums,k) - atMost(nums, k-1);
    }
}
*/

}
