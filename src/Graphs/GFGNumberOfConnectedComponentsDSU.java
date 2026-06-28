package Graphs;
/*
Number of Connected Components
Difficulty: MediumAccuracy: 54.29%Submissions: 173K+Points: 4Average Time: 20m
Given an undirected graph with V vertices numbered from 0 to V-1 and E edges, represented as a 2D array edges[][], where each entry edges[i] = [u, v] denotes an edge between vertices u and v. Count the number of connected components in the graph. Two vertices belong to the same connected component if there is a path between them.

Examples :

Input: V = 5, edges[][] = [[0, 1], [2, 1], [3, 4]]
Output: 2
Explanation:

Input: V = 7, edges[][] = [[0, 1], [6, 0], [2, 4], [2, 3], [3, 4]]
Output: 3
Explanation:


Constraints:
1 ≤ V ≤ 10^4

Expected Complexities
Company Tags
AmazonMicrosoftGoogle
Topic Tags
Related Interview Experiences
Related Articles
Connected Components In An Undirected Graph
*/
public class GFGNumberOfConnectedComponentsDSU {
    /*
    class Solution {
    int find(int x, int[] parent){
        if(parent[x]==x) return x;
        return parent[x] = find(parent[x], parent);
    }
    void union(int a, int b, int[] parent, int[] size){
        int la = find(a,parent);
        int lb = find(b,parent);
        if(la!=lb){
            if(size[a]>size[b]){// a will become the parent
                parent[lb] = la;
                size[la] += size[lb];
            }
            else{
                parent[la] = lb;
                size[lb] += size[la];
            }
        }
    }
    int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
        // code here
        int n =  edges.size();
        int[] parent =  new int[V];
        int[] size =  new int[V];
        for(int i=0; i<V; i++){
            parent[i] = i;
            size[i] = 1;
        }
        for(int i=0; i<n; i++){
            int x = edges.get(i).get(0);
            int y = edges.get(i).get(1);
            union(x,y,parent,size);
        }

        int count = 0;
        for(int i=0; i<V; i++){
            if(parent[i]==i) count++;
        }
        return count;
    }
}
     */
}
