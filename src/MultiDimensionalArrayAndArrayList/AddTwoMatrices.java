package MultiDimensionalArrayAndArrayList;

public class AddTwoMatrices {
    //The order of both the matrices should be same to perform addition
    //Rows and Columns should be same
    //The order(rows and columns ) of the result should also be same
    public static void main(String[] args) {
        //With using extra array
        int[][] a ={{1,9,2}, {3,7,4}, {8,5,6}};
        int[][] b ={{9,3,7},{ 8,6,5}, { 2,4,1}};
        int m = a.length;
        int n = a[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                result[i][j] = a[i][j]+ b[i][j];
            }
        }
        for(int i =0; i<m; i++){
            for (int j = 0; j <n ; j++) {
                System.out.print(result[i][j] + " ");

            }
            System.out.println();
        }
        //Without using extra variable
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + b[i][j]+ " ");
            }
            System.out.println();
        }


    }

}
