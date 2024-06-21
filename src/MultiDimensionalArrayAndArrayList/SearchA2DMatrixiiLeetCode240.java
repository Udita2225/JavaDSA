package MultiDimensionalArrayAndArrayList;

public class SearchA2DMatrixiiLeetCode240 {
    public static void main(String[] args) {
        /*
        Write an efficient algorithm that searches for a value target in an m*n integer matrix which has the following properties:
        1. Integer in each row are sorted in ascending from left to right
        2. Integers in each column are sorted in ascending order from top to bottom
         */
        /*
        class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m =arr.length; int n =arr[0].length;
        //Time Limit Exceeded
        //No. of iterations/rounds = m*n
        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==target) return true;
            }
        }
        return false;
    }
} This is a very bad code as its time limit is exceeded
Not an efficient code
Agar 10000 rows hain aur 10000 columns hain to then around 1 crore times the loop will run ..which is time consuming
         */

    }
}
