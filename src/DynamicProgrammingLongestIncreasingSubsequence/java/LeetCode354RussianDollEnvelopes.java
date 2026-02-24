package DynamicProgrammingLongestIncreasingSubsequence.java;
/*
354. Russian Doll Envelopes
You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi] represents the width and the height of an envelope.
One envelope can fit into another if and only if both the width and height of one envelope are greater than the other
envelope's width and height.

Return the maximum number of envelopes you can Russian doll (i.e., put one inside the other).

Note: You cannot rotate an envelope.

Example 1:

Input: envelopes = [[5,4],[6,4],[6,7],[2,3]]
Output: 3
Explanation: The maximum number of envelopes you can Russian doll is 3 ([2,3] => [5,4] => [6,7]).
Example 2:

Input: envelopes = [[1,1],[1,1],[1,1]]
Output: 1

Constraints:

1 <= envelopes.length <= 105
envelopes[i].length == 2
1 <= wi, hi <= 105

*/
public class LeetCode354RussianDollEnvelopes {
    /* We will do it using Greedy + Binary Search as well
       DP solution for this question will give Time Limit Exceeded Error

       class Solution {
    public class Envelop implements Comparable<Envelop>{
        int w;
        int h;
        public Envelop(int w, int h){
            this.w = w;
            this.h = h;
        }
        public int compareTo(Envelop e){
            if(this.w == e.w){
                return e.h - this.h;
            }
            return this.w-e.w;
        }
    }
    public int maxEnvelopes(int[][] envelopes) {
    int n = envelopes.length;
    Envelop[] arr =  new Envelop[n];
    for(int i=0; i<n; i++){
        int w = envelopes[i][0];
        int h = envelopes[i][1];
        arr[i] =  new Envelop(w,h);
    }
    Arrays.sort(arr); // nlogn
    // LIS on this Array -> arr[i].h
    // O(n^2)
    int[] dp = new int[n];
    int max = 0;
    for(int i=0; i<n; i++){
        for(int j=0; j<i; j++){
            if(arr[j].h<arr[i].h){
            dp[i] =  Math.max(dp[i],dp[j]);
            }
        }
        dp[i] += 1;
        max =  Math.max(max, dp[i]);
    }
    return max;
    }
}
     */
}
