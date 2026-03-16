package Backtracking;
//Without using extra Array
public class RatInADeadMaze_AllDirections_Optimized {
    public static void printMaze(int sr, int sc, int er, int ec, int[][] maze, String str){
        if(sr>er || sc>ec || sr<0 || sc<0) return;
        if(maze[sr][sc]==0) return; //Blocked Path
        if(sr==er && sc==ec){
            System.out.println(str);
            return;
        }
        if(maze[sr][sc]==-1) return;// Already Visited
        //Check
        maze[sr][sc] = -1;
        //Right
        printMaze(sr,sc+1,er,ec,maze,str+"R");
        //Left
        printMaze(sr,sc-1,er,ec,maze,str+"L");
        //Down
        printMaze(sr+1,sc,er,ec,maze,str+"D");
        //Up
        printMaze(sr-1,sc,er,ec,maze,str+"U");
        maze[sr][sc] = 1;
    }
    static void main() {
        int rows =  3;
        int cols = 4;
        int[][] maze = {
                {1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}
        };
        printMaze(0,0,rows-1,cols-1,maze,"");
    }
}
