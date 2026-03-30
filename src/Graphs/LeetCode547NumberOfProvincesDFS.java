package Graphs;

public class LeetCode547NumberOfProvincesDFS {
    /* dfs
    class Solution {
        public void dfs(int idx, int[][] isConnected, boolean[] isVisited){
            int n =  isConnected.length;
            int[] arr =  isConnected[idx];
            isVisited[idx] =  true;
            for(int i=0; i<n; i++){
                if(isConnected[idx][i] == 1 && isVisited[i]==false){
                    isVisited[i] = true;
                    dfs(i,isConnected,isVisited);
                }
            }
        }
        public int findCircleNum(int[][] isConnected) {
            int n =  isConnected.length;
            boolean[] isVisited =  new boolean[n];
            int provinces = 0;
            for(int i=0; i<n; i++){
                if(isVisited[i]==false){
                    dfs(i, isConnected, isVisited);
                    provinces++;
                }
            }
            return provinces;
        }
    }

     */
}
