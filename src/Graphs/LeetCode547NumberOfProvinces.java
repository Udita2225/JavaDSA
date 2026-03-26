package Graphs;
/*
547. Number of Provinces
Medium
Topics
premium lock icon
Companies
There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.

Return the total number of provinces.



Example 1:


Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
Output: 2
Example 2:


Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3


Constraints:

1 <= n <= 200
n == isConnected.length
n == isConnected[i].length
isConnected[i][j] is 1 or 0.
isConnected[i][i] == 1
isConnected[i][j] == isConnected[j][i]
*/
public class LeetCode547NumberOfProvinces {
    /*
    // TC-> O(n^2) SC->O(n)
class Solution {
    public void bfs(int[][] adj, boolean[] isVisited,int i){
        int n = adj.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        isVisited[i] = true;
        while(!q.isEmpty()){
            int idx = q.remove();
            for(int j=0; j<n; j++){
                int child = adj[idx][j];
                if(child!=0 && isVisited[j]==false){
                    isVisited[j] = true;
                    q.add(j);
                }
            }
        }
    }
    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        boolean[] isVisited = new boolean[n];// by-default -> false
        int count = 0;
        for(int i=0; i<n; i++){
            if(!isVisited[i]) {
                bfs(adj,isVisited,i);
                count++;
            }
        }
        return count;
    }
}
/*
Not a very good code, it can give Time Limit Exceeded  if the test case is Large
class Solution {
    public void BFS(int[][] isConnected, List<Integer> arr, boolean[] isVisited, int idx){
        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        isVisited[idx] = true;
        while(q.size()!=0){
            int j = q.remove();
            arr.add(j);
            for(int i=0; i<isConnected[0].length; i++){
                if(isConnected[j][i]!=0 && isVisited[i]==false) {
                    isVisited[i] = true;
                    q.add(i);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
    int n = isConnected.length;
    HashSet<List<Integer>> set = new HashSet<>();
    for(int i=0; i<n; i++){
        boolean[] isVisited = new boolean[n];
        List<Integer> arr = new ArrayList<>();
        BFS(isConnected,arr,isVisited,i);
        Collections.sort(arr);
        set.add(arr);
    }
    return set.size();
    }
}
*/

}
