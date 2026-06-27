package Graphs;

public class GFGConnectedComponentsInAnUndirectedGraphDFS {
    static void main() {
    /*
    class Solution {
    public void dfs(int i, boolean[] isVisited, ArrayList<ArrayList<Integer>> ans, List<List<Integer>> list, ArrayList<Integer> arr){
        isVisited[i] =  true;
        arr.add(i);
        for(int ele: list.get(i)){
            if(!isVisited[ele]){
                dfs(ele,isVisited,ans,list,arr);
            }
        }
    }
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        boolean[] isVisited =  new boolean[V];
        int n =  edges.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<V; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<n; i++){
            int x = edges[i][0];
            int y = edges[i][1];
            list.get(x).add(y);
            list.get(y).add(x);
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<V; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            if(!isVisited[i]){
                dfs(i,isVisited,ans,list,arr);
                ans.add(arr);
            }

        }
        return ans;
    }
}
     */
    }
}
