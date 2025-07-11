package Heaps1;
//347. Top K Frequent Elements
/*
Given an integer array nums and an integer k, return the k most frequent elements.
You may return the answer in any order.
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:
Input: nums = [1], k = 1
Output: [1]
Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
*/
public class LeetCode347TopKFrequentElements {
/*
class Solution {
    public class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq =freq;
        }
        public int compareTo(Pair p){
            return this.freq - p.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
    int[] ans = new int[k];
    HashMap<Integer, Integer> map = new HashMap<>();
    PriorityQueue<Pair> PQ = new PriorityQueue<Pair>();
    for(int ele: nums){
        if(map.containsKey(ele)){
            int freq =  map.get(ele);
            map.put(ele, freq+1);
        }
        else map.put(ele,1);
    }
    for(int key : map.keySet()){
        int freq = map.get(key);
        PQ.add(new Pair(key,freq));
        if(PQ.size()>k) PQ.remove();
    }
    for(int i=0; i<k; i++){
        Pair p = PQ.remove();
        ans[i] = p.ele;
    }
    return ans;
    }
}
*/
}
