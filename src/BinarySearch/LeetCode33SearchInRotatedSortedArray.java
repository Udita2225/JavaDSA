package BinarySearch;
import java.util.*;
public class LeetCode33SearchInRotatedSortedArray {
    public static void main(String[] args) {
//Search in Rotated Sorted Array
/*
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:
Input: nums = [1], target = 0
Output: -1
Constraints:
1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104
*/
/*
//Not a good Solution
class Solution {
    public int binarySearch(int[] arr, int lo, int hi, int target){
        while(lo<=hi){
            int mid =lo + (hi-lo)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) hi =mid-1;
            else lo =mid+1;
        }
        return -1;
        }
    public int search(int[] arr, int target) {
        //find pivot
        int n = arr.length;
        int lo =1;
        int hi =n-2;
        int p =-1;
        if(n<=2){
            for(int i =0; i<n; i++){
                if(arr[i]==target) return i;
            }
            return -1;
        }
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){ p =mid; break;}
            else if(arr[mid]<arr[mid-1]&&arr[mid]<arr[mid+1]){p =mid-1; break;}
            else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1]){
                if(arr[mid]>arr[n-1]) lo =mid+1;
                else hi =mid -1;
            }
        }
        if(p==-1){//array was never sorted
        return binarySearch(arr, 0, n-1, target);
        }
        int left =binarySearch(arr, 0 , p, target);
        if(left != -1) return left;
        int right = binarySearch(arr, p+1, n-1 , target);
        return right;
        }
}
*/
/*
Very Important Solution
Remember this
class Solution {
    public int search(int[] arr, int target) {
        //Without using pivot concept
        int n = arr.length;
        int lo =0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]< arr[hi]){//We are in the right sorted array
                //Target is found between mid to high sorted part
                if(arr[mid]<target && target<=arr[hi]){
                    lo = mid+1;
                }
                else hi =mid-1;
            }
            else{ //arr[mid]>arr[hi] We are in the left sorted part
                 //target is found between low to mid sorted part
                 if(target>=arr[lo] && target <arr[mid]) {
                    hi =mid -1;
                 }
                else lo =mid+1;
            }
        }
    return -1;

    }
}

*/


    }
}
