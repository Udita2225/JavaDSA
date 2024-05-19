package MultiDimensionalArrayAndArrayList;

public class ArrayOfArrays {
    public static void main(String[] args) {
        //1-D Array of elements  //int[] nums = new int[3];  {10,20, 30}
        //2-D Array of Arrays    //int[][] arr = new int[2][3];
        /*
        arr = {{9,1,4} ,{2,7,3}}
        Basically arr is an Array Of ARRAYS;.. yaha par no. of elements 2 hi hai which is equal to the number of rows.
        When we write arr[0].length; then it gives the length of zeroth element of arr which is 3
         */
        /*
        Initialisation of a 2-Dimensional Array
         */
        int[][] arr ={{1234, 56}, {1256, 43}, {1434, 32}, {1312,96} };
        //1234 56 Every single line of 2-D Array represents a single Array.
        //1256 43
        //1434 32
        //1312 96
        int[][] grid= {{12, 34, 56}, {78, 91, 23}};
        //12 34 56
        //78 91 23


    }
}
