package Graphs;
/*
Directed Graph Cycle
Difficulty: MediumAccuracy: 27.88%Submissions: 573K+Points: 4
Given a Directed Graph with V vertices (Numbered from 0 to V-1) and E edges, check whether it contains any cycle or not.
The graph is represented as a 2D vector edges[][], where each entry edges[i] = [u, v] denotes an edge from vertex u to v.

Examples:

Input: V = 4, edges[][] = [[0, 1], [1, 2], [2, 0], [2, 3]]



Output: true
Explanation: The diagram clearly shows a cycle 0 → 1 → 2 → 0
Input: V = 4, edges[][] = [[0, 1], [0, 2], [1, 2], [2, 3]]


Output: false
Explanation: no cycle in the graph
Constraints:
1 ≤ V ≤ 105
0 ≤ E ≤ 105
0 ≤ edges[i][0], edges[i][1] < V

Expected Complexities
Time Complexity: O(V + E)
Auxiliary Space: O(V + E)
Company Tags
Flipkart Amazon Microsoft Samsung MakeMyTrip Oracle Goldman Sachs Adobe BankBazaar Rockstand NPCI
Topic Tags
Graph Data Structures
*/
public class GFGDirectedGraphCycleBFSKahnsAlgo {
    /*
    class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
    List<List<Integer>> adj = new ArrayList<>();
    for(int i=0; i<V; i++){
        adj.add(new ArrayList<>());
    }
    for(int i=0; i<edges.length; i++){
        int x = edges[i][0];
        int y = edges[i][1];
        adj.get(x).add(y);
    }


    Queue<Integer> q = new LinkedList<>();
    List<Integer> ans = new ArrayList<>();

    // Indegree
    int[] inDegree = new int[V];
    for(int[] a : edges){
        inDegree[a[1]]++;
    }

    for(int i=0; i<V; i++){
        if(inDegree[i]==0) q.add(i);
    }

    while(q.size()!=0){
        int front =  q.remove();
        ans.add(front);
        List<Integer> list =  adj.get(front);
        for(int ele: list){
            inDegree[ele]--;
            if(inDegree[ele]==0){
                q.add(ele);
            }
        }
    }
    return !(ans.size()==V);
    }
}
     */
}
