package Backtracking;

public class LeetCode51NQueensPractice {
    public static boolean isSafe(char[][] board, int row, int col){
        int n =  board.length;
        // Check rows -> West & East Direction
        for(int j=0; j<n; j++){
            if(board[row][j]=='Q') return false;
        }
        // Check cols -> North & South Direction
        for(int i=0; i<n; i++){
            if(board[i][col]=='Q') return false;
        }
        //Check North-East direction
        int i=row;
        int j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }

        //Check North-West Direction
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }

        //Check South-East Direction
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }

        //Check South-West Direction
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        return true;
    }
    public static void NQueens(char[][] board, int row){
    int n =  board.length;
    if(row==n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return;
    }
    for(int j=0; j<n; j++){
        if(isSafe(board,row,j)){
            board[row][j] = 'Q';
            NQueens(board,row+1);
            board[row][j] = 'X';
        }
    }
    return;
    }
    static void main() {
    int n = 4;
    char[][] board = new char[n][n];
    // Initial Configuration of Board
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            board[i][j] = 'X';
        }
    }
    NQueens(board,0);
    }
}
