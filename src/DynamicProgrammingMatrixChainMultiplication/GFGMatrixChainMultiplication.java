package DynamicProgrammingMatrixChainMultiplication;

/*

Matrix Chain Multiplication
Difficulty: HardAccuracy: 49.64%Submissions: 186K+Points: 8
Given an array arr[] which represents the dimensions of a sequence of matrices where the ith matrix has the dimensions (arr[i-1] x arr[i]) for i>=1, find the most efficient way to multiply these matrices together. The efficient way is the one that involves the least number of multiplications.

Examples:

Input: arr[] = [2, 1, 3, 4]
Output: 20
Explanation: There are 3 matrices of dimensions 2 × 1, 1 × 3, and 3 × 4, Let this 3 input matrices be M1, M2, and M3. There are two ways to multiply: ((M1 x M2) x M3) and (M1 x (M2 x M3)), note that the result of (M1 x M2) is a 2 x 3 matrix and result of (M2 x M3) is a 1 x 4 matrix.
((M1 x M2) x M3)  requires (2 x 1 x 3) + (2 x 3 x 4) = 30
(M1 x (M2 x M3))  requires (1 x 3 x 4) + (2 x 1 x 4) = 20.
The minimum of these two is 20.
Input: arr[] = [1, 2, 3, 4, 3]
Output: 30
Explanation: There are 4 matrices of dimensions 1 × 2, 2 × 3, 3 × 4, 4 × 3. Let this 4 input matrices be M1, M2, M3 and M4. The minimum number of multiplications are obtained by ((M1 x M2) x M3) x M4). The minimum number is (1 x 2 x 3) + (1 x 3 x 4) + (1 x 4 x 3) = 30.
Input: arr[] = [3, 4]
Output: 0
Explanation: As there is only one matrix so, there is no cost of multiplication.
Constraints:
2 ≤ arr.size() ≤ 100
1 ≤ arr[i] ≤ 200

Expected Complexities
Time Complexity: O(n^3)
Auxiliary Space: O(n^2)
Company Tags
Flipkart Microsoft FactSet
Topic Tags
Dynamic ProgrammingMatrixData StructuresAlgorithms
Related Interview Experiences
Microsoft Interview Experience Set 128 Campus Internship
Related Articles
Matrix Chain Multiplication Dp 8
*/
public class GFGMatrixChainMultiplication {
    /*
    class Solution {
    static int matrixMultiplication(int arr[]) {
        // code here
        int n = arr.length-1;
        int[][] dp = new int[n][n];
        for(int i=0; i<n-1; i++){
            int m = 0;
            int j=i+1;
            while(j<n){
                int min = Integer.MAX_VALUE;
                for(int k=m; k<j; k++){
                    int x = arr[m] * arr[k+1] * arr[j+1];
                    int tc = dp[m][k] + dp[k+1][j] + x;
                    min =  Math.min(min,tc);
                }
                dp[m++][j++] = min;
            }
        }
        return dp[0][n-1];
    }
}
    */

    /*
    class Solution {
    static int mcm(int i, int j, int[] arr, int[][] dp){
        if(i==j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int minCost =  Integer.MAX_VALUE;
        for(int k=i; k<j; k++){
            int x = arr[i] * arr[k+1] * arr[j+1];
            int tc = mcm(i,k,arr,dp) + mcm(k+1,j,arr,dp) + x;
            minCost = Math.min(minCost,tc);
        }
        return dp[i][j] =  minCost;
    }
    static int matrixMultiplication(int arr[]) {
        // code here
        int n = arr.length-1;
        int[][] dp =  new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        return mcm(0,n-1,arr,dp);
    }
}

/*
By Copying the values of Single Input Array Into a 2-D Array

class Solution {
    public static int mcm(int i, int j, int[][] matrix, int[][] dp){
        if(i==j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int minCost =  Integer.MAX_VALUE;
        for(int k=i; k<j; k++){
            int x = matrix[0][i] * matrix[1][k] * matrix[1][j];
            int tc = mcm(i,k,matrix,dp) + mcm(k+1,j,matrix,dp) + x;
            minCost =  Math.min(minCost,tc);
        }
        return dp[i][j] =  minCost;
    }
    static int matrixMultiplication(int arr[]) {
        // code here
        int n = arr.length-1;
        int[][] matrix =  new int[2][n];
        for(int i=0; i<n; i++){
            matrix[0][i] = arr[i];
            matrix[1][i] = arr[i+1];
        }
        int[][] dp = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        return mcm(0,n-1,matrix,dp);
    }
}
*/

}
