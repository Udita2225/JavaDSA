package Graphs;
/*
1514. Path with Maximum Probability

You are given an undirected weighted graph of n nodes (0-indexed), represented by an edge list where edges[i] = [a, b] is an undirected edge connecting the nodes a and b with a probability of success of traversing that edge succProb[i].

Given two nodes start and end, find the path with the maximum probability of success to go from start to end and return its success probability.

If there is no path from start to end, return 0. Your answer will be accepted if it differs from the correct answer by at most 1e-5.

Example 1:

Input: n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.2], start = 0, end = 2
Output: 0.25000
Explanation: There are two paths from start to end, one having a probability of success = 0.2 and the other has 0.5 * 0.5 = 0.25.
Example 2:

Input: n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.3], start = 0, end = 2
Output: 0.30000
Example 3:

Input: n = 3, edges = [[0,1]], succProb = [0.5], start = 0, end = 2
Output: 0.00000
Explanation: There is no path between 0 and 2.

Constraints:

2 <= n <= 10^4
0 <= start, end < n
start != end
0 <= a, b < n
a != b
0 <= succProb.length == edges.length <= 2*10^4
0 <= succProb[i] <= 1
There is at most one edge between every two nodes.
*/
public class LeetCode1514PathWithMaximumProbability {
    /*
    class Pair implements Comparable<Pair>{
    int node;
    double prob;
    public Pair(int node, double prob){
        this.node = node;
        this.prob = prob;
    }
    public int compareTo(Pair p){
        // if(this.prob==p.prob) return p.node-this.node;
        return Double.compare(p.prob,this.prob);
    }
}

class Solution {
    public double[] dijkstra(List<List<Pair>> adj, int start){
    int size =  adj.size();
    double[] maxProb = new double[size];
    Arrays.fill(maxProb, 0.0);
    maxProb[start] = 1.0;
    PriorityQueue<Pair> pq = new PriorityQueue<>();
    pq.add(new Pair(start,1.0));
    while(pq.size()>0){
        Pair top = pq.remove();
        int node = top.node;
        double prob = top.prob;
        if(prob<maxProb[node]) continue;
            for(Pair P: adj.get(node)){
                int n = P.node;
                double p  = P.prob;
                double totalProb = prob*p;

                if(totalProb>maxProb[n]){
                    maxProb[n] = totalProb;
                    pq.add(new Pair(n,totalProb));
                }
            }

    }
    return maxProb;
}
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
    // First of all make an Adjacency List
    List<List<Pair>> adj = new ArrayList<>();
    for(int i=0; i<n; i++){
        adj.add(new ArrayList<>());
    }
    int m = edges.length;
    for(int i=0; i<m; i++){
        int x = edges[i][0];
        int y = edges[i][1];
        double prob = succProb[i];
        adj.get(x).add(new Pair(y,prob));
        adj.get(y).add(new Pair(x,prob));
    }
    double[] prob = dijkstra(adj,start_node);
    return prob[end_node]==0.0 ? 0.0 : prob[end_node];
    }
}
     */
}
