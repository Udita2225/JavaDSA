package BinarySearch;

public class LeetCode34Solution1 {
    /*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
    If target is not found in the array, return [-1, -1].
    You must write an algorithm with O(log n) runtime complexity.
    Example 1:
    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]
    Example 2:
    Input: nums = [5,7,7,8,8,10], target = 6
    Output: [-1,-1]
    Example 3:
    Input: nums = [], target = 0
    Output: [-1,-1]
    Constraints:0 <= nums.length <= 105
                -109 <= nums[i] <= 109
                 nums is a non-decreasing array.
                 -109 <= target <= 109
            */
    //By using three binary search
    /*
    class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans ={-1, -1};
        //First Of All checking that whether the target is found in the array or not.
        int n= arr.length;
        boolean flag = false; //Target not found
        int low =0;
        int high=n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
            flag = true;
            break;
            }
            else if(arr[mid]>target) high =mid-1;
            else if(arr[mid]<target) low =mid+1;
        }
        if(flag==false) return ans;
        //Now finding the lowerBound
        low =0;
        high =n-1;
        int lb=n;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=target){
                lb = Math.min(lb,mid);
                high = mid-1;
            }
            else{
                low =mid+1;
            }
            ans[0] = lb;
        }
        //Now finding the UpperBound
        int ub =n;
        low =0;
        high =n-1;
        while(low<=high){
            int mid =low + (high-low)/2;
            if(arr[mid]>target){
                ub = Math.min(ub, mid);
                high = mid-1;
            }
            else{
                low =mid+1;
            }
            ans[1] = ub-1;}
            return ans;
        }
}
     */
}
