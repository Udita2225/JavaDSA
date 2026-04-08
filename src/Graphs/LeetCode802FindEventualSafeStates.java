package Graphs;
/*
802. Find Eventual Safe States
Medium
Topics
premium lock icon
Companies
There is a directed graph of n nodes with each node labeled from 0 to n - 1. The graph is represented by a 0-indexed 2D integer array graph where graph[i] is an integer array of nodes adjacent to node i, meaning there is an edge from node i to each node in graph[i].

A node is a terminal node if there are no outgoing edges. A node is a safe node if every possible path starting from that node leads to a terminal node (or another safe node).

Return an array containing all the safe nodes of the graph. The answer should be sorted in ascending order.



Example 1:

Illustration of graph
Input: graph = [[1,2],[2,3],[5],[0],[5],[],[]]
Output: [2,4,5,6]
Explanation: The given graph is shown above.
Nodes 5 and 6 are terminal nodes as there are no outgoing edges from either of them.
Every path starting at nodes 2, 4, 5, and 6 all lead to either node 5 or 6.
Example 2:

Input: graph = [[1,2,3,4],[1,2],[3,4],[0,4],[]]
Output: [4]
Explanation:
Only node 4 is a terminal node, and every path starting at node 4 leads to node 4.


Constraints:

n == graph.length
1 <= n <= 104
0 <= graph[i].length <= n
0 <= graph[i][j] <= n - 1
graph[i] is sorted in a strictly increasing order.
The graph may contain self-loops.
The number of edges in the graph will be in the range [1, 4 * 104].
*/
public class LeetCode802FindEventualSafeStates {
    /*
    class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
    int n = graph.length;
    // 1. Reverse the graph
    List<List<Integer>> adj =  new ArrayList<>();
    for(int i=0; i<n; i++){
        adj.add(new ArrayList<>());
    }
    for(int i=0; i<n; i++){
        int[] arr = graph[i];
        for(int j=0; j<arr.length; j++){
            adj.get(arr[j]).add(i);
        }
    }
    //Kahns Algorithm
    // Queue declaration
    Queue<Integer> q = new LinkedList<>();
    // InDegree Array Formation
    int[] InDegree = new int[n];
    for(int i=0; i<n; i++){
        List<Integer> arr = adj.get(i);
        for(int j=0; j<arr.size(); j++){
            InDegree[arr.get(j)]++;
        }
    }

    // Add nodes with 0 InDegree in the Queue
    for(int i=0; i<n; i++){
        if(InDegree[i]==0) q.add(i);
    }

    // Queue Operations
    List<Integer> ans = new ArrayList<>();
    while(q.size()!=0){
        int front = q.remove();
        ans.add(front);
        List<Integer> arr =  adj.get(front);
        for(int i=0; i<arr.size(); i++){
            InDegree[arr.get(i)]--;
            if(InDegree[arr.get(i)]==0) q.add(arr.get(i));
        }
    }
    Collections.sort(ans);
    return ans;
    }
}
     */
}
