package Graphs;

public class LeetCode207CourseScheduleDFS {
    /*
    class Solution {
    public boolean dfs(int i, boolean[] isVisited, boolean[] inPath, List<List<Integer>> adj){
        isVisited[i] = true;
        inPath[i] = true;
        for(int ele: adj.get(i)){
            if(!isVisited[ele]){
            if(dfs(ele,isVisited,inPath,adj)) return true;
            }
            else if(inPath[ele]) return true; // Cycle present
        }
        inPath[i] = false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    List<List<Integer>> adj =  new ArrayList<>();
    for(int i=0; i<numCourses; i++){
        adj.add(new ArrayList<>());
    }
    for(int[] arr: prerequisites){
        int x = arr[0];
        int y = arr[1];
        if(x==y) return false;
        adj.get(y).add(x);
    }

    boolean[] isVisited =  new boolean[numCourses];
    boolean[] inPath =  new boolean[numCourses];
    for(int i=0; i<numCourses; i++){
    if(!isVisited[i])
    if(dfs(i, isVisited, inPath, adj)) return false;
    }
    return true;
    }
}
     */
}
