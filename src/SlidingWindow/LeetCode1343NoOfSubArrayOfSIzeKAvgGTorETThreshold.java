package SlidingWindow;
//1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
public class LeetCode1343NoOfSubArrayOfSIzeKAvgGTorETThreshold {
/*
Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.
Example 1:
Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size
3 have averages less than 4 (the threshold).
Example 2:
Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
Output: 6
Explanation: The first 6 sub-arrays of size 3 have averages greater than 5. Note that averages are not integers.
Constraints:
1 <= arr.length <= 105
1 <= arr[i] <= 104
1 <= k <= arr.length
0 <= threshold <= 104
*/
/*
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
    //Sliding Window  Concept T.C:- O(n)
    int n =  arr.length;
    int count=0;
    int i=0;
    int j=k-1;
    int sum=0;
    for(int a=0; a<=k-1; a++){//k times
        sum += arr[a];
    }
    int avg = sum/k;
    if(avg>=threshold) count++;
    i++;
    j++;
    while(j<n){//n-k times
        sum = sum - arr[i-1]+arr[j];
        avg = sum/k;
        if(avg>=threshold) count++;
        i++;
        j++;
    }
    return count;
    }
}
*/
}
