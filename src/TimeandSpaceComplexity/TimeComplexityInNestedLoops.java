package TimeandSpaceComplexity;
import java.util.*;
public class TimeComplexityInNestedLoops {
    public static void main(String[] args) {
        /*
        Calculate the time complexity in nested Loops

Ques 1  for(int i=0; i<n;i++){          ->n times
         for(int j=0; j<m; j++){
          System.out.println("Okay");    ->m times
         }
        }
        i=0  -> j= 0,1,2,3,4,......m-1  ->m times
        i=1  -> j= 0,1,2,3,4,......m-1
        i=2  -> j= 0,1,2,3,4,......m-1
        .
        .
        i=n-1 ->j= 0,1,2,3,4,......m-1

        Total number of Operations = n*m;
        Time Complexity = O(n*m)

        NOTE- O(n)>O(n^2) Here O(n) is greater than O(n^2) that means O(n) is much faster than O(n^2)
                          O(n) means  it operates 100 times
                          O(n^2) means it operates 10000 times
        Also O(n)>O(m*n)  i.e., O(n) is faster than O(m*n)
         */

        /*
Ques 2. for(int i =0; i<n; i++){
           for(int j=0; j<i; j++){
           System.out.print("Okay");
           }
         }

         i             j
         0             X                     0 Time
         1             0                     1 Time
         2             0,1                   2 Times
         3             0,1,2                 3 Times
         4             0,1,2,3               4 Times
         5             0,1,2,3,4             5 Times
         .             .                     .
         .             .                     .
         n-1           0,1,2,3,4,5....n-2    n-1 Times
         Total number of OPERATIONS -
         0+1+2+3+4+5+6+.............n-1
         = (n-1)(n-1+1)/2   = (n(n-1))/2  = (n^2-n)/2
         Time Complexity = O((n^2-n)/2) ~ O(n^2 -n) ~ O(n^2)
*/


    }
}
