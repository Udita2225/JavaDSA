package BinarySearch;

public class LeetCode34Solution2 {
    /*
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
    //SOLUTION 2
    /*
    class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];
        //FIRST POINT
        int  fp =-1;
        int low =0; int high =n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                if(mid>0 && arr[mid]==arr[mid-1]) high = mid-1;
                else{
                    fp =mid;
                    break;
                }
            }
            else if(arr[mid]>target) high = mid-1;
            else if(arr[mid]<target) low = mid+1;
        }
        //LAST POINT
        int lp =-1;
        low =0;
        high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                if(mid+1<n && arr[mid]==arr[mid+1]){
                    low = mid+1;
                }
                else{
                    lp =mid;
                    break;
                }
            }
            else if(arr[mid]>target) high =mid-1;
            else if(arr[mid]<target) low = mid+1;
        }
        ans[0] =fp;
        ans[1] = lp;
        return ans;
    }
}
     */
}
