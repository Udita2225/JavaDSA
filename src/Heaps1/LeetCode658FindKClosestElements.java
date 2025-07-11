package Heaps1;
//658. Find K Closest Elements
/*
Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array.
The result should also be sorted in ascending order.
An integer a is closer to x than an integer b if:
|a - x| < |b - x|, or
|a - x| == |b - x| and a < b
Example 1:
Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]
Example 2:
Input: arr = [1,1,2,3,4,5], k = 4, x = -1
Output: [1,1,2,3]
Constraints:
1 <= k <= arr.length
1 <= arr.length <= 104
arr is sorted in ascending order.
-104 <= arr[i], x <= 104
*/
public class LeetCode658FindKClosestElements {
    /*class Solution {
        public class Pair implements Comparable<Pair>{
            int ele;
            int diff;
            Pair(int ele, int diff){
                this.ele = ele;
                this.diff = diff;
            }
            public int compareTo(Pair p){
                //Agar Difference same aa raha hai to element ke basis par sort karenge
                if(this.diff == p.diff) return this.ele - p.ele;
                return this.diff - p.diff;
            }
        }
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            int n = arr.length;
            List<Integer> ans = new ArrayList<>();
            PriorityQueue<Pair> PQ =  new PriorityQueue<>(Collections.reverseOrder());
            for(int ele: arr){
                int diff = Math.abs(x-ele);
                PQ.add(new Pair(ele,diff));
                if(PQ.size()>k) PQ.remove();
            }
            while(PQ.size()>0){
                Pair p = PQ.remove();
                int ele = p.ele;
                ans.add(ele);
            }
            Collections.sort(ans);
            return ans;
        }
    }*/
}
