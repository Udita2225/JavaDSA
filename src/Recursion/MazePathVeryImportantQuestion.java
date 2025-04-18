package Recursion;
import java.util.*;
public class MazePathVeryImportantQuestion {
    //(1,1) se (m,n) tak jaane ke kitne paaths hain?

    public static int maze(int row, int column, int m, int n){
        if(row==m || column==n) return 1;
        //if(row ==m && column==n) return 1;
        //if(row>m || column>n ) return 1;
        int rightways = maze(row, column +1, m, n);
        int downways = maze(row+1, column,m,n);
        return rightways+downways;
    }
    //Without using 4 variables
    public static int maze2(int m, int n){
        if(m==1|| n==1) return 1;
        int rightways = maze2( m, n-1);
        int downways  =  maze2(m-1,n);
        return rightways+downways;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m : ");
        int m  =  sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        //System.out.println(maze(1,1,m,n));
        System.out.println(maze2(m,n));
    }
}
