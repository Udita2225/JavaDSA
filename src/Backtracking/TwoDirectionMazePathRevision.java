package Backtracking;

public class TwoDirectionMazePathRevision {
    private static int maze(int sr, int sc, int er, int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && ec==ec) return 1;
        int downWays = maze(sr+1,sc,er,ec);
        int rightWays = maze(sr,sc+1,er,ec);
        int totalWays = downWays + rightWays;
        return totalWays;
    }
    static void main() {
        int rows = 3;
        int cols = 3;
        int count = maze(1,1,rows, cols);
        System.out.println(count);
    }
}
