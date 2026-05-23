package Graphs;

public class FloydWarshallAlgorithm {
    /*
    class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
    int size = edges.length;
    int[][] dist = new int[n][n];
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(i==j) dist[i][j] = 0;
            else dist[i][j] =  Integer.MAX_VALUE;
        }
    }
    for(int i=0; i<size; i++){
       int x = edges[i][0];
       int y = edges[i][1];
       int w = edges[i][2];
       dist[x][y] = w;
       dist[y][x] = w;
    }
    // Floyd Warshall Algorithm
    for(int k=0; k<n; k++){// Through every Node
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==k || j==k) continue;
                if(i==j) continue;
                if(dist[i][k]!=Integer.MAX_VALUE && dist[k][j]!= Integer.MAX_VALUE){
                dist[i][j]  =  Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
    }

    // Checking for the node where the no. of cities with distance is atmost equal to threshold is lowest
    int minCount = Integer.MAX_VALUE;
    int node = Integer.MIN_VALUE;
    for(int i=0; i<n; i++){
        int count = 0;
        for(int j=0; j<n; j++){
            if(dist[i][j] <= distanceThreshold) count++;
            System.out.println(dist[i][j]);
        }
        if(count <= minCount){
            minCount =  count;
            node =  Math.max(node,i);
        }
    }
    return node;
    }
}
     */
}
