package MultiDimensionalArrayAndArrayList;

public class TranposeOfAMatrix {
    public static void main(String[] args) {
        //Write a program to print the transpose of the matrix entered by the user and store it in a new matrix
       //transpose  row -column
        //column - row
        /*
        eg -
         ROW WISE PRINTING                COLUMN WISE PRINTING(TRANSPOSE OF A MATRIX)
         1 2                               1 3 5
         3 4                               2 4 6
         5 6
         LEFT TO RIGHT                     TOP TO BOTTOM
         */
        int[][] arr= {{1,2}, { 3,4}, {5,6}};
        int m =arr.length, n =arr[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]+ " ");

            }
        }

    }
}
