package BinarySearch;
import java.util.*;
public class Leetcode852PeakIndexInMountainArray {
    public static void main(String[] args) {
/*
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.
Example 1:
Input: arr = [0,1,0]
Output: 1
Example 2:
Input: arr = [0,2,1,0]
Output: 1
Example 3:
Input: arr = [0,10,5,2]
Output: 1
Constraints:
3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.
*/
/*
Very Bad Solution by Linear Search .. We cannot give this answer in interview
By Linear Search
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //By Using Linear Search
        int n = arr.length;
        for(int i =1; i<n-1; i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]) return i;
        }
      return -1;
    }
}
*/
/*
SOLUTION 2
BY BINARY SEARCH
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 1;
        int high = n-2;
        while(low<=high){
            int mid  = low + (high-low)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1]) low = mid+1;
            else if(arr[mid]<arr[mid-1]&&arr[mid]>arr[mid+1]) high = mid-1;
        }
      return -1;
    }
}
Start low at index 1 and high at index n-2 because peak element can never be present at extreme indices.

 */
    }

}
