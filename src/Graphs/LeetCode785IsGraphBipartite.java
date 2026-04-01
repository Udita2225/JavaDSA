package Graphs;
/*
785. Is Graph Bipartite?
Medium
Topics
premium lock icon
Companies
There is an undirected graph with n nodes, where each node is numbered between 0 and n - 1. You are given a 2D array graph, where graph[u] is an array of nodes that node u is adjacent to. More formally, for each v in graph[u], there is an undirected edge between node u and node v. The graph has the following properties:

There are no self-edges (graph[u] does not contain u).
There are no parallel edges (graph[u] does not contain duplicate values).
If v is in graph[u], then u is in graph[v] (the graph is undirected).
The graph may not be connected, meaning there may be two nodes u and v such that there is no path between them.
A graph is bipartite if the nodes can be partitioned into two independent sets A and B such that every edge in the graph connects a node in set A and a node in set B.

Return true if and only if it is bipartite.



Example 1:


Input: graph = [[1,2,3],[0,2],[0,1,3],[0,2]]
Output: false
Explanation: There is no way to partition the nodes into two independent sets such that every edge connects a node in one and a node in the other.
Example 2:


Input: graph = [[1,3],[0,2],[1,3],[0,2]]
Output: true
Explanation: We can partition the nodes into two sets: {0, 2} and {1, 3}.


Constraints:

graph.length == n
1 <= n <= 100
0 <= graph[u].length < n
0 <= graph[u][i] <= n - 1
graph[u] does not contain u.
All the values of graph[u] are unique.
If graph[u] contains v, then graph[v] contains u.
*/
public class LeetCode785IsGraphBipartite {
    /*
    class Solution {
    public boolean dfs(int i, int parentColor, int[][] graph, int[] isVisited){
    if(parentColor==0 || parentColor==2) isVisited[i] = 1;
    else if(parentColor==1) isVisited[i] = 2;
    int[] list =  graph[i];
    for(int j=0; j<list.length; j++){
        int child = list[j];
        if(isVisited[child]==0){
            if(!dfs(child,isVisited[i],graph,isVisited)) return false;
        }
        else if(isVisited[child]!=0 && isVisited[child]==isVisited[i]) return false;
    }
    return true;
    }
    public boolean isBipartite(int[][] graph) {
    int n = graph.length;
    int[] isVisited = new int[n];
    // We have to check all the vertices as there may be more than one component in the graph
    for(int i=0; i<n; i++){
        if(isVisited[i]==0) {
            if(!dfs(i,0,graph,isVisited)) return false;
        }
    }
    return true;
    }
}
/*
/*class Solution {
    public boolean bfs(int idx ,int[][] graph, int[] isVisited){
        isVisited[idx] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        while(q.size()!=0){
            int front = q.remove();
            int[] arr = graph[front];
            for(int i=0; i<arr.length; i++){
                int ele = arr[i];
                if(isVisited[ele]==isVisited[front]) return false;
                if(isVisited[ele]==0){
                    q.add(ele);
                    if(isVisited[front]==1) isVisited[ele] = 2;
                    else isVisited[ele] = 1;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
    int n = graph.length;
    int[] isVisited =  new int[n];
    for(int i=0; i<n; i++){
    if(isVisited[i]==0){
    if(!bfs(i,graph,isVisited)) return false;

    }
    }
    return true;
    }
}
*/


}
