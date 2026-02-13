package CyclicSort;
//645. Set Mismatch
/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error,
one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss
of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.
Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:
Input: nums = [1,1]
Output: [1,2]
Constraints:
2 <= nums.length <= 104
1 <= nums[i] <= 104
*/
public class LeetCode645SetMismatch {
/*
class Solution {
    public void swap(int i, int j, int[] nums){
        nums[i] =  nums[i] + nums[j];
        nums[j] =  nums[i] - nums[j];
        nums[i] =  nums[i] - nums[j];
    }
    public int[] findErrorNums(int[] nums) {
    int[] ans =  new int[2];
    int n = nums.length;
    int i = 0;
    while(i<n){
        if(nums[i]==i+1) i++;
        else if(nums[i] == nums[nums[i]-1]){
            ans[0] = nums[i];
            i++;
        }
        else swap(i, nums[i]-1,nums);
    }
    for(i=0; i<n; i++)
    if(nums[i]!= i+1) ans[1] = i+1;
    return ans;
    }
}
*/
}
