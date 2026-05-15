package Graphs;
/*
787. Cheapest Flights Within K Stops
Medium
Topics
premium lock icon
Companies
There are n cities connected by some number of flights. You are given an array flights where flights[i] = [fromi, toi, pricei] indicates that there is a flight from city fromi to city toi with cost pricei.

You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops. If there is no such route, return -1.



Example 1:


Input: n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1
Output: 700
Explanation:
The graph is shown above.
The optimal path with at most 1 stop from city 0 to 3 is marked in red and has cost 100 + 600 = 700.
Note that the path through cities [0,1,2,3] is cheaper but is invalid because it uses 2 stops.
Example 2:


Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1
Output: 200
Explanation:
The graph is shown above.
The optimal path with at most 1 stop from city 0 to 2 is marked in red and has cost 100 + 100 = 200.
Example 3:


Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0
Output: 500
Explanation:
The graph is shown above.
The optimal path with no stops from city 0 to 2 is marked in red and has cost 500.


Constraints:

2 <= n <= 100
0 <= flights.length <= (n * (n - 1) / 2)
flights[i].length == 3
0 <= fromi, toi < n
fromi != toi
1 <= pricei <= 104
There will not be any multiple flights between two cities.
0 <= src, dst, k < n
src != dst
*/
public class LeetCode787CheapestFlightsWithinKStops {
/*
class Solution {
     public class Triplet{
        int node;
        int cost;
        int stop;
        public Triplet(int node, int cost, int stop){
            this.node = node;
            this.cost = cost;
            this.stop = stop;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
     int m = flights.length;
    List<List<Triplet>> adj =  new ArrayList<>();
    for(int i=0; i<n; i++){
        adj.add(new ArrayList<>());
    }
    for(int i=0; i<m; i++){
        int x = flights[i][0];
        int y = flights[i][1];
        int cost =  flights[i][2];
        adj.get(x).add(new Triplet(y,cost,1));
    }
    Queue<Triplet> q =  new LinkedList<>();
    q.add(new Triplet(src,0,0));
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i] =  Integer.MAX_VALUE;
    }
    arr[src] = 0;
    while(q.size()>0){
        Triplet top = q.remove();
        int node = top.node;
        int cost = top.cost;
        int stop =  top.stop;
        // if(node==dst && stop<=k+1) return cost;
        if(stop>=k+1) continue;
        for(Triplet t: adj.get(node)){
            int Node = t.node;
            int newCost = t.cost + cost;
            int newStop = stop + 1;
            if(arr[Node]>newCost && newStop<=k+1){
                    arr[Node] = newCost;
                    q.add(new Triplet(Node,newCost,newStop));
            }
        }
    }
    return (arr[dst]==Integer.MAX_VALUE) ? -1 : arr[dst];
    }
}
 */


//    We can solve this problem using simple Queue


    /*
    // By Using Only 1-D Array
// By Comparing Through No. of stops, we actually dont need a priorityQueue
// This is sir's method
class Solution {
    public class Triplet implements Comparable<Triplet>{
        int node;
        int cost;
        int stop;
        public Triplet(int node, int cost, int stop){
            this.node = node;
            this.cost = cost;
            this.stop = stop;
        }
        public int compareTo(Triplet t){
            return this.stop - t.stop;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
    int m = flights.length;
    List<List<Triplet>> adj =  new ArrayList<>();
    for(int i=0; i<n; i++){
        adj.add(new ArrayList<>());
    }
    for(int i=0; i<m; i++){
        int x = flights[i][0];
        int y = flights[i][1];
        int cost =  flights[i][2];
        adj.get(x).add(new Triplet(y,cost,1));
    }
    PriorityQueue<Triplet> pq =  new PriorityQueue<>();
    pq.add(new Triplet(src,0,0));
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i] =  Integer.MAX_VALUE;
    }
    arr[src] = 0;
    while(pq.size()>0){
        Triplet top = pq.remove();
        int node = top.node;
        int cost = top.cost;
        int stop =  top.stop;
        // if(node==dst && stop<=k+1) return cost;
        if(stop>=k+1) continue;
        for(Triplet t: adj.get(node)){
            int Node = t.node;
            int newCost = t.cost + cost;
            int newStop = stop + 1;
            if(arr[Node]>newCost && newStop<=k+1){
                    arr[Node] = newCost;
                    pq.add(new Triplet(Node,newCost,newStop));
            }
        }
    }
    for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    return (arr[dst]==Integer.MAX_VALUE) ? -1 : arr[dst];
    }
}
     */

/*
My Method - Using 2-D Array
class Solution {
    public class Triplet implements Comparable<Triplet>{
        int node;
        int cost;
        int stop;
        public Triplet(int node, int cost, int stop){
            this.node = node;
            this.cost = cost;
            this.stop = stop;
        }
        public int compareTo(Triplet t){
            return this.cost - t.cost;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
    int m =  flights.length;
    List<List<Triplet>> adj =  new ArrayList<>();
    for(int i=0; i<n; i++){
        adj.add(new ArrayList<>());
    }
    for(int i=0; i<m; i++){
        int x = flights[i][0];
        int y = flights[i][1];
        int cost =  flights[i][2];
        adj.get(x).add(new Triplet(y,cost,0));
    }
    int[][] grid = new int[n][k+1];
    for(int i=0; i<n; i++){
        for(int j=0; j<=k; j++){
            grid[i][j] =  Integer.MAX_VALUE;
        }
    }
    grid[src][0] = 0;
    PriorityQueue<Triplet> pq =  new PriorityQueue<>();
    pq.add(new Triplet(src,0,0));
    while(pq.size()>0){
        Triplet top = pq.remove();
        int node = top.node;
        int cost = top.cost;
        int stop = top.stop;
            for(Triplet t: adj.get(node)){
                int x = t.node;
                int c = t.cost;
                int newStop = stop+1;
                int newCost = cost + c;
                if(newStop-1 <= k && grid[x][newStop-1]>newCost){
                    grid[x][newStop-1]  =  newCost;
                    pq.add(new Triplet(x,newCost,newStop));
           }
        }
    }
    int min = Integer.MAX_VALUE;
    for(int i=0; i<=k; i++){
        min =  Math.min(grid[dst][i],min);
    }
    return min==Integer.MAX_VALUE?-1:min;
  }
}
 */
}
