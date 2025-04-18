package MultiDimensionalArrayAndArrayList;

public class LeetCode73SetMatrixZeros {
    /*
    Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
     */
    //METHOD 1
    /*
    Using a copy of original array to traverse and check for Zeros(WORST Method)
    1 1 1       1 1 1
    1 0 1       1 0 1 Helper Array
    1 1 1       1 1 1
     */
/*
Is solution me ek extra helper array banaya gaya hai .Helper Array me Deep Copy kw through saare elements copy kiye
gaye hain from arr
Travel to Helper Array Me Kiya jaa raha hai But changes are made in the original arr
Is Method me problem ye hai ki ek aur array form kiya jaa raha hai jisse extra space use ho raha hai
So this is not an optimised Solution
We have to find an Optimised solution
 */
    /*class Solution {
        public void setZeroes(int[][] arr) {
            int m = arr.length, n =arr[0].length;
            int[][] helper = new int[m][n];
            for(int i =0; i<m; i++){
                for(int j =0; j<n; j++){
                    helper[i][j] = arr[i][j]; //Deep Copy
                }}
            for(int i =0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(helper[i][j] ==0){
                        //Set the ith row and jth column to Zero in arr
                        for(int b =0; b<n; b++){
                            arr[i][b] = 0;
                        }
                        for(int a=0; a<m; a++){
                            arr[a][j] =0;
                        }

                    }
                }
            }}}

*/
/*
Time Complexity -
We are using extra m*n 'int's
O(m*n) space is utilised/wasted
 */
}