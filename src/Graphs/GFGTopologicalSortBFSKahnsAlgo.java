package Graphs;

public class GFGTopologicalSortBFSKahnsAlgo {
    /* Better Code
    class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<Integer> ans  = new ArrayList<>();
        List<List<Integer>> adj =  new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0; i<edges.length; i++){
            int x =  edges[i][0];
            int y =  edges[i][1];
            adj.get(x).add(y);
        }
        // Only one Queue is required
        Queue<Integer> q = new LinkedList<>();

        //Compute the inDegree Array
        int[] inDegree =  new int[V];
        for(int i=0; i<edges.length; i++){
            int vertex =  edges[i][1];
            inDegree[vertex]++;
        }
        //Add the elements with 0 Indegree;
        for(int i=0; i<V; i++){
            if(inDegree[i]==0) q.add(i);
        }

        //Use Queue
        while(q.size()!=0){
            int front =  q.remove();
            ans.add(front);
            for(int ele: adj.get(front)){
                inDegree[ele]--;
                if(inDegree[ele]==0) q.add(ele);
            }
        }
        return ans;
    }
}

    */



    // Overcomplicated Code
    /*
    class Solution {
    public void  bfs(int i, List<List<Integer>> adj, boolean[] isVisited,int[] inDegree, ArrayList<Integer> ans){
        isVisited[i] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(q.size()!=0){
            int front = q.remove();
            ans.add(front);
            List<Integer> list = adj.get(front);
            for(int j=0; j<list.size(); j++){
                int ele =  list.get(j);
                inDegree[ele]--;
            }
            for(int j=0; j<inDegree.length; j++){
                if(isVisited[j]==false && inDegree[j]==0){
                    q.add(j);
                    isVisited[j] = true;
                }
            }
        }

    }
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        boolean[] isVisited =  new boolean[V];
        List<List<Integer>> adj =  new ArrayList<>();
        for(int i=0;i<V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int x = edges[i][0];
            int y = edges[i][1];
            adj.get(x).add(y);
        }
        int[] inDegree = new int[V];
        for(int i=0; i<V; i++){
            List<Integer> arr = adj.get(i);
            for(int j=0; j<arr.size(); j++){
               int v = arr.get(j);
               inDegree[v]++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<V; i++){
            if(!isVisited[i] && inDegree[i]==0) bfs(i,adj,isVisited,inDegree, ans);
        }
        return ans;
    }
}
    */
}
