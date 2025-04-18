package BinarySearch;
import java.util.*;
public class LeetCode1539KthMissingPositiveNumber {
    public static void main(String[] args) {
/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Return the kth positive integer that is missing from this array.
Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
Constraints:
1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length
*/
/*
//BINARY SEARCH + MATH
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int lo =0;
        int hi =n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int missed = arr[mid] -(mid +1);
            if(missed < k) lo =mid+1;
            else hi = mid-1;
        }
        return k + hi +1;
        //return k +lo;
        This condition will hit when loop will break and lo = hi +1 i.e, lo>hi
        kth missing element = arr[hi]+extra
        extra = k - (missed element till hi)
                k - (arr[hi] - (hi+1))
        kth missing element = arr[hi]+k -(arr[hi] - (hi+1));
                            = arr[hi] + k -arr[hi] + (hi+1);
                            = k +hi +1;
        When the loop breaks then lo =hi+1;
        Thus, kth missing element = k+lo;
    }
}

 */
  /*
        If we are thinking from lo element perspective
        Observation - kth missing no is between arr[hi]  and arr[lo]
        kth missing no =  arr[lo] - x
        x =Missed element uptill arr[lo] - k +1;
        x =arr[lo] -(lo+1) -k+1
        kth Missing element =  arr[lo] - arr[lo] +(lo+1) +k -1
                            = lo +k Same answer is coming as above
*/

    }
}
