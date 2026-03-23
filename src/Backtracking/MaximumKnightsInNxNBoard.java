package Backtracking;

public class MaximumKnightsInNxNBoard {
    static int maxKnights = -1;
    public static void printBoard(char[][] board){
        int row = board.length;
        int col = board[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean isSafe(int row, int col, char[][] grid){
        int n =  grid.length;
    // Check 2Up-1Right
        int i = row-2;
        int j = col+1;
        if(i>=0 && j<n && grid[i][j]=='K') return false;

//      Check 2Up-1Left
        i = row-2;
        j = col-1;
        if(i>=0 && j>=0){
            if(grid[i][j]=='K') return false;
        }

//      Check 2Down-1Right
        i = row+2;
        j = col+1;
        if(i<n && j<n && grid[i][j]=='K') return false;

//      Check 2Down-1Left
        i = row+2;
        j = col-1;
        if(i<n && j>=0 && grid[i][j]=='K') return false;

//      Check 2Right-1Up
        i = row-1;
        j = col+2;
        if(i>=0 && j<n && grid[i][j]=='K') return false;

//      Check 2Right-1Down
        i = row+1;
        j = col+2;
        if(i<n && j<n && grid[i][j]=='K') return false;

//      Check 2Left-1Up
        i = row-1;
        j = col-2;
        if(i>=0 && j>=0 && grid[i][j]=='K') return false;

//      Check 2Left-1Down
        i = row+1;
        j = col-2;
        if(i<n && j>=0 && grid[i][j]=='K') return false;

        return true;
    }
    public static void nKnights(int row, int col, char[][] board, int count){
        int n = board.length;
        if(row==n){
            maxKnights = Math.max(count, maxKnights);
            printBoard(board);
            return;
        }
        else if(isSafe(row,col,board)){
            board[row][col] = 'K';
            if(col!=n-1) nKnights(row,col+1,board,count+1);
            else nKnights(row+1,0,board,count+1);
            board[row][col] = 'X';
        }
            if(col!=n-1) nKnights(row,col+1,board,count);
            else nKnights(row+1,0,board,count);
    }

    static void main() {
    int n = 2;
    char[][] board = new char[n][n];
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            board[i][j] = 'X';
        }
    }
    nKnights(0,0,board,0);
    System.out.println(maxKnights);
    }
}
