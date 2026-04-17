package Graphs;

public class LeetCode210CourseSchedule2DFS {
    /*
    class Solution {
    public boolean dfs(int i, boolean[] isVisited, boolean[] inPath, List<List<Integer>> adj, List<Integer> list){
        isVisited[i] = true;
        inPath[i] = true;
        for(int ele: adj.get(i)){
            if(!isVisited[ele]){
                if(dfs(ele,isVisited,inPath,adj,list)) return true;
            }
            else if(inPath[ele]) return true;
        }
        inPath[i] = false;
        list.add(i);
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    List<List<Integer>> adj =  new ArrayList<>();
    for(int i=0; i<numCourses; i++){
        adj.add(new ArrayList<>());
    }
    int n = prerequisites.length;
    for(int[] arr: prerequisites){
        int x = arr[0];
        int y = arr[1];
        adj.get(y).add(x);
    }
    List<Integer> list = new ArrayList<>();
    boolean[] isVisited  = new boolean[numCourses];
    boolean[] inPath =  new boolean[numCourses];
    for(int i=0; i<numCourses; i++){
        if(!isVisited[i]) if(dfs(i,isVisited,inPath,adj,list)) return new int[0];
    }
    Collections.reverse(list);
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;

    }
}
     */
}
