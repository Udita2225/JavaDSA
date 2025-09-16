package DynamicProgramming2D;
//Number of Paths That Passes Through Certain Check Points
/*
Problem
Jaggi and Jojo are interested in problems related with Grids. They were trying different problem on grids, when they found this one. Given a grid of size NXN. Its bottom-left point is (0,0) and top-right element is (N-1,N-1).
We can traverse the grid in either top or right direction. You have to find the number of ways to traverse from the bottom-left to top-right point. There are some checkpoints which you have to visit in every path. There is atleast one valid path.
Input
The input file consists of several cases T (1<=T<=5). The first line of each case contains a positive integer N (1<=N<=1000) specifying the size of grid and the number of checkpoints Q (0<=Q<=100).
In next line there are Q space separated co-ordinates (a,b) of the checkpoints. Checkpoints are 0-Indexed.
Output
For every testcase, you have to print the answer modulo 1000000007.
Sample Input
2
3 0
5 1
2 2
Sample Output
6
36
Time Limit: 5
Memory Limit: 256
Source Limit:
*/
public class HackerEarthNoOfPathsPassesThroughCheckPoints {
/*
/* IMPORTANT: Multiple classes and nested static classes are supported */
/* Sample code to perform I/O:
* Use either of these methods for input
//BufferedReader
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String name = br.readLine();                // Reading input from STDIN
System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
String name = s.nextLine();                 // Reading input from STDIN
System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
* uncomment this if you want to read input.

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
//import for Scanner and other utility classes
*/
/*
import java.util.*;

    class TestClass {
        static final int MOD = 1000000007;
        public static class Pair implements Comparable<Pair>{
            int a;
            int b;
            Pair(int a, int b){
                this.a =a;
                this.b =b;
            }
            public int compareTo(Pair object){
                // if(this.a != object.a) return Integer.compare(this.a, object.a);
                // else return Integer.compare(this.b,object.b);
                if(this.a != object.a) return this.a-object.a;
                else return this.b-object.b;
            }
        }

        public static long Subpath(int x, int y, int a, int b){
            if(a<x || b<y) return 0;
            int m = a-x+1;
            int n = b-y+1;
            long[][] dp =  new long[m][n];
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(i==0 || j==0) dp[i][j] = 1;
                    else dp[i][j] = (dp[i][j-1] + dp[i-1][j])%MOD;
                }
            }
            return dp[m-1][n-1];
        }
        public static void main(String args[] ) throws Exception {
            // Write your code here
            //Scanner
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while(T-- > 0){
                ArrayList<Pair> arr = new ArrayList<>();
                int N = sc.nextInt();
                int Q = sc.nextInt();
                for(int i=0; i<Q; i++){
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    arr.add(new Pair(a,b));
                }
                arr.add(new Pair(0,0));
                arr.add(new Pair(N-1,N-1));
                Collections.sort(arr);
                long path = 1;
                for(int i=1; i<arr.size(); i++){
                    int a = arr.get(i).a;
                    int b = arr.get(i).b;
                    int x = arr.get(i-1).a;
                    int y = arr.get(i-1).b;
                    path = (path *Subpath(x,y,a,b))%MOD;
                }
                System.out.println(path);
            }
        }
    }

*/
}
