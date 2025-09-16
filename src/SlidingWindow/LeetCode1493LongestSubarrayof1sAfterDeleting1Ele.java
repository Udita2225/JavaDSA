package SlidingWindow;
//1493. Longest Subarray of 1's After Deleting One Element
public class LeetCode1493LongestSubarrayof1sAfterDeleting1Ele {
/*
Given a binary array nums, you should delete one element from it.
Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no
such subarray.
Example 1:
Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
Example 2:
Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
Example 3:
Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.
Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/
/*
//Clean Code
class Solution {
    public int longestSubarray(int[] nums) {
    int n = nums.length;
    int zeroCount = 0;
    int i =0;
    int maxLen = Integer.MIN_VALUE;
    for(int j=0; j<n; j++){
        if(nums[j]==0) zeroCount++;
        while(zeroCount>1){
            if(nums[i]==0) zeroCount--;
            i++;
        }
        maxLen =  Math.max(maxLen,j-i);
    }
    return maxLen;
    }
}
//Very Complicated Code By Sir
class Solution {
    public int longestSubarray(int[] nums) {
    int n = nums.length;
    int i,j;
    i=0; j=0;
    int z=0;
    //Checking if all elements are 1
    for(int ele:nums){
        if(ele==0) z++;
    }
    if(z==0) return n-1; //Removing a '1'

    int zeros =0, maxLen =0;
    // Move 'i' to 1st 1
    while(i<n && nums[i]!=1) i++;
    //Checking if all elements are 0
    if(i==n) return 0;

    //For Zeros in Between
    j=i;
    while(j<n){
        if(nums[j]==1) j++;
        else{//nums[j]==0
            if(zeros==0){
                j++;
                zeros++;
            }
            else{// zeros==1
                int len = j-i-1;
                maxLen= Math.max(maxLen,len);
                j++;
                while(i<n && nums[i]!=0) i++;
                i++;
            }
        }
    }
    // 0011 is different from 11
    if(zeros==0) return j-i;
    int len = j-i-1;
    maxLen = Math.max(maxLen,len);
    return maxLen;
    }
}
//Over-complicated Code written by Udita :-}
class Solution {
    public int longestSubarray(int[] nums) {
    int n = nums.length;
    int max = Integer.MIN_VALUE;
    int len =0;
    int i=0;
    //Sabse pehle i ko uski correct jagah par rakh do yaani 1st 1 par
    boolean flag = false;
    while(i<n){
        if(nums[i]==0) flag=true;
        i++;
    }
    if(flag==false) return n-1;
    i=0;
    while(i<n && nums[i]!=1){
        i++;
    }
    if(i==n) return 0;
    int j = i;
    int zero =0;
    while(j<n){
        if(nums[j]==0) zero++;
        if(zero>1){
            zero--;
            len = j-i-zero;
            max = Math.max(max,len);
            while(nums[i]!=0) i++;
            i++;
        }
        j++;
    }
    if(zero == 0) len = j-i;
    else len = j-i-zero;
    max = Math.max(max,len);
    return max;
    }
}

//567ms Very Bad Time Complexity
class Solution {
    public int longestSubarray(int[] nums) {
    int n= nums.length;
    int max = Integer.MIN_VALUE;
    boolean flag = false;
    for(int i=0; i<n; i++){
        if(nums[i]==0) flag=true;
    }
    if(flag==false) return nums.length - 1;
    for(int i=0; i<n; i++){
        int count = 0;
        int time = 0;
        int j=i;
        while(j<n && time <= 1){
            if(nums[j]==0){
                time++;
                j++;
                continue;
            }
            else count++;
            max = Math.max(max,count);
            j++;
        }
    }
    return max==Integer.MIN_VALUE?0:max;
    }
}
This code will not be accepted and will give Time Limit Exceeded Error
public int longestSubarray(int[] nums) {
    int max = 0;
    int n = nums.length;
    for (int i = 0; i < n; i++) {
        int count = 0, currMax = 0;
        for (int j = 0; j < n; j++) {
            if (j == i) continue; // skip the i-th element
            if (nums[j] == 1) {
                count++;
                currMax = Math.max(currMax, count);
            } else {
                count = 0;
            }
        }
        max = Math.max(max, currMax);
    }
    return max;
}

*/
}
