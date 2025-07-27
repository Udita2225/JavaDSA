package Heaps2;
//632. Smallest Range Covering Elements from K Lists
public class LeetCode632SmallestRangeCoveringElementsFromKLists {
/*
You have k lists of sorted integers in non-decreasing order. Find the smallest range that includes at least one number
from each of the k lists.
We define the range [a, b] is smaller than range [c, d] if b - a < d - c or a < c if b - a == d - c.
Example 1:
Input: nums = [[4,10,15,24,26],[0,9,12,20],[5,18,22,30]]
Output: [20,24]
Explanation:
List 1: [4, 10, 15, 24,26], 24 is in range [20,24].
List 2: [0, 9, 12, 20], 20 is in range [20,24].
List 3: [5, 18, 22, 30], 22 is in range [20,24].
Example 2:
Input: nums = [[1,2,3],[1,2,3],[1,2,3]]
Output: [1,1]
Constraints:
nums.length == k
1 <= k <= 3500
1 <= nums[i].length <= 50
-105 <= nums[i][j] <= 105
nums[i] is sorted in non-decreasing order.
*/
/*
class Solution {
    public class Triplet implements Comparable<Triplet>{
        int ele;
        int row;
        int col;
        Triplet(int ele, int row, int col){
            this.ele = ele;
            this.row = row;
            this.col = col;
        }
        public int compareTo(Triplet t){
            return this.ele-t.ele;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        //MinHeap
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int k = nums.size();
        int[] minRange = {0, Integer.MAX_VALUE};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
           int ele = nums.get(i).get(0);
           max = Math.max(ele,max);
           pq.add(new Triplet(ele,i,0));
        }
        // while(pq.size()>=k){
        while(true){
        Triplet top = pq.remove();
        int ele = top.ele;
        int row = top.row;
        int col = top.col;
        //Update the minimum Range
        if(max-ele < minRange[1]-minRange[0]){
            minRange[0] = ele;
            minRange[1] = max;
        }
        if(col == nums.get(row).size()-1) break;
        int next = nums.get(row).get(col+1);
        max = Math.max(max,next);
        pq.add(new Triplet(next,row,col+1));
        }
        return minRange;
    }
}
*/
}
