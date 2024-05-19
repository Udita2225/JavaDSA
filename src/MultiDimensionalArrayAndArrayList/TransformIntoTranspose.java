package MultiDimensionalArrayAndArrayList;

public class TransformIntoTranspose {
    //Transforming the original matrix into its transpose without making extra array
    public static void print(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    } //We have hidden the formed function in order to save space by using the arrow on the left side
    public static void main(String[] args) {
    int[][] arr = {{1,2,3}, {4,5,6},{7,8,9}};
    print(arr); //Calling the print function
        int  m = arr.length;
        int n= arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <=i ; j++) {
                //Swapping
                int temp = arr[i][j]; //yaha par reswapping ho rahi hai if j < n
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }}
        print(arr);
    }
}
