package Backtracking;

public class TwoDirectionPrintMazePath {
    public static void PrintMaze(int sr, int sc, int er, int ec, String str){
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(str);
            return;
        }
        // downWays
        PrintMaze(sr+1,sc,er,ec,str+"D");
        // rightWays
        PrintMaze(sr,sc+1,er,ec,str+"R");
    }
    static void main() {
    int rows = 2;
    int cols = 2;
    PrintMaze(1,1,rows,cols, "");
    }
}
