package Graphs;
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
public class LeetCode1584MinCostToConnectAllPointsPrimsAlgorithm {
    /*
    // This is the best code. I have used Indexes here instead of arrays or pairs
class Solution {
    public class Triplet implements Comparable<Triplet>{
        int curr;
        int parent;
        int weight;
        public Triplet(int curr, int parent, int weight){
            this.curr = curr;
            this.parent = parent;
            this.weight = weight;
        }
        public int compareTo(Triplet t){
            return this.weight-t.weight;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int size = points.length;
        boolean[] isVisited =  new boolean[size];
        int minSum = 0;
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0,-1,0));
        while(pq.size()>0){
            Triplet top = pq.remove();
            int currIdx = top.curr;
            int parentIdx =  top.parent;
            int weight =  top.weight;

            if(isVisited[currIdx]==false){
                isVisited[currIdx] = true;
                minSum += weight;
                for(int i=0; i<size; i++){
                    if(i==parentIdx) continue;
                    if(i==currIdx) continue;

                    int x1 = points[currIdx][0];
                    int y1 = points[currIdx][1];

                    int x2 = points[i][0];
                    int y2 = points[i][1];

                    int w =  Math.abs(Math.abs(x2-x1)+Math.abs(y2-y1));

                    if(isVisited[i]==false){
                        pq.add(new Triplet(i,currIdx,w));
                    }
                }
            }
        }
        return minSum;
    }
}
/*class Solution {
    public class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public class Quadralet implements Comparable<Quadralet>{
        int[] child;
        int[] parent;
        int weight;
        int idx;
        public Quadralet(int[] child, int[] parent, int weight, int idx){
            this.child = child;
            this.parent = parent;
            this.weight = weight;
            this.idx = idx;
        }
        public int compareTo(Quadralet t){
            return this.weight - t.weight;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int size =  points.length;
        boolean[] isVisited =  new boolean[size];
        int minSum = 0;
        PriorityQueue<Quadralet> pq = new PriorityQueue<>();
        int[] start = {-1,-1};
        pq.add(new Quadralet(points[0],start,0,0));
        while(pq.size()>0){
            Quadralet top = pq.remove();
            int[] child = top.child;
            int[] parent = top.parent;
            int weight = top.weight;
            int idx = top.idx;
            if(isVisited[idx]==false){
                isVisited[idx] = true;
                minSum += weight;
                for(int i=0; i<size; i++){
                    if(i==idx) continue;
                    int x1 = child[0];
                    int y1 = child[1];
                    int x2 = points[i][0];
                    int y2 = points[i][1];
                    int w = Math.abs(Math.abs(x2-x1) + Math.abs(y2-y1));
                    if(isVisited[i]==false){
                        pq.add(new Quadralet(points[i],child,w,i));
                    }

                }
            }
        }
        return minSum;
    }
}
/*
class Solution {
    public class Pair{
        int node;
        int weight;
        public Pair(int node, int weight){
            this.node = node;
            this.weight = weight;
        }
    }
    public class Triplet implements Comparable<Triplet>{
        int node;
        int parent;
        int weight;
        public Triplet(int node, int parent, int weight){
            this.node  =  node;
            this.parent = parent;
            this.weight = weight;
        }
        public int compareTo(Triplet t){
            return this.weight - t.weight;
        }
    }
    public int minCostConnectPoints(int[][] points) {
    int n = points.length; //No.of nodes
    List<List<Pair>> adj =  new ArrayList<>();
    for(int i=0; i<n; i++){
        adj.add(new ArrayList<>());
    }
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
        if(i==j) continue;
        int[] prev = points[i];
        int[] curr = points[j];
        int weight =  Math.abs(Math.abs(curr[1]-prev[1]) + Math.abs(curr[0]-prev[0]));
        adj.get(i).add(new Pair(j,weight));
       }
    }

    PriorityQueue<Triplet> pq =  new PriorityQueue<>();
    boolean[] isVisited =  new boolean[n];
    int minSum = 0;
    pq.add(new Triplet(0,-1,0));
    while(pq.size()>0){
        Triplet top  =  pq.remove();
        int node = top.node;
        int parent = top.parent;
        int weight = top.weight;
        if(isVisited[node]==false){
            isVisited[node] = true;
            minSum += weight;
            for(Pair p: adj.get(node)){
                int Node = p.node;
                if(Node==parent) continue;
                int w = p.weight;
                if(isVisited[Node]==false) pq.add(new Triplet(Node,node,w));
            }
        }
    }
    return minSum;
    }
}
*/

}
