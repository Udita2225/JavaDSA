package MultiDimensionalArrayAndArrayList;

public class RotatingTheMatrixBy90Degree {
    //My solution
    public static void main(String[] args) {
        /*        transpose    Swapping Column 1 with column 3
        1 2 3       1 4 7      7 4 1
        4 5 6   ->  2 5 8   -> 8 5 2
        7 8 9       3 6 9      9 6 3
         */
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <= i ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;}
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
            for(int i = 0; i <m ; i++) {
                for (int j = 0; j<n ; j++) {
                  int temp = arr[i][0];
                  arr[i][0]= arr[i][n-1];
                  arr[i][n-1]= temp;
                }}
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j <n ; j++) {
                        System.out.print(arr[i][j]+ " ");
                    }
                    System.out.println();
                }
    }
}
