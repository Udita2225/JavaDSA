package Sorting;
import java.util.*;
public class LeetCode283BubbleSort {
    public static void main(String[] args) {
        /***Push  zeros to end while maintaining the relative order of other elements
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
*/
        //CODE
  //By using extra ArrayList
        /*
        class Solution {
    public void moveZeroes(int[] nums) {
       ArrayList<Integer> arr = new ArrayList<>();
       int noz =0;
       for(int ele: nums){
         if(ele!=0) arr.add(ele);
         else noz++;
       }
       for(int i=1; i<=noz; i++){
        arr.add(0);
       }
       for(int i =0; i<nums.length; i++){
          nums[i] = arr.get(i);
       }
    }
}
   //BY USING BUBBLE SORTING
     class Solution {
    public void moveZeroes(int[] arr) {
        int noz=0;
        int n=arr.length;
        for(int ele: arr){
            if(ele == 0) noz++;
        }
        for(int x =0; x<noz; x++){//n-1 passes

          for(int i=0; i<n-1-x; i++){
           if(arr[i]==0){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

            }
          }
      }
   }
}

         */

    }
}
