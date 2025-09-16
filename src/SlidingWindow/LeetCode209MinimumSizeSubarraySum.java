package SlidingWindow;
//209. Minimum Size Subarray Sum
/*
Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose
sum is greater than or equal to target. If there is no such subarray, return 0 instead.
Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:
Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
Constraints:
1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104
Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).
*/
public class LeetCode209MinimumSizeSubarraySum {
/*
/*
j runs from 0 to n-1 → n steps
i also runs from 0 to n-1 → at most n steps total across all iterations
✅ Correct Time Complexity: O(n)
✅ Space Complexity: O(1)

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i=0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        for(int j=0; j<n; j++){
            sum += nums[j];
            while(sum>=target){
                int len = j-i+1;
                minLen = Math.min(minLen,len);
                sum -= nums[i];
                i++;
            }
        }
        return minLen==Integer.MAX_VALUE? 0 : minLen;
    }
}

*//*
//Sir's Code A bit Complicated
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int n = nums.length;
    int i=0; int j=0; int sum=0;
    int minLen = Integer.MAX_VALUE;
    while(j<n && sum<target){//First Window
        sum += nums[j];
        j++;
    }
    j--;
    // Sliding Window
    while(i<n && j<n){
    if(sum>=target){
     int len = j-i+1;
     minLen = Math.min(len,minLen);
    }
    sum -= nums[i];
    i++; j++;
    while(j<n && sum<target){
        sum += nums[j];
        j++;
    }
    j--;
    }
    return minLen==Integer.MAX_VALUE?0:minLen;
    }
}
*/
    /*
// TC:- O(n^2) Very Bad Time Complexity
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int n = nums.length;
    int minLen = Integer.MAX_VALUE;
    boolean flag = false;
    for(int i=0; i<n; i++){
        int sum =0;
        for(int j=i; j<n; j++){
            sum += nums[j];
            if(sum>=target){
                int len = j-i+1;
                minLen =  Math.min(minLen,len);
                flag= true;
                break;
            }
        }
    }
    return flag==false?0:minLen;
    }
}
*/
}
