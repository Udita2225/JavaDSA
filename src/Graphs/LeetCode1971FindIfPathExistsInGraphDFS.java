package Graphs;

public class LeetCode1971FindIfPathExistsInGraphDFS {
    /*
    class Solution {
    public void dfs(int source, int destination, List<List<Integer>> adj, boolean[] isVisited){
        if(isVisited[source]) return;
        isVisited[source] = true;
        if(source == destination) return;
        List<Integer> arr = adj.get(source);
        for(int i=0; i<arr.size(); i++){
            if(!isVisited[arr.get(i)]) dfs(arr.get(i),destination, adj,isVisited);
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
    List<List<Integer>> adj =  new ArrayList<>();
    for(int i=0; i<n; i++){
        adj.add(new ArrayList<>());
    }
    for(int i=0; i<edges.length; i++){
        int x = edges[i][0];
        int y = edges[i][1];
        adj.get(x).add(y);
        adj.get(y).add(x);
    }
    boolean[] isVisited = new boolean[n];
    dfs(source,destination,adj,isVisited);
    return isVisited[destination];
    }
}
     */
}
