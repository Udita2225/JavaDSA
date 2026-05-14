package Graphs;
/*
1631. Path With Minimum Effort
You are a hiker preparing for an upcoming hike. You are given heights, a 2D array of size rows x columns, where
heights[row][col] represents the height of cell (row, col). You are situated in the top-left cell, (0, 0), and you hope to travel to the bottom-right cell, (rows-1, columns-1) (i.e., 0-indexed). You can move up, down, left, or right, and you wish to find a route that requires the minimum effort.
A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.
Return the minimum effort required to travel from the top-left cell to the bottom-right cell.

Example 1:

Input: heights = [[1,2,2],[3,8,2],[5,3,5]]
Output: 2
Explanation: The route of [1,3,5,3,5] has a maximum absolute difference of 2 in consecutive cells.
This is better than the route of [1,2,2,2,5], where the maximum absolute difference is 3.
Example 2:

Input: heights = [[1,2,3],[3,8,4],[5,3,5]]
Output: 1
Explanation: The route of [1,2,3,4,5] has a maximum absolute difference of 1 in consecutive cells, which is better than route [1,3,5,3,5].
Example 3:

Input: heights = [[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]
Output: 0
Explanation: This route does not require any effort.

Constraints:

rows == heights.length
columns == heights[i].length
1 <= rows, columns <= 100
1 <= heights[i][j] <= 106
 */
public class LeetCode1631PathWithMinimumEffort {
    /*
    class Solution {
    public class Triplet implements Comparable<Triplet>{
        int row;
        int col;
        int effort;
        public Triplet(int row, int col, int effort){
            this.row = row;
            this.col = col;
            this.effort = effort;
        }
        public int compareTo(Triplet t){
            return this.effort-t.effort;
        }
    }
    public int minimumEffortPath(int[][] heights) {
      int m = heights.length;
    int n = heights[0].length;
    int[][] grid =  new int[m][n];
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            grid[i][j] =  Integer.MAX_VALUE;
        }
    }
    grid[0][0] = 0;
    // Instead of checking the conditions separately, we can use a row and col array in order to make the code efficient
    int[] r = {-1,1,0,0};
    int[] c = {0,0,-1,1};
    PriorityQueue<Triplet> pq = new PriorityQueue<>();
    pq.add(new Triplet(0,0,0));
    while(pq.size()>0){
        Triplet top =  pq.remove();
        int row =  top.row;
        int col =  top.col;
        if(row==m-1 && col==n-1) break;
        int effort =  top.effort;
        for(int i=0;i<4; i++){
            int newRow =  row + r[i];
            int newCol =  col + c[i];
            if(newRow<0 || newRow >= m || newCol<0 || newCol>n-1) continue;
            int diff = Math.abs(heights[row][col] - heights[newRow][newCol]);
            int max =  Math.max(diff,effort);
            if(grid[newRow][newCol]>max){
                pq.add(new Triplet(newRow, newCol, max));
                grid[newRow][newCol] =  max;
            }
        }
    }
    return grid[m-1][n-1];
    }
}
     */
    /*
    class Solution {
    public class Triplet implements Comparable<Triplet>{
        int row;
        int col;
        int effort;
        public Triplet(int row, int col, int effort){
            this.row = row;
            this.col = col;
            this.effort = effort;
        }
        public int compareTo(Triplet t){
            return this.effort-t.effort;
        }
    }
    public int minimumEffortPath(int[][] heights) {
    int m = heights.length;
    int n = heights[0].length;
    int[][] grid =  new int[m][n];
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            grid[i][j] =  Integer.MAX_VALUE;
        }
    }
    grid[0][0] = 0;
    PriorityQueue<Triplet> pq = new PriorityQueue<>();
    pq.add(new Triplet(0,0,0));
    while(pq.size()>0){
        Triplet top =  pq.remove();
        int row =  top.row;
        int col =  top.col;
        if(row==m-1 && col==n-1) break;
        int effort =  top.effort;
        if(grid[row][col]<=effort){
            if(row>0){
                int diff =  Math.abs(heights[row][col] - heights[row-1][col]);
                int max =  Math.max(diff,effort);
                if(max<grid[row-1][col]){
                    pq.add(new Triplet(row-1, col,max));
                    grid[row-1][col] = max;
                }
            }
            if(row<m-1){
                int diff =  Math.abs(heights[row][col] - heights[row+1][col]);
                int max =  Math.max(diff,effort);
                if(max<grid[row+1][col]){
                    pq.add(new Triplet(row+1, col,max));
                    grid[row+1][col] = max;
                }
            }
            if(col>0){
                int diff =  Math.abs(heights[row][col] - heights[row][col-1]);
                int max =  Math.max(diff, effort);
                if(max<grid[row][col-1]){
                    pq.add(new Triplet(row, col-1,max));
                    grid[row][col-1] = max;
                }
            }
            if(col<n-1){
                int diff =  Math.abs(heights[row][col] - heights[row][col+1]);
                int max = Math.max(diff,effort);
                if(max<grid[row][col+1]){
                    pq.add(new Triplet(row, col+1,max));
                    grid[row][col+1] = max;
                }
            }
        }
    }
    return grid[m-1][n-1];
    }
}
    */
}
