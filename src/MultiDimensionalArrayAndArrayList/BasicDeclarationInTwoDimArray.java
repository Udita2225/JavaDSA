package MultiDimensionalArrayAndArrayList;

public class BasicDeclarationInTwoDimArray {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        //No of elements in a grid  =3*3=9
        grid[0][0]= 10;
        //10 20 30
        //40 50 60
        //70 80 90
        grid[0][0]= 10;
        grid[0][1]= 20;
        grid[0][2]= 30;
        grid[1][0]= 40;
        grid[1][1]= 50;
        System.out.print(grid[2][2]+" ");
        //int[][] arr= new int[4][3];
        int[][] arr = {{1,2},{3,4},{5,6},{7,8}};

        //yaha par memory allocation to ho gaya but since initialize nahi huwa hai to by default 0 aa jayega
/*
       In java, in 2D Arrays , if we are directly initializing it, then we dont't mention the no. of rows and columns ,
       but if we only
       declaring and allocating the memory , then we need to mention both the rows and columns.
 */
    }
}
