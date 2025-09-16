package Heaps2;
//786. K-th Smallest Prime Fraction
public class LeetCode786KthSmallestPrimeFraction {
/*You are given a sorted integer array arr containing 1 and prime numbers, where all the integers of arr are unique.
You are also given an integer k.
For every i and j where 0 <= i < j < arr.length, we consider the fraction arr[i] / arr[j].
Return the kth smallest fraction considered. Return your answer as an array of integers of size 2,
where answer[0] == arr[i] and answer[1] == arr[j].
Example 1:
Input: arr = [1,2,3,5], k = 3
Output: [2,5]
Explanation: The fractions to be considered in sorted order are:
1/5, 1/3, 2/5, 1/2, 3/5, and 2/3.
The third fraction is 2/5.
Example 2:
Input: arr = [1,7], k = 1
Output: [1,7]
Constraints:
2 <= arr.length <= 1000
1 <= arr[i] <= 3 * 104
arr[0] == 1
arr[i] is a prime number for i > 0.
All the numbers of arr are unique and sorted in strictly increasing order.
1 <= k <= arr.length * (arr.length - 1) / 2
Follow up: Can you solve the problem with better than O(n2) complexity?*/
}
/*

 */
/* By Using Heaps
TC :- O(n^2 log k)
//By using Only Heaps
class Solution {
    public class Triplet implements Comparable<Triplet>{
        double ele;
        int i;
        int j;
        Triplet(double ele, int i, int j){
            this.ele =ele;
            this.i =i;
            this.j =j;
        }
        public int compareTo(Triplet t){
            return Double.compare(this.ele,t.ele);
        }
    }
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
    PriorityQueue<Triplet> PQ = new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0; i<arr.length-1; i++){
        for(int j=i+1; j<arr.length; j++){
            PQ.add(new Triplet((arr[i]*1.0)/arr[j],arr[i],arr[j]));
            if(PQ.size()>k) PQ.remove();
        }
    }
    int[] res = {PQ.peek().i, PQ.peek().j};
    return res;
}
}
 */
/* Brute Force
TC :- O(n^2 log n)
class Solution {
    public class Triplet implements Comparable<Triplet>{
        double ele;
        int i;
        int j;
        Triplet(double ele, int i, int j){
            this.ele =ele;
            this.i =i;
            this.j =j;
        }
        public int compareTo(Triplet t){
            return Double.compare(this.ele,t.ele);
        }
    }
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
    ArrayList<Triplet> ans = new ArrayList<>();
    for(int i=0; i<arr.length-1; i++){
        for(int j=i+1; j<arr.length; j++){
            ans.add(new Triplet((arr[i]*1.0)/arr[j], arr[i], arr[j]));
        }
    }
    Collections.sort(ans);
    int[] res = new int[2];
    int x = ans.get(k-1).i;
    int y = ans.get(k-1).j;
    res[0] = x;
    res[1] = y;
    return res;
    }
}
*/
