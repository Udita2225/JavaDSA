package Heaps1;
//973. K Closest Points to Origin
public class LeetCode973KClosestPointstoOrigin {
/*
Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k
closest points to the origin (0, 0).
The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
Example 1:
Input: points = [[1,3],[-2,2]], k = 1
Output: [[-2,2]]
Explanation:
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
Example 2:
Input: points = [[3,3],[5,-1],[-2,4]], k = 2
Output: [[3,3],[-2,4]]
Explanation: The answer [[-2,4],[3,3]] would also be accepted.
Constraints:
1 <= k <= points.length <= 104
-104 <= xi, yi <= 104
*/
/* Using Custom Comparator
class Solution {
    public class Triplet implements Comparable<Triplet>{
        int d;
        int x;
        int y;
        Triplet(int d, int  x, int y){
            this.d = d;
            this.x = x;
            this.y = y;
        }
        public int compareTo(Triplet t){
            return this.d - t.d;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
    int n = points.length;
    if(n==k) return points;
    PriorityQueue<Triplet> PQ  = new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0; i<n; i++){
    int x = points[i][0];
    int y = points[i][1];
    int distance = x*x + y*y;
    PQ.add(new Triplet(distance,x,y));
    if(PQ.size()>k) PQ.remove();
    }
    int[][] ans = new int[k][2];
    for(int i=0; i<k; i++){
        Triplet t = PQ.remove();
        ans[i][0] = t.x;
        ans[i][1] = t.y;
    }
    return ans;
    }
}
*/
/*If the distance between two or more points is same then this method will not work ..as in HashMap the key value is unique
and keeps updating if same key is inserted multiple times
class Solution {
    class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x =x;
            this.y =y;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
    int n = points.length;
    if(k==n) return points;
    HashMap<Integer, Pair> map = new HashMap<>();
    PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0; i<n; i++){
        // int[] arr = points[i];
        // int x = arr[0];
        // int y = arr[1];
        int x = points[i][0];
        int y = points[i][1];
        int distance =  x*x + y*y;
        map.put(distance,new Pair(x,y));
        PQ.add(distance);
        if(PQ.size()>k) PQ.remove();
    }
    int[][] ans = new int[k][2];
    for(int i=0; i<k; i++){
        int dist = PQ.remove();
        Pair pt = map.get(dist);
        ans[i][0] = pt.x;
        ans[i][1] = pt.y;
    }
    return ans;
    }
}
*/
}
