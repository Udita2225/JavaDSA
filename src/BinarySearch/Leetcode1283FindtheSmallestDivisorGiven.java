package BinarySearch;
import java.util.*;
public class Leetcode1283FindtheSmallestDivisorGiven {
    public static void main(String[] args) {
        //Find the Smallest Divisor Given a Threshold
        //Binary Search On Answer
/*
Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).
The test cases are generated so that there will be an answer.
Example 1:
Input: nums = [1,2,5,9], threshold = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1.
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2).
Example 2:
Input: nums = [44,22,33,11,1], threshold = 5
Output: 44
Constraints:
1 <= nums.length <= 5 * 104
1 <= nums[i] <= 106
nums.length <= threshold <= 106
*/
/*
This code will give error of Time Limit Exceeded
class Solution {
    public int smallestDivisor(int[] arr, int threshold) {
        int n= arr.length;
        int d;
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            mx = Math.max(mx, arr[i]);
            }
        for(d=1; d<=mx ; d++){
           int sum =0;
            for(int i =0; i<n; i++){
                if(arr[i]%d==0){ sum += arr[i]/d;
                }
                else { sum+= arr[i]/d + 1;}
            }
            if(sum<= threshold) return d;
        }
        return -1;
    }
}
//Here Time Complexity is O(n*mx) mx is the largest element of Array
Here time complexity is very large and it will give error
This code is not suitable for arrays with large elements.
*/
/*
Better Code
class Solution {
    public int smallestDivisor(int[] arr, int threshold) {
        int  n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            mx = Math.max(mx, arr[i]);
        }
        int lo =1;
        int hi =mx;
        int d = 1;
        while(lo<=hi){
            int mid = lo+ (hi-lo)/2;
            int sum =0;
            for(int i=0; i<n; i++){
                if(arr[i]%mid ==0){
                    sum += arr[i]/mid;
                }
                else{
                    sum += arr[i]/mid + 1;
                }
            }
            if(sum<=threshold){
                d =mid;
                hi = mid -1;
            }
            else{
                lo =mid+1;
            }
        }
        return d;
    }
}
*/
/*


//Best CODE
//By Using Boolean Function
It is much better than the previous one
class Solution {
    public boolean isLess(int[] arr , int mid, int threshold){
        int sum =0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]%mid == 0){
                sum += arr[i]/mid;
            }
            else sum+= arr[i]/mid +1;
        }
        if(sum<=threshold) return true;
        return false;
    }
    public int smallestDivisor(int[] arr, int threshold) {
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i =0; i<n ; i++){
            mx = Math.max(mx, arr[i]);
        }
        int lo =1;
        int hi =mx;
        int d =1;
        while(lo<=hi){
            int mid =lo + (hi-lo)/2;
            if(isLess(arr, mid, threshold)){
                d =mid;
                hi = mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return d;
    }
}
 */
    }
}
