package Backtracking;

/*
37. Sudoku Solver
Hard
Topics
premium lock icon
Companies
Hint
Write a program to solve a Sudoku puzzle by filling the empty cells.

A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.



Example 1:


Input: board = [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
Output: [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
Explanation: The input board is shown above and the only valid solution is shown below:




Constraints:

board.length == 9
board[i].length == 9
board[i][j] is a digit or '.'.
It is guaranteed that the input board has only one solution.


*/
public class LeetCode37SudokuSolver {
    /*
    // Optimized Code Without using extra helper Grid
class Solution {
    static int check = 0;
    public boolean isValid(int row, int col, char[][] board, char num){
        // Check Row
        for(int j=0; j<9; j++){
            if(board[row][j]==num) return false;
        }
        // Check Column
        for(int i=0; i<9; i++){
            if(board[i][col]==num) return false;
        }
        // Check 3*3 Grid
        int sRow = row/3*3;
        int sCol = col/3*3;
        for(int i=sRow; i<sRow+3; i++){
            for(int j=sCol; j<sCol+3; j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
    public void solve(int row, int col, char[][] board){
        if(row==9){
            check = 1;
            return;
        }
        else if(board[row][col]!='.'){
            if(col!=8) solve(row,col+1,board);
            else solve(row+1,0,board);
        }
        else{ //board[row][col]=='.'
            for(int i=1; i<=9; i++){
            char ch = (char)(i + '0');
            if(isValid(row,col,board,ch)){
                board[row][col] = ch;
                if(col!=8) solve(row, col+1, board);
                else solve(row+1,0,board);
                if(check==1) return;
                board[row][col] = '.';
                }
            }
        }
    }
    public void solveSudoku(char[][] board) {
    check = 0;
    solve(0,0,board);
    }
}
/* By Using Extra Helper Grid
class Solution {
    public boolean isValid(int row, int col, char[][] board, char num){
        // Check rows;
        for(int j=0; j<9; j++){
            if(board[row][j]==num) return false;
        }

        // Check cols
        for(int i=0; i<9; i++){
            if(board[i][col]==num) return false;
        }

        // Check 3*3 sub-boxes
        int sRow = row/3*3;
        int sCol = col/3*3;
        for(int i=sRow; i<sRow+3; i++){
            for(int j=sCol; j<sCol+3; j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
    public void fillSudoku(int row, int col, char[][] board, char[][] helper){
        if(row==9){
          for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                board[i][j] = helper[i][j];
            }
          }
          return;
        }
        if(helper[row][col]=='.'){
            for(int i=1; i<=9; i++){
                char ch = (char)(i + '0');
                if(isValid(row,col,helper,ch)){
                    helper[row][col] = ch;
                    if(col!=8) fillSudoku(row,col+1,board,helper);
                    else fillSudoku(row+1,0,board,helper);
                    helper[row][col] = '.';//backtracking
                }
            }
        }
        else{
            if(col!=8) fillSudoku(row,col+1,board,helper);
            else fillSudoku(row+1,0,board,helper);
        }
    }
    public void solveSudoku(char[][] board) {
        char[][] helper = new char[9][9];
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                helper[i][j] = board[i][j];
            }
          }
    fillSudoku(0,0,board,helper);
    }
}
*/

}
