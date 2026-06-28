package Graphs;

public class LeetCode1584MInCostToConnectAllPointsKruskalsAlgorithm {
/*
1584. Min Cost to Connect All Points
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given an array points representing integer coordinates of some points on a 2D-plane, where points[i] = [xi, yi].

The cost of connecting two points [xi, yi] and [xj, yj] is the manhattan distance between them: |xi - xj| + |yi - yj|, where |val| denotes the absolute value of val.

Return the minimum cost to make all points connected. All points are connected if there is exactly one simple path between any two points.



Example 1:


Input: points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
Output: 20
Explanation:

We can connect the points as shown above to get the minimum cost of 20.
Notice that there is a unique path between every pair of points.
Example 2:

Input: points = [[3,12],[-2,5],[-4,1]]
Output: 18


Constraints:

1 <= points.length <= 1000
-106 <= xi, yi <= 106
All pairs (xi, yi) are distinct.
 */
}
/*
// But here also in Collections.sort() if the no. of edges is n^2 then the timeComplexity becomes n^2logn
class Solution {
    public class Edge implements Comparable<Edge>{
        int x;
        int y;
        int cost;
        public Edge(int x, int y, int cost){
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
        public int compareTo(Edge e){
            return this.cost-e.cost;
        }
    }
    public int find(int x, int[] parent){
        if(parent[x]==x) return x;
        return parent[x] = find(parent[x],parent);
    }
    public void union(int a, int b, int[] parent, int[] size, int[] min, int cost){
        int la = find(a,parent);
        int lb = find(b,parent);
        if(la!=lb){
            min[0] += cost;
            if(size[la]>size[lb]){
                parent[lb] = la;
                size[la] += size[lb];
            }
            else{
                parent[la] = lb;
                size[lb] += la;
            }
        }
    }
    public int minCostConnectPoints(int[][] points) {
    int n = points.length;
    List<Edge> list =  new ArrayList<>();
    for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
        int x1 = points[i][0];
        int y1 = points[i][1];
        int x2 = points[j][0];
        int y2 = points[j][1];
        int cost =  Math.abs(x2-x1) + Math.abs(y2-y1);
        list.add(new Edge(i,j,cost));
        }
    }
    int[] parent  = new int[n];
    int[] size = new int[n];
    for(int i=0; i<n; i++){
        parent[i] = i;
        size[i] = 1;
    }
    int[] min = {0};
    Collections.sort(list);
    for(int i=0; i<list.size(); i++){
        Edge e = list.get(i);
        int a = e.x;
        int b = e.y;
        int cost = e.cost;
        union(a,b,parent,size,min,cost);
    }
    return min[0];
    }
}
/*
Instead of PriorityQueue, we can use ArrayList and then sort it. Beacause Priority Queue is increasing the Time Complexity to O(n^2logn)

class Solution {
    public class Triplet implements Comparable<Triplet>{
        int x;
        int y;
        int w;
        public Triplet(int x, int y, int w){
            this.x = x;
            this.y = y;
            this.w =  w;
        }
        public int compareTo(Triplet t){
            if(this.w == t.w) return this.x-t.x;
            return this.w-t.w;
        }
    }
    public int find(int x, int[] parent){
        if(parent[x]==x) return x;
        return parent[x] =  find(parent[x], parent);
    }
    public void union(int a, int b, int[] parent,int[] size, int w , int[] min){
        int la = find(a,parent);
        int lb = find(b,parent);
        if(la!=lb){
            min[0] += w;
            if(size[la]>size[lb]){
                parent[lb] = la;
                size[la] += size[lb];
            }
            else{
                parent[la] = lb;
                size[lb] += size[la];
            }
        }
    }
    public int minCostConnectPoints(int[][] points) {
    int n = points.length;
    PriorityQueue<Triplet> pq = new PriorityQueue<>();
    for(int i=0; i<n-1; i++){// Here the Time Complexity is :- O(n^2logn)
        for(int j=i+1; j<n; j++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            int x2 = points[j][0];
            int y2 = points[j][1];
            int dist = Math.abs(x2-x1) + Math.abs(y2-y1);
            pq.add(new Triplet(i,j,dist));
        }
    }
    int[] parent = new int[n];
    int[] size = new int[n];
    for(int i=0; i<n; i++){
        parent[i] = i;
        size[i] = 1;
    }
    int[] min = {0};
    while(pq.size()>0){
        Triplet t = pq.remove();
        int a = t.x;
        int b = t.y;
        int w = t.w;
        // System.out.println(a+ "" + b + w);
        union(a,b,parent,size,w,min);
    }
    return min[0];
    }
}
 */