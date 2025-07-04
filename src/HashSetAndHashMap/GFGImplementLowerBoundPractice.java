package HashSetAndHashMap;

public class GFGImplementLowerBoundPractice {
//Implement Lower Bound
/*
Given a sorted array arr[] and a number target, the task is to find the lower bound of the target in this given array. The lower bound of a number is defined as the smallest index in the sorted array where the element is greater than or equal to the given number.

Note: If all the elements in the given array are smaller than the target, the lower bound will be the length of the array.

Examples :

Input:  arr[] = [2, 3, 7, 10, 11, 11, 25], target = 9
Output: 3
Explanation: 3 is the smallest index in arr[] where element (arr[3] = 10) is greater than or equal to 9.
Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 11
Output: 4
Explanation: 4 is the smallest index in arr[] where element (arr[4] = 11) is greater than or equal to 11.
Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 100
Output: 7
Explanation: As no element in arr[] is greater than 100, return the length of array.
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 106
1 ≤ target ≤ 106
Time Complexity: O(log n)
Auxiliary Space: O(1)
*/
/*
class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int lowerBound = arr.length;
        int lo = 0, hi=arr.length-1;
        while(lo<=hi){
            int mid = (hi-lo)/2 +lo;
            if(arr[mid]>=target){
                lowerBound = Math.min(lowerBound,mid);
                hi =mid-1;
            }
            else lo =mid+1;
        }
        return lowerBound;
    }
}

*/
}
