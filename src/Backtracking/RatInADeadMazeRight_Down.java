package Backtracking;
/*
A maze is an N*N binary matrix of blocks where the upper left block is known as the Source block, and the lower rightmost
block is known as the Destination block. If we consider the maze, then maze[0][0] is the source, and maze[N-1][N-1] is the
destination. Our main task is to reach the destination from the source. We have considered a rat as a character that can move
either forward or downwards.
In the maze matrix, a few dead blocks will be denoted by 0 and active blocks will be denoted by 1 . A rat can move only in
active blocks.
*/
// Rightward & Downward
public class RatInADeadMazeRight_Down {
    public static void printMaze(int sr, int sc, int er, int ec, int[][] maze,String str){
    if(sr>er || sc>ec || sr<0 || sc<0) return;
    if(maze[sr][sc]==0) return;
    if(sr==er && sc==ec){
        System.out.println(str);
        return;
    }
    //Rightwards
    printMaze(sr,sc+1,er,ec,maze,str+"R");
    //Downwards
    printMaze(sr+1,sc,er,ec,maze,str+"D");
    }
    static void main() {
    int rows = 4;
    int cols = 6;
    int[][] maze = {
            {1,0,1,1,1,1},
            {1,1,1,1,0,1},
            {0,1,1,1,1,1},
            {0,0,1,0,1,1}
    };
    printMaze(0,0,rows-1,cols-1,maze,"");
    }
}
