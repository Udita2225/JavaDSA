package BinarySearch;

public class LeetCode658FindKClosestElements {
/*
Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.
An integer a is closer to x than an integer b if:
|a - x| < |b - x|, or
|a - x| == |b - x| and a < b
Example 1:
Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]
Example 2:
Input: arr = [1,2,3,4,5], k = 4, x = -1
Output: [1,2,3,4]
Constraints:
1 <= k <= arr.length
1 <= arr.length <= 104
arr is sorted in ascending order.
-104 <= arr[i], x <= 104
*/
/*
Solution
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int n =arr.length;
        //Base Cases
        if(x < arr[0]){
            for(int i =0; i<k; i++){
                ans.add(arr[i]);
            }
            return ans;
            }
        if(x > arr[n-1]){
            for(int i =n-1; i>=n-k; i--){
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }
        //Finding LowerBound
        int lb = n;
        int lo =0;
        int hi =n-1;
        while(lo<=hi){
         int mid = lo + (hi-lo)/2;
         if(arr[mid]>=x){
            lb =mid;
            hi =mid -1;
         }
         else lo =mid+1;
        }
        int j =lb;
        int i = lb-1;
        while(k>0 && i>=0 && j<n){
            int di =Math.abs(x-arr[i]);
            int dj =Math.abs(x-arr[j]);
            if(di<=dj){
                ans.add(arr[i]);
                i--;
            }
            else{ ans.add(arr[j]);
            j++;
            }
            k--;
        }
        while(i<0 && k>0){
           ans.add(arr[j]);
           j++;
           k--;
        }
        while(j==n && k>0){
            ans.add(arr[i]);
            i--;
            k--;
        }
       Collections.sort(ans);
       return ans;
    }
}
 */
}
