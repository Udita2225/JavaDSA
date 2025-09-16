package SlidingWindow;
//1004. Max Consecutive Ones III
/*
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip
at most k 0's.
Example 1:
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:
Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.
0 <= k <= nums.length
*/
public class LeetCode1004MaxConsecutiveOnes3 {
/*
class Solution {
    //By using Sir's and My Method
    public int longestOnes(int[] nums, int k) {
    int n =  nums.length;
    int Zeros = 0;
    int MaxLen = Integer.MIN_VALUE;
    int i=0, j=0;
    while(j<n){
        if(nums[j]==0) Zeros++;
        if(Zeros>k){
                int len = j-i;
                MaxLen = Math.max(MaxLen,len);
                while(Zeros>k){
                    if(nums[i]==0) Zeros--;
                    i++;
                }
            }
        j++;
    }
    int len = j-i;
    MaxLen = Math.max(MaxLen,len);
    return MaxLen;
    }
}
Best And Most Efficient Method
class Solution {
    public int longestOnes(int[] nums, int k) {
    int n = nums.length;
    int i=0;
    int maxLen = Integer.MIN_VALUE;
    int ZeroCount = 0;
    for(int j=0; j<n; j++){
        if(nums[j]==0) ZeroCount++;
        while(ZeroCount > k){
            if(nums[i]==0) ZeroCount--;
            i++;
        }
        int len = j-i+1;
        maxLen =  Math.max(maxLen,len);
    }
    return maxLen;
    }
}
*/
}
