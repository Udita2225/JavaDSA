package Graphs;

public class LeetCode841KeysAndRoomsDFS {
    /*
    class Solution {
    public void dfs(int i,List<List<Integer>> rooms, boolean[] isVisited){
        isVisited[i] = true;
        List<Integer> arr = rooms.get(i);
        for(int j=0; j<arr.size(); j++){
            if(!isVisited[arr.get(j)]) dfs(arr.get(j),rooms,isVisited);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    int n = rooms.size();
    boolean[] isVisited =  new boolean[n];
    dfs(0,rooms,isVisited);
    for(int i=0; i<n; i++){
        if(!isVisited[i]) return false;
    }
    return true;
    }
}
    */
}
