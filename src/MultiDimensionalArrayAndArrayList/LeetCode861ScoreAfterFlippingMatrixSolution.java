package MultiDimensionalArrayAndArrayList;
import java.util.Scanner;
public class LeetCode861ScoreAfterFlippingMatrixSolution {
    public static void main(String[] args) {
        //class Solution {
           // public int matrixScore(int[][] arr) {
        int[][] arr=new int[3][4];
        Scanner sc = new Scanner(System.in);
        int m = arr.length,  n =arr[0].length;
        for(int i =0; i<m; i++) {
            for(int j= 0; j<n; j++){
                arr[i][j] = sc.nextInt();
        }}
                //Put 1 at the 0th position of every Row
                for(int i =0; i<m; i++){
                    if(arr[i][0]==0){ //Flip That Row
                        for(int j=0; j<n; j++){
                            if(arr[i][j]==0){
                                arr[i][j] =1;}
                            else {arr[i][j]=0;}
                        }

                    }
                }
                //Flip  those columns where (number of 0s > number of 1s)
                for(int j =1; j<n; j++){
                    int noOfZeros =0;
                    int noOfOnes =0;
                    for(int i =0; i<m; i++){
                        if(arr[i][j]==0) noOfZeros++;
                        else noOfOnes++;
                    }
                    if(noOfZeros> noOfOnes){//Flip That Column
                        for(int i =0; i<m; i++){
                            if(arr[i][j]==0) arr[i][j] =1;
                            else arr[i][j] = 0;
                        }
                    }
                }
                //Calculating the score
                int score =0;
                int x =1;
                for(int j =n-1; j>=0; j--){
                    for(int i =0; i<m; i++){
                        score+= (arr[i][j] * x);
                    }
                    x*=2;
            }
        System.out.println(score);
        }
    }
