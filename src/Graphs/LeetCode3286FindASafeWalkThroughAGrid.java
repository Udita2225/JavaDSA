package Graphs;
/*
3286. Find a Safe Walk Through a Grid
Medium
Topics
premium lock icon
Companies
Hint
You are given an m x n binary matrix grid and an integer health.

You start on the upper-left corner (0, 0) and would like to get to the lower-right corner (m - 1, n - 1).

You can move up, down, left, or right from one cell to another adjacent cell as long as your health remains positive.

Cells (i, j) with grid[i][j] = 1 are considered unsafe and reduce your health by 1.

Return true if you can reach the final cell with a health value of 1 or more, and false otherwise.



Example 1:

Input: grid = [[0,1,0,0,0],[0,1,0,1,0],[0,0,0,1,0]], health = 1

Output: true

Explanation:

The final cell can be reached safely by walking along the gray cells below.


Example 2:

Input: grid = [[0,1,1,0,0,0],[1,0,1,0,0,0],[0,1,1,1,0,1],[0,0,1,0,1,0]], health = 3

Output: false

Explanation:

A minimum of 4 health points is needed to reach the final cell safely.


Example 3:

Input: grid = [[1,1,1],[1,0,1],[1,1,1]], health = 5

Output: true

Explanation:

The final cell can be reached safely by walking along the gray cells below.



Any path that does not go through the cell (1, 1) is unsafe since your health will drop to 0 when reaching the final cell.



Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 50
2 <= m * n
1 <= health <= m + n
grid[i][j] is either 0 or 1.


*/
public class LeetCode3286FindASafeWalkThroughAGrid {
    /*
    class Solution {
    class Triplet implements Comparable<Triplet>{
        int row;
        int col;
        int cost;
        public Triplet(int row, int col, int cost){
            this.row = row;
            this.col = col;
            this.cost =  cost;
        }
        public int compareTo(Triplet t){
            return this.cost - t.cost;
        }

    }
    public boolean findSafeWalk(List<List<Integer>> list, int health) {
    int m = list.size();
    int n = list.get(0).size();
    int[][] grid =  new int[m][n];
    int[][] helper =  new int[m][n];
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            grid[i][j] = list.get(i).get(j);
            helper[i][j] =  Integer.MAX_VALUE;
        }
    }
    helper[0][0] =  grid[0][0];
    PriorityQueue<Triplet> pq =  new PriorityQueue<>();
    pq.add(new Triplet(0,0,grid[0][0]));

    while(pq.size()>0){
        Triplet t = pq.remove();
        int row = t.row;
        int col = t.col;
        int cost = t.cost;

        if(helper[row][col]<=cost){
            // Up
            if(row>0){
                int newCost = cost + grid[row-1][col];
                if(helper[row-1][col]>newCost){
                    helper[row-1][col] = newCost;
                    pq.add(new Triplet(row-1,col,newCost));
                }
            }
            // Down
             if(row<m-1){
                int newCost = cost + grid[row+1][col];
                if(helper[row+1][col]>newCost){
                    helper[row+1][col] = newCost;
                    pq.add(new Triplet(row+1,col,newCost));
                }
            }
            // Left
             if(col>0){
                int newCost = cost + grid[row][col-1];
                if(helper[row][col-1]>newCost){
                    helper[row][col-1] = newCost;
                    pq.add(new Triplet(row,col-1,newCost));
                }
            }
            // Right
             if(col<n-1){
                int newCost = cost + grid[row][col+1];
                if(helper[row][col+1]>newCost){
                    helper[row][col+1] = newCost;
                    pq.add(new Triplet(row,col+1,newCost));
                }
            }
        }

    }
    System.out.println(helper[m-1][n-1]);
    return health - helper[m-1][n-1]<=0 ? false : true;
    }
}
     */
}
