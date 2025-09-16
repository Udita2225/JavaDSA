package SlidingWindow;
//560. Subarray Sum Equals K
/*Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
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
public class LeetCode560SubarraySumEqualsKPractice {
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
/*
This is a wrong Code. Sliding window will not work here because Negative integers are also there.
class Solution {
    public int atMost(int[] nums, int k){
        int n =  nums.length;
        int count = 0;
        int i = 0;
        int sum = 0;
        for(int j=0; j<n; j++){
            sum += nums[j];
            while(sum > k){
                if(i<n) sum -= nums[i];
                i++;
            }
            count += j-i+1;
        }
        return count;
    }
    public int subarraySum(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);
    }
}
Sliding window works when the condition for expanding/shrinking is monotonic — e.g., in positive-only arrays, adding more elements always increases the sum, so you can safely move i or j without missing cases.

With negatives, the sum can go up or down when you move j, so the classic “move left pointer until sum ≤ k” logic breaks. You might need to move left and right back and forth unpredictably, which sliding window isn’t designed for.

*/
}
