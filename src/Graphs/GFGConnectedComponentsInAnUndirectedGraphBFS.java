package Graphs;
/*
Connected Components in an Undirected Graph
Difficulty: MediumAccuracy: 48.5%Submissions: 40K+Points: 4
Given an undirected graph with V vertices numbered from 0 to V-1 and E edges, represented as a 2D array edges[][], where each entry edges[i] = [u, v] denotes an edge between vertices u and v.

Your task is to return a list of all connected components. Each connected component should be represented as a list of its vertices, with all components returned in a collection where each component is listed separately.

Note: You can return the components in any order, driver code will print the components in sorted order.

Examples :

Input: V = 5, edges[][] = [[0, 1], [2, 1], [3, 4]]
Output: [[0, 1, 2], [3, 4]]
Explanation:

Input: V = 7, edges[][] = [[0, 1], [6, 0], [2, 4], [2, 3], [3, 4]]
Output: [[0, 1, 6], [2, 3, 4], [5]]
Explanation:

Constraints:
1 ≤ V, E ≤ 105
0 ≤ edges[i][0], edges[i][1] < V

Expected Complexities
Time Complexity: O(V + E)
Auxiliary Space: O(V)
Company Tags
NPCI
Topic Tags
Graph union-find DFS BFS
*/
public class GFGConnectedComponentsInAnUndirectedGraphBFS {
    /*
    class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        int n =  edges.length;
        List<List<Integer>> adj =  new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<n; i++){
            int x = edges[i][0];
            int y = edges[i][1];
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        ArrayList<ArrayList<Integer>> ans  = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] isVisited  =  new boolean[V];
        for(int i=0; i<V; i++){
            if(!isVisited[i]){
               isVisited[i] =  true;
               q.add(i);
               ArrayList<Integer> a = new ArrayList<>();
               a.add(i);
               while(q.size()>0){
                   int top = q.remove();
                   for(int ele: adj.get(top)){
                       if(!isVisited[ele]){
                       isVisited[ele] = true;
                       a.add(ele);
                       q.add(ele);
                       }
                   }
               }
               ans.add(a);
            }
        }
        return ans;
    }
}
     */
}
