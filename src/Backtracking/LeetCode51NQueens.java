package Backtracking;
/*
51. N-Queens
Hard

The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

Example 1:

Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
Example 2:

Input: n = 1
Output: [["Q"]]

Constraints:
1 <= n <= 9
*/
public class LeetCode51NQueens {
    /*
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
    public List<List<String>> solveNQueens(int n) {
    char[][] board =  new char[n][n];
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            board[i][j] = '.';
        }
    }
    List<List<String>> ans = new ArrayList<>();
    NQueens(board,0,ans);
    return ans;
    }
}
     */
}
