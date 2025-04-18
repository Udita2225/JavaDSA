package Advance_SortingMerge_Quick;

public class LeetCode493ReversePairs {
/*
Given an integer array nums, return the number of reverse pairs in the array.
A reverse pair is a pair (i, j) where:
0 <= i < j < nums.length and
nums[i] > 2 * nums[j].
Example 1:
Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
Example 2:
Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
Constraints:
1 <= nums.length <= 5 * 104
-231 <= nums[i] <= 231 - 1
*/
/*
class Solution {
    static int count; //Global variable
    public  void inversion(int[] a, int[] b){
        int i=0, j=0;
        while(i<a.length && j<b.length){
          if((long)a[i]>((long)2*(long)b[j])){
              count += (a.length-i);
              j++;
          }
          else i++;
        }
    }
    public  void merge(int[] a, int[] b, int[] merged) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])//  '=' is for maintaining stability.
                merged[k++] = a[i++];
             else
                merged[k++] = b[j++];
             }
        while(j<b.length) merged[k++] = b[j++];
        while(i<a.length) merged[k++] =a[i++];
    }
    public void mergesort(int[] arr){
        int n = arr.length;
        if(n==1) return; //base case
        //create two arrays of n/2 size each
        int[] a =new int[n/2];
        int[] b =new int[n-n/2];
        //copy pasting
        for(int i =0; i<n/2; i++){
            a[i]=arr[i];
        }
        for(int i = 0; i<n-n/2; i++){//This is the length of b[i]
               b[i] =arr[i+n/2];
        }
        //magic ->Recursion
        mergesort(a);
        mergesort(b);
        inversion(a,b);
        //merge these 'a' and 'b'
        merge(a,b,arr);
        //delete a and b to improve space complexity
        a= null;
        b= null;
    }
    public int reversePairs(int[] nums) {
            count =0;
            mergesort(nums);
            return count;
    }
}
 */
}
