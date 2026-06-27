package Graphs;

public class LeetCode547NumberOfProvincesDSU {
    /*
    // This is still not the best optimized  code.
class Solution {
    public int find(int i, int[] parent){
        if(parent[i] == i) return i;
        int p = find(parent[i], parent);
        return p;
    }
    public void union(int i, int j, int[] parent, int[] size){
        int li = find(i,parent);
        int lj = find(j,parent);
        if(li != lj){
            if(size[li]>size[lj]){
                parent[lj] = li;
                size[li] += size[lj];
            }
            else{
                parent[li] = lj;
                size[lj] += size[li];
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
    int n =  isConnected.length;
    int[] parent =  new int[n];
    int[] size =  new int[n];
    for(int i=0; i<n; i++){
        parent[i] = i;
        size[i] = 1;
    }
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(isConnected[i][j] == 1){
                union(i,j,parent,size);
            }
        }
    }
    int count = 0;
    for(int i=0; i<n; i++){
        if(parent[i]==i) count++;
    }
    return count;
    }
}
     */
}
