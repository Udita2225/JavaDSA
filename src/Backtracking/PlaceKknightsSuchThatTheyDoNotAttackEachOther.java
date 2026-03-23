package Backtracking;

import java.util.Scanner;

/*
Place K-knights such that they do not attack each other in C++

In this problem, we are given three integer value K, N, M. our task is to place K knights in an NxM chessboard such that
no two knights attack each other. There can be cases with 0 valid ways and also cases with multiple valid ways. You need to print all valid cases.

Knight is a chess piece that moves two moves ahead and then one move to the left of right. It can move in any direction in the chessboard.

Attack is the position when one piece can be in the same place as other pieces in one chance of its valid moves.

Let’s take an example to understand the problem,

Input − M = 3, N = 3, K = 5

Output −

K A K
A K A
K A K

A K A
K K K
A K A
*/
public class PlaceKknightsSuchThatTheyDoNotAttackEachOther {
    // Print Function
    public static void printGrid(char[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // isSafe Function
    public static boolean isSafe(int row, int col, char[][] grid){
        int m =  grid.length;
        int n =  grid[0].length;
        int i, j;
        // Check Up-Right
        i = row-2;
        j = col+1;
        if(i>=0 && j<n){
            if(grid[i][j]=='K') return false;
        }

        // Check Up-Left
        i = row-2;
        j = col-1;
        if(i>=0 && j>=0){
            if(grid[i][j]=='K') return false;
        }

        // Check Down-Right
        i = row+2;
        j = col+1;
        if(i<m && j<n){
            if(grid[i][j]=='K') return false;
        }

        // Check Down-Left
        i = row+2;
        j = col-1;
        if(i<m && j>=0){
            if(grid[i][j]=='K') return false;
        }

        // Check Right-Up
        i = row-1;
        j = col+2;
        if(i>=0 && j<n){
            if(grid[i][j]=='K') return false;
        }

        // Check Right-Down
        i = row+1;
        j = col+2;
        if(i<m && j<n){
            if(grid[i][j]=='K') return false;
        }

        // Check Left-Up
        i = row-1;
        j = col-2;
        if(i>=0 && j>=0){
            if(grid[i][j]=='K') return false;
        }

        // Check Left-Down
        i = row+1;
        j = col-2;
        if(i<m && j<n){
            if(grid[i][j]=='K') return false;
        }
        return true;
    }
    public static void printKKnights(int row, int col, char[][] grid, int k){
        int m = grid.length;
        int n = grid[0].length;
        if(k==0){
            printGrid(grid);
            return;
        }
        if(row>=m || col>=n) return;
        for(int i=row; i<m; i++) {
            for(int j=col; j<n; j++){
            if (isSafe(i, j, grid)) {
                grid[i][j] = 'K';
                printKKnights(i, j, grid, k--);
                grid[i][j] = 'X';
                }
            }
        }
        return;
    }

    public static void KKnights(int M, int N, int K){
    char[][] grid = new char[M][N];
    if(K==(M*N)){
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                grid[i][j] = 'K';
            }
        }
        printGrid(grid);
        return;
    }
    for(int i=0; i<M; i++){
        for(int j=0; j<N; j++){
            grid[i][j] = 'X';
        }
    }
    printKKnights(0,0,grid,K);

    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M: ");
        int M = sc.nextInt();
        System.out.println();
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        System.out.println();
        System.out.print("Enter K: ");
        int K = sc.nextInt();
        System.out.println();
        KKnights(M, N, K);
    }
}
