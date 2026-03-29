package Graphs;
/*
200. Number of Islands
Medium
Topics
premium lock icon
Companies
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume
all four edges of the grid are all surrounded by water.



Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3


Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.
*/
public class LeetCode200NumberOfIslandsBFS {
    /*Sir's Code
    class Solution {
    public class Pair{
        int row;
        int col;
        public Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public void bfs(int i, int j, char[][] grid, boolean[][] isVisited){
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        isVisited[i][j] =  true;
        while(!q.isEmpty()){
            Pair p = q.remove();
            int row = p.row;
            int col = p.col;
            // Top
            if(row>0){
                if(grid[row-1][col]=='1' && isVisited[row-1][col]==false){
                    q.add(new Pair(row-1,col));
                    isVisited[row-1][col] = true;
                }
            }
            //Bottom
            if(row<m-1){
                if(grid[row+1][col]=='1' && isVisited[row+1][col]==false){
                    q.add(new Pair(row+1,col));
                    isVisited[row+1][col] = true;
                }
            }
            //Left
            if(col>0){
                if(grid[row][col-1]=='1' && isVisited[row][col-1]==false){
                    q.add(new Pair(row,col-1));
                    isVisited[row][col-1] = true;
                }
            }
            //Right
            if(col<n-1){
                if(grid[row][col+1]=='1' && isVisited[row][col+1]==false){
                    q.add(new Pair(row,col+1));
                    isVisited[row][col+1] = true;
                }
            }

        }
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] isVisited =  new boolean[m][n];
        int islands = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1' && isVisited[i][j]==false){
                    bfs(i,j,grid,isVisited);
                    islands++;
                }
            }
        }
        return islands;
    }
}




// This is my code .. It is accepted but prefer Sir's Code for variable names
class Solution {
    public class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public void bfs(int x, int y, char[][] grid, boolean[][] isVisited){
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x,y));
        isVisited[x][y] = true;
        while(!q.isEmpty()){
            Pair p =  q.remove();
            int Xaxis = p.x;
            int Yaxis = p.y;
            // Up
            if(Xaxis-1>=0 && grid[Xaxis-1][Yaxis] != '0' && isVisited[Xaxis-1][Yaxis]==false){
                q.add(new Pair(Xaxis-1,Yaxis));
                isVisited[Xaxis-1][Yaxis] = true;
            }
            // Down
            if(Xaxis+1<=m-1 && grid[Xaxis+1][Yaxis] != '0' && isVisited[Xaxis+1][Yaxis]==false){
                q.add(new Pair(Xaxis+1,Yaxis));
                isVisited[Xaxis+1][Yaxis] = true;
            }

            // Right
            if(Yaxis+1 <= n-1 && grid[Xaxis][Yaxis+1] != '0' && isVisited[Xaxis][Yaxis+1]==false){
                q.add(new Pair(Xaxis,Yaxis+1));
                isVisited[Xaxis][Yaxis+1] = true;
            }

            // Left
            if(Yaxis-1>=0 && grid[Xaxis][Yaxis-1] != '0' && isVisited[Xaxis][Yaxis-1]==false){
                q.add(new Pair(Xaxis,Yaxis-1));
                isVisited[Xaxis][Yaxis-1] = true;
            }

        }

    }
    public int numIslands(char[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    boolean[][] isVisited = new boolean[m][n];
    int islands = 0;
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(grid[i][j]=='1' && isVisited[i][j]==false){
                bfs(i,j,grid, isVisited);
                islands++;
            }
        }
    }
    return islands;
    }
}
     */
}
