package PrefixSum;
//560. Subarray Sum Equals K
public class LeetCode560SubarraySumEqualsK {
/*
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.
Example 1:
Input: nums = [1,1,1], k = 2
Output: 2
Example 2:
Input: nums = [1,2,3], k = 3
Output: 2
Constraints:
1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
*/
/*
//Using Prefix Sum And HashMap
//TC:- O(n)
//SC:- O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {
    int n= nums.length;
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=1; i<n; i++){
        nums[i] += nums[i-1];
    }
    for(int i=0; i<n; i++){
    int ele = nums[i];
    if(ele==k) count++;
    int rem = ele - k;
    if(map.containsKey(rem)){
        int freq = map.get(rem);
        count += freq;
    }
    if(map.containsKey(ele)){
        int freq = map.get(ele);
        map.put(ele,freq+1);
    }
    else map.put(ele,1);
    }
    return count;
    }
}


//Brute Force
//Time Complexity :- O(n^2) Space Complexity:- O(1)
//It takes 1093ms which is very bad
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n;i++){
            int sum =0;
            for(int j=i; j<n; j++){
                sum += nums[j];
                if(sum==k) count++;
            }
        }
        return count;//1093 ms
    }
}
*/
}
