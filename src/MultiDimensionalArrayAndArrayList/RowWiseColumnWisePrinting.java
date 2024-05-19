package MultiDimensionalArrayAndArrayList;

public class RowWiseColumnWisePrinting {
    /*
    The order gets interchanged while taking the transpose
    if a matrix has 3*2 order then the transpose of this matrix will be of the order 2*3
     */
    public static void main(String[] args) {
        //Row wise
        //1 2 3 4 5 6
        int[][] arr= {{1,2}, { 3,4}, {5,6}};
        int m =arr.length, n =arr[0].length;

        for (int i = 0; i <m ; i++) {//rows
            for (int j = 0; j <n ; j++) {//columns
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }//1 2
         //3 4
         //5 6
        System.out.println();
        //Column Wise
        //When we have to print the 0th column first
        //Storing
        int[][] transpose = new int[n][m];
        for (int i = 0; i <n ; i++) {//columns
            for (int j = 0; j <m ; j++) {//rows
              //System.out.print(arr[i][j]+ " ");
              //System.out.println();
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j]+" ");

        }
        //1 3 5
        //2 4 6
        System.out.println();


    }
}}