package Graphs;
/*
Undirected Graph Cycle
Difficulty: MediumAccuracy: 30.13%Submissions: 707K+Points: 4Average Time: 20m
Given an undirected graph with V vertices and E edges, represented as a 2D vector edges[][], where each entry edges[i] = [u, v] denotes an edge between vertices u and v, determine whether the graph contains a cycle or not.

Note: The graph can have multiple component.

Examples:

Input: V = 4, E = 4, edges[][] = [[0, 1], [0, 2], [1, 2], [2, 3]]
Output: true
Explanation:

1 -> 2 -> 0 -> 1 is a cycle.
Input: V = 4, E = 3, edges[][] = [[0, 1], [1, 2], [2, 3]]
Output: false
Explanation:

No cycle in the graph.
Constraints:
1 ≤ V, E ≤ 105
0 ≤ edges[i][0], edges[i][1] < V

Expected Complexities
Company Tags
FlipkartAmazonMicrosoftSamsungMakeMyTripOracleAdobe
Topic Tags
DFS Graphunion-find Data Structures Algorithms
*/
public class GFGUndirectedGraphCycleBFS {
    /*
    class Solution {
    public class Pair{
        int Node;
        int Parent;
        public Pair(int Node, int Parent){
            this.Node = Node;
            this.Parent =  Parent;
        }
    }
    public boolean bfs(Pair idx, List<List<Integer>> adj, boolean[] isVisited){
        Queue<Pair> q = new LinkedList<>();
        q.add(idx);
        isVisited[idx.Node] = true;
        while(q.size()!=0){
            Pair p =  q.remove();
            int OutN = p.Node;
            int OutP = p.Parent;
            List<Integer> arr = adj.get(p.Node);
            for(int i=0; i<arr.size(); i++){
                int Idx =  arr.get(i);
                if(isVisited[Idx]==false){
                    q.add(new Pair(Idx,OutN));
                    isVisited[Idx] = true;
                }
                else if(isVisited[Idx] && Idx != OutP ) return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<List<Integer>> adj =  new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        int n = edges.length;
        for(int i=0; i<n; i++){
            int x = edges[i][0];
            int y = edges[i][1];
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        boolean[] isVisited = new boolean[V];
        for(int i=0; i<V; i++){
            if(isVisited[i]==false){
                if(bfs(new Pair(i,-1),adj,isVisited)) return true;
            }
        }
        return false;
    }
}
    */
}
