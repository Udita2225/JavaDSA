package BinarySearch.BinarySearchOnAnswer;

public class GFGAggressiveCows {
/*
Aggressive Cows

You are given an array with unique elements of stalls[], which denote the positions of stalls. You are also given an
integer k which denotes the number of aggressive cows. The task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.
Examples:
Input: stalls[] = [1, 2, 4, 8, 9], k = 3
Output: 3
Explanation: The first cow can be placed at stalls[0],
the second cow can be placed at stalls[2] and
the third cow can be placed at stalls[3].
The minimum distance between cows in this case is 3, which is the largest among all possible ways.
Input: stalls[] = [10, 1, 2, 7, 5], k = 3
Output: 4
Explanation: The first cow can be placed at stalls[0],
the second cow can be placed at stalls[1] and
the third cow can be placed at stalls[4].
The minimum distance between cows in this case is 4, which is the largest among all possible ways.
Input: stalls[] = [2, 12, 11, 3, 26, 7], k = 5
Output: 1
Explanation: There are 6 stalls and only 5 cows, we try to place the cows such that the minimum distance between any two cows is as large as possible.
The minimum distance between cows in this case is 1, which is the largest among all possible ways.
Constraints:
2 ≤ stalls.size() ≤ 106
0 ≤ stalls[i] ≤ 108
2 ≤ k ≤ stalls.size()
Expected Complexities
Time Complexity: O(n log m)
Auxiliary Space: O(1)
Topic Tags
Binary Search Algorithms

*/
    /*
    class Solution {
    public boolean isPossible(int dist, int[] stalls, int k){
    int count = 1;
    int lastPos = stalls[0];
    for(int i=1; i<stalls.length; i++){
        if(stalls[i]-lastPos >= dist){
            count++;
            lastPos = stalls[i];
        }
        if(count==k) return true;
    }
    return false;
    }
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        int minDist = stalls[0];
        int maxDist = stalls[n-1];
        int low = 1;
        int ans = 1;
        int high = maxDist-minDist;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(mid,stalls,k)){
              ans = mid;
              low = mid+1;
            }
            else high = mid-1;
        }
        return ans;
    }
}
     */
}
