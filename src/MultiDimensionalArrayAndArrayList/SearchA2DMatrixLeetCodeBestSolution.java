package MultiDimensionalArrayAndArrayList;
import java.util.Scanner;
public class SearchA2DMatrixLeetCodeBestSolution {
    /*
    Ques -
    Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int[][] arr = new int[5][5];
    int m =arr.length; int n =arr[0].length;
    for(int i =0; i<m; i++){
        for(int j=0; j<n; j++){
            arr[i][j] = sc.nextInt();
        }}
    int target = sc.nextInt();
    int i =0, j =n-1;
       while(i<m && j>=0){
        if(arr[i][j] == target){ System.out.println("TRUE");
        return;} //Return immediately after finding the target
        else if(arr[i][j]>target){
            //go left
            j--;}
        else{
            //go down
            i++;
        }
    }
        System.out.println("FALSE");
}
}


