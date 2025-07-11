package Heaps1;
//1636. Sort Array by Increasing Frequency
/*
Given an array of integers nums, sort the array in increasing order based on the frequency of the values.
If multiple values have the same frequency, sort them in decreasing order.
Return the sorted array.
Example 1:
Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
Example 2:
Input: nums = [2,3,1,3,2]
Output: [1,3,3,2,2]
Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
Example 3:
Input: nums = [-1,1,-6,4,5,-6,1,4,1]
Output: [5,-1,4,4,-6,-6,1,1,1]
Constraints:
1 <= nums.length <= 100
-100 <= nums[i] <= 100
*/
public class LeetCode1636SortArrayByIncreasingFrequency {
/*
class Solution {
    public class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }
        public int compareTo(Pair p){
            if (this.freq==p.freq) return p.ele-this.ele;
            return this.freq-p.freq;
        }
    }
    public int[] frequencySort(int[] nums) {
    int[] ans = new int[nums.length];
    int i=0;
    HashMap<Integer, Integer> map = new HashMap<>();
    PriorityQueue<Pair> PQ = new PriorityQueue<>();
    for(int ele: nums){
        if(map.containsKey(ele)){
            int freq = map.get(ele);
            map.put(ele, freq+1);
        }
        else map.put(ele,1);
    }
    for(int key: map.keySet()){
        int freq = map.get(key);
        PQ.add(new Pair(key, freq));
    }
    while(PQ.size()>0){
       Pair p = PQ.remove();
       int freq = p.freq;
       int ele = p.ele;
       while(freq>0){
       ans[i] =ele;
       i++;
       freq--;
       }
    }
    return ans;
    }
}
*/
}
