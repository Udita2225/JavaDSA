package Graphs;
/*
743. Network Delay Time
You are given a network of n nodes, labeled from 1 to n. You are also given times, a list of travel times as directed edges times[i] = (ui, vi, wi), where ui is the source node, vi is the target node, and wi is the time it takes for a signal to travel from source to target.

We will send a signal from a given node k. Return the minimum time it takes for all the n nodes to receive the signal. If it is impossible for all the n nodes to receive the signal, return -1.

Example 1:

Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
Output: 2
Example 2:
Input: times = [[1,2,1]], n = 2, k = 1
Output: 1
Example 3:

Input: times = [[1,2,1]], n = 2, k = 2
Output: -1

Constraints:

1 <= k <= n <= 100
1 <= times.length <= 6000
times[i].length == 3
1 <= ui, vi <= n
ui != vi
0 <= wi <= 100
All the pairs (ui, vi) are unique. (i.e., no multiple edges.)
*/
public class LeetCode743NetworkDelayTime {
    /*
    class Pair implements Comparable<Pair>{
    int node;
    int time;
    public Pair(int node, int time){
        this.node = node;
        this.time = time;
    }
    public int compareTo(Pair p){
        if(this.time==p.time) return this.node-p.node;
        return this.time-p.time;
    }
}
class Solution {
    public int[] dijkstra(List<List<Pair>> adj, int source){
        int size = adj.size();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] time =  new int[size+1];
        for(int i=0; i<=size; i++){
            if(i==source || i==0) continue;
            time[i] =  Integer.MAX_VALUE;
        }
        pq.add(new Pair(source,0));
        while(pq.size()>0){
            Pair top =  pq.remove();
            int Node = top.node;
            int Time = top.time;
            if(time[Node]<=Time){
                for(Pair p: adj.get(Node)){
                    int n = p.node;
                    int t = p.time;
                    int totalTime = t + Time;
                    if(totalTime<time[n]){
                        time[n] = totalTime;
                        pq.add(new Pair(n,totalTime));
                    }
                }
            }
        }
        return time;
    }
    public int networkDelayTime(int[][] times, int n, int k) {
    List<List<Pair>> adj =  new ArrayList<>();
    for(int i=0; i<=n; i++){
        adj.add(new ArrayList<>());
    }
    int m = times.length;
    for(int i=0; i<m; i++){
        int idx = times[i][0];
        int node = times[i][1];
        int time = times[i][2];
        adj.get(idx).add(new Pair(node,time));
    }
    if(adj.get(k).size()==0) return -1;
    int[] time = dijkstra(adj,k);
    int minTime = 0;
    for(int i=0; i<=n; i++){
        if(time[i]==Integer.MAX_VALUE) return -1;
        minTime =  Math.max(minTime,time[i]);
    }
    return minTime;
    }
}
     */
}
