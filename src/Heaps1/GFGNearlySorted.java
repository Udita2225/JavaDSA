package Heaps1;
//Nearly sorted
/*
Given an array arr[], where each element is at most k away from its target position, you need to sort the array optimally.
Note: You need to change the given array arr[] in place.
Examples:
Input: arr[] = [6, 5, 3, 2, 8, 10, 9], k = 3
Output: [2, 3, 5, 6, 8, 9, 10]
Explanation: The sorted array will be 2 3 5 6 8 9 10
Input: arr[]= [1, 4, 5, 2, 3, 6, 7, 8, 9, 10], k = 2
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Explanation: The sorted array will be 1 2 3 4 5 6 7 8 9 10
Don't use the inbuilt sort() function for this question.
Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ k < arr.size()
1 ≤ arri ≤ 106
Expected Complexities
Time Complexity: O(n log k)
Auxiliary Space: O(k)
Company Tags
Google
*/
public class GFGNearlySorted {
/*
class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int j=0;
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
            if(pq.size()>k){
               arr[j] = pq.remove();
               j++;
            }
        }
        while(pq.size()>0){
            arr[j] = pq.remove();
            j++;
        }
    }
}

*/
}
