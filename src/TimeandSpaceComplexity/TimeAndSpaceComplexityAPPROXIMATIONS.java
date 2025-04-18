package TimeandSpaceComplexity;
import java.util.*;
public class TimeAndSpaceComplexityAPPROXIMATIONS {
    public static void main(String[] args) {
        //APPROXIMATIONS
        /*
        O(n) - Notation
        1. O(kn)~O(n)     The constant multiplied is ignored. Eg:- O((1/2)n)~O(n)
        2. O(n+k)~O(n)    The constant which is added is ignored. Eg:- O(n+100)~O(n)
        3. O(n-k)~O(n)    The constant which is subtracted is ignored. Eg:- O(n-100)~O(n)
        4. O(n^2)~O(n^2)  Powers of 'n' are important  Eg:- O(n^2 + 5)~O(n^2)         O(100n^1/2 + 2) ~O(n^1/2)
        5. O(n^3+100n^2-5n)~O(n^3)  Highest Power of n is considered. Rest powers are ignored. Eg:- O(n^1/3 + n^1/2)~O(n^1/2)
        6. O(n+10m)~O(n+m)  If there are other variables like m,they are separate.
        7. O(200)~O(1)    If the number of Operations is constant then the time complexity is equal to Big O of 1 O(1)
        8. n>n^1/2>logn   O(logn) is fastest
*/
        /*
        CONSTANT TIME COMPLEXITY
        for(int i =1; i<=200; i++){
        sout("Hello");
        }
        Total number Of Operations = 200
        Time Complexity = O(200)~O(1)
         */
        /*

        IN NESTED LOOPS:-

        for(int i=1 to n){
           for(int j=1 to m){
              for(int k=1 to t){
                  sout("Hello");
               }
             }
          }
          Time Complexity - O(n*m*t)

          Agar andar waala Loop bahar waale loop par depend naa kar raha ho to
          Time Complexity nikalna bhot easy hai
          Sirf multiply karna hai Total number of operations
          But agar andar waala loop bahar waale loop pr depend kar raha hai to fir hume manually no. of operations calculate karne honge.
           */
    }
}
