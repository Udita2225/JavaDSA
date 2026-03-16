package Backtracking;

public class FourDirectionMazePath {
    public static void print4Maze(int sr, int sc, int er, int ec, String str,boolean[][] isVisited){
        if(sr<0 || sr>er ||sc<0 || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(str);
            return;
        }
        if(isVisited[sr][sc]==true){
            return;
        }
        isVisited[sr][sc] = true;
        //rightWays
        print4Maze(sr,sc+1,er,ec,str+"R",isVisited);
        //leftWays
        print4Maze(sr,sc-1,er,ec,str+"L",isVisited);
        //downWays
        print4Maze(sr+1,sc,er,ec,str+"D",isVisited);
        //upWays
        print4Maze(sr-1,sc,er,ec,str+"U",isVisited);

        // Backtracking
        isVisited[sr][sc] = false;
    }
    static void main() {
       int rows = 3;
       int cols = 3;
       boolean[][] isVisited = new boolean[rows][cols];// By default -> false
//        System.out.println(isVisited[2][2]);
       print4Maze(0,0,rows-1,cols-1,"",isVisited);

    }
}
