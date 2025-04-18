package Sorting;
import java.util.*;
public class LeetCode169MajorityElement {
    public static void main(String[] args){
/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
Follow-up: Could you solve the problem in linear time and in O(1) space?
*/
//SOLUTION 1
/*
class Solution {
    public int majorityElement(int[] arr) {
        //Since it is given that Majority element is more than n/2 times...This question is like the
        // mode question that we did in 10th class. It means we just
        //need to sort the array and the element which is present at the middle is our majority element
        //2 2 1 1 1 2 2
        //sort -> 1 1 1 2 2 2 2  //Middle element is 100% the majority element

        int n = arr.length;
        for(int i =1; i<n; i++){
            for(int j=i; j>=1 && arr[j]<arr[j-1]; j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] =temp;
            }
        }
        return arr[n/2];

    }
}
 */
//SOLUTION 2 EASY AND SHORT USING BUILT-IN FUNCTION
/*
 class Solution {
    public int majorityElement(int[] nums) {
       //2 2 1 1 1 2 2
       // SORT---> 1 1 1 2 2 2 2
       Arrays.sort(nums);
       return nums[nums.length/2];
    }
}
Built-in Sort is better than all the sorts that we have learnt so far.
  /*  Time Complexity of Built-In Sort/Merge Sort is O(n*logn) Which is better than O(n*n)
 */








    }
}
