package Backtracking;
/*
52. N-Queens II
Solved
Hard

The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return the number of distinct solutions to the n-queens puzzle.



Example 1:


Input: n = 4
Output: 2
Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
Example 2:

Input: n = 1
Output: 1


Constraints:

1 <= n <= 9
*/
public class LeetCode52NQueen2 {
    /*

    class Solution {
    public boolean isSafe(int row, int col, char[][] board){
        int n =  board.length;
        // Check rows;
        for(int j=0; j<n; j++){
            if(board[row][j]=='Q') return false;
        }
        //Check Column
        for(int i=0; i<n; i++){
            if(board[i][col]=='Q') return false;
        }

        //Check North East
        int i = row;
        int j = col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }

        //Check North West
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }

        //Check South East
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }

        //Check South West
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        return true;
    }

    public void NQueens(int row, char[][] board, int[] ans){
        int n = board.length;
        if(row==n){
            ans[0]++;
            return;
        }
        for(int j=0; j<n; j++){
            if(isSafe(row,j,board)){
                board[row][j] = 'Q';
                NQueens(row+1,board,ans);
                board[row][j] = 'X';
            }
        }
        return;
    }
    public int totalNQueens(int n) {
    char[][] board = new char[n][n];
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            board[i][j] = 'X';
        }
    }
    int[] ans = new int[1];
    NQueens(0,board,ans);
    return ans[0];
    }
}

class Solution {
    public boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        // Check rows
        for(int j=0; j<n; j++){
            if(board[row][j]=='Q') return false;
        }
        //Check columns
        for(int i=0; i<n; i++){
            if(board[i][col]=='Q') return false;
        }
        //Check North-East
        int i=row;
        int j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }

        //Check North-West
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }

        //Check South-East
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }

        //Check South-West
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        return true;
    }
    public void NQueens(char[][] board, int row, List<List<String>> ans){
        int n =  board.length;
        if(row==n){
            List<String> arr = new ArrayList<>();
            for(int i=0; i<n; i++){
                StringBuilder str = new StringBuilder();
                for(int j=0; j<n; j++){
                    str.append(board[i][j]);
                }
                arr.add(str.toString());
            }
            ans.add(arr);
            return;
        }
        for(int j=0; j<n; j++){
            if(isSafe(board,row,j)){
            board[row][j] = 'Q';
            NQueens(board,row+1,ans);
            board[row][j] = '.'; //Backtracking
            }
        }
        return;
    }
    public int totalNQueens(int n) {
    char[][] board =  new char[n][n];
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            board[i][j] = '.';
        }
    }
    List<List<String>> ans = new ArrayList<>();
    NQueens(board,0,ans);
    return ans.size();
    }
}
     */
}
