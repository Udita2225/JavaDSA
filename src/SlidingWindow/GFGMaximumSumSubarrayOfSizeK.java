package SlidingWindow;
//Max Sum Subarray of size K
/*
Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.
Note: A subarray is a contiguous part of any given array.
Examples:
Input: arr[] = [100, 200, 300, 400] , k = 2
Output: 700
Explanation: arr3  + arr4 = 700, which is maximum.
Input: arr[] = [100, 200, 300, 400] , k = 4
Output: 1000
Explanation: arr1 + arr2 + arr3 + arr4 = 1000, which is maximum.
Input: arr[] = [100, 200, 300, 400] , k = 1
Output: 400
Explanation: arr4 = 400, which is maximum.
Constraints:
1 <= arr.size() <= 106
1 <= arr[i]<= 106
1 <= k<= arr.size()
Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)
Company Tags
OYO Rooms
*/
public class GFGMaximumSumSubarrayOfSizeK {
/*
// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        // Brute Force - Time Limit Exceeded
        // int n = arr.length;
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<=n-k; i++){
        //     int sum =0;
        //     for(int j=i; j<i+k; j++){
        //         sum += arr[j];
        //     }
        //     max =  Math.max(sum,max);
        // }

        // Using Sliding WINDOW
        int n = arr.length;
        int i=0;
        int j=k-1;
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int a=0; a<=k-1;a++){
            sum += arr[a];
        }
        max = Math.max(sum,max);
        i++;
        j++;
        while(j<n){
            sum = sum - arr[i-1] + arr[j];
            max = Math.max(sum,max);
            i++;
            j++;
        }
        return max;
    }
}
*/
}
