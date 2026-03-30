package Graphs;

public class GFGUndirectedGraphCycleDFS {
    /*
    class Solution {
    public boolean dfs(int child, int parent, List<List<Integer>> adj, boolean[] isVisited){
        isVisited[child] = true;
        List<Integer> arr = adj.get(child);
        for(int i=0; i<arr.size(); i++){
            int ele = arr.get(i);
            if(isVisited[ele]==false){
                if(dfs(ele,child,adj,isVisited)) return true;
            }
            else if(isVisited[ele]==true && ele!=parent) return true;
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        boolean[] isVisited = new boolean[V];
        List<List<Integer>> adj =  new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int x = edges[i][0];
            int y = edges[i][1];
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        for(int i=0; i<V; i++){
            if(isVisited[i]==false){
                if(dfs(i,-1,adj,isVisited)) return true;

            }
        }
        return false;
    }
}
    */

    /*
    class Solution {
    public void dfs(int child, int parent, List<List<Integer>> adj, boolean[] isVisited, boolean[] flag){
        isVisited[child] = true;
        List<Integer> arr = adj.get(child);
        for(int i=0; i<arr.size(); i++){
            int ele = arr.get(i);
            if(isVisited[ele]==false){
                dfs(ele,child,adj,isVisited,flag);

            }
            else if(isVisited[ele]==true && ele!=parent) flag[0] = true;
        }
    }
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        boolean[] isVisited = new boolean[V];
        List<List<Integer>> adj =  new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int x = edges[i][0];
            int y = edges[i][1];
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        boolean[] flag = {false};
        for(int i=0; i<V; i++){
            if(isVisited[i]==false){
                dfs(i,-1,adj,isVisited,flag);
                if(flag[0]==true) return true;

            }
        }
        return false;
    }
}
     */
}
