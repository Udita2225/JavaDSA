package PrefixSum;
//238. Product of Array Except Self
/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of
nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
Constraints:
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
Follow up: Can you solve the problem in O(1) extra space complexity?
(The output array does not count as extra space for space complexity analysis.)
*/
public class LeetCode238ProductOfArrayExceptSelf {
/*
// Best Code TC=O(n) SC=O(1)
// Saving Space Complexity
class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] preProd = new int[n];
    preProd[0] = 1;
    int suf = 1;
    for(int i=1; i<n; i++){
        preProd[i] = preProd[i-1] * nums[i-1];
    }
    for(int i=n-2; i>=0; i--){
        suf *= nums[i+1];
        preProd[i] *= suf;
        // preProd[i] *= (suf*nums[i+1]);
        // suf *= nums[i+1];
    }
    return preProd;
    }
}

// More optimal and interview Ready Solution
// More Intutive then the previous one!
class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] preProd = new int[n];
    int[] sufProd = new int[n];
    preProd[0] = 1;
    sufProd[n-1] = 1;
    for(int i=1; i<n; i++){
        preProd[i] = preProd[i-1] * nums[i-1];
    }
    for(int i=n-2; i>=0; i--){
        sufProd[i] = sufProd[i+1] * nums[i+1];
    }
    int[] ans = new int[n];
    for(int i=0; i<n; i++){
        ans[i] = preProd[i]*sufProd[i];
    }
    return ans;
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
    // '/' division Operation is not allowed
    int n = nums.length;
    int[] pre = new int[n];
    int[] suf = new int[n];
    pre[0] = nums[0];
    suf[n-1] = nums[n-1];
    for(int i=1; i<n; i++){
        pre[i] = nums[i] *  pre[i-1];
    }
    for(int i=n-2; i>=0; i--){
        suf[i] = nums[i] * suf[i+1];
    }
    int[] ans = new int[n];
    for(int i=0; i<n; i++){
        int LeftProd = 1;
        if(i>0) LeftProd = pre[i-1];
        int RightProd =1;
        if(i<n-1) RightProd = suf[i+1];
        ans[i] = LeftProd * RightProd;
    }
    return ans;
    }
}


//This is just for practice .. It is better than previous one but in this question
//constraint is given that we cannot use division operation
class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int product =1;
    for(int i=0; i<n; i++){
        product *= nums[i];
    }
    int[] ans = new int[n];
    for(int i=0; i<n; i++){
        if(nums[i]==0){
            int x =1;
            for(int j=0; j<n; j++){
                if(i==j) continue;
                x *= nums[j];
            }
            ans[i] = x;
        }
        else ans[i] = product/nums[i];
    }
    return ans;
    }
}
// Time Limit Exceeded TC =O(n^2)
// Not a Good Code ~ Not Accepted For Big Test Cases
class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] ans  = new int[n];
    for(int i=0; i<n; i++){
        int x = 1;
        for(int j=0; j<n; j++){
            if(i==j) continue;
            x *= nums[j];
        }
        ans[i] = x;
    }
    return ans;
    }
}
*/
}
