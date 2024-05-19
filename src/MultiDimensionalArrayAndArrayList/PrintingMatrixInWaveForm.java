package MultiDimensionalArrayAndArrayList;

public class PrintingMatrixInWaveForm {

        /*
        1 2 3   4 5 6   7 8 9    Row Wise
        1 4 7   2 5 8   3 6 9    Column Wise
        1 2 3   6 5 4   7 8 9    Wave Form (ulta S) Zig-Zag (It is also a row wise printing  but in alternate fashion
        Wave Form -            1st row Left to Right
        (PRINTING)             2nd row Right to Left
                               3rd row Left to Right
                               4th row Right to Left and so on..... */
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
            //Wave Printing Row WIse(Alternate)
            /*
            1 2 3    1 2 3
            4 5 6    6 5 4
            7 8 9    7 8 9
             */
            for (int i = 0; i< m; i++) {
                if(i%2==0){
                    for (int j =0; j<n ; j++) {
                        System.out.print(arr[i][j]+ " ");
                    }
                }
                else{
                    for(int j= n-1; j>=0; j--){
                        System.out.print(arr[i][j]+" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            //Printing in the form of N
            /*
            1 2 3       7 4 1
            4 5 6       2 5 8
            7 8 9       9 6 3
             */
            for (int j = 0; j< n; j++) {
                if(j%2==0){
                for (int i= m-1; i >=0 ; i--) {
                    System.out.print(arr[i][j]+ " ");
                }
                }
                else{
                    for(int i=0; i<m; i++){
                        System.out.print(arr[i][j]+" ");
                    }
                }
                System.out.println();
        }
    }


}

