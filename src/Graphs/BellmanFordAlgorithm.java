package Graphs;

public class BellmanFordAlgorithm {
    /*
    // By using Bellman-Ford Algorithm
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
    int[] dist =  new int[n+1];
    for(int i=0; i<=n; i++){
        dist[i] =  Integer.MAX_VALUE;
    }
    dist[k] = 0;
    int m = n-1;
    while(m>=0){
        for(int i=0; i<times.length; i++){
            int u = times[i][0];
            int v = times[i][1];
            int w = times[i][2];
            if(dist[u]==Integer.MAX_VALUE) continue;
            else if(dist[u]+w <dist[v]){
                dist[v] = dist[u]+w;
            }
        }
        m--;
    }
    int max =  Integer.MIN_VALUE;
    for(int i=1; i<=n; i++){
        if(dist[i]==Integer.MAX_VALUE) return -1;
        max = Math.max(max,dist[i]);
    }
    return max;
    }
}
     */
}
