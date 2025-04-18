package TimeandSpaceComplexity;

public class LogarithmicTimeComplexity {
    public static void main(String[] args) {
        /*
        Linear Time Complexity & Quadratic Time Complexity
        O(n)   - Linear
        O(n^2) - Quadratic
        O(n*m) - Quadratic
        O(n^1/2) - Quadratic
        */
        //Logarithmic Time Complexity
        /*
        No of operations- Accepted Values of i (No.Of Times i is changing)/No. of Rounds
        Ques Calculate the time Complexity for the below code snippet.
        int c=0;
        for(int i =1; i<=n; i*=2){   //Here time complexity is not equal to N..Because after each loop, i is getting multiplied by 2
        c++;}
        i = 1, 2,4, 8, 16 ..... 2^x     2^x~n
            2^0, 2^1, 2^2, 2^3, 2^4, 2^5...........2^x;   Total Number OF terms = x+1;
            Total Number of Operations= x+1;
            Time Complexity = O(x+1) ~ O(x)
            2^x ~= n
            x = log base 2 n =log2n
            a^x = b  logab =x;
            Time Complexity =O(log2n) = O(logn) //Hum base ko bhi hata sakte hain
            Explanation:-
            O(log2n)= O(logn/log2) = O((1/log2)*logn) Here log2 is constant . So it i ignored;
            */

        /*
        int c =0;
        for(int i =1; i<=n; i*=k){
        c++;}
        i = 1, k, k^2, k^3, k^4, k^5 .....k^x
        Total no. of terms = x+1;
        T.C = O(x+1) ~ O(x)
        k^x~=n
        logkn =x
        O(logkn) k base me hai
        TC = O(log n)
*/
    }
}
