package Backtracking;

public class RatInADeadMaze_AllDirections {
    public static void printMaze(int sr,int sc, int er, int ec, int[][] maze, boolean[][] isVisited, String str){
        if(sr>er || sc>ec || sr<0 || sc<0) return;
        if(maze[sr][sc]==0) return;
        if(sr==er && sc==ec){
            System.out.println(str);
            return;
        }
        if(isVisited[sr][sc]==true) return;
        isVisited[sr][sc] = true;
        //Right
        printMaze(sr,sc+1,er,ec,maze,isVisited,str+"R");
        //Left
        printMaze(sr,sc-1,er,ec,maze,isVisited,str+"L");
        //Down
        printMaze(sr+1,sc,er,ec,maze,isVisited,str+"D");
        //Up
        printMaze(sr-1,sc,er,ec,maze,isVisited,str+"U");
        // Backtracking
        isVisited[sr][sc] = false;
    }
    static void main() {
        int rows =  3;
        int cols = 4;
        int[][] maze = {
                {1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}
        };
        boolean[][] isVisited = new boolean[rows][cols]; // T.C O(m*n)
        printMaze(0,0,rows-1,cols-1,maze,isVisited,"");
    }
}
