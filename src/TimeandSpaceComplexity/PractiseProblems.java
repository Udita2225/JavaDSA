package TimeandSpaceComplexity;

public class PractiseProblems {
    public static void main(String[] args) {
        /*
        Ques - Calculate the time Complexity for the following Code Snippet.
               int c =0;
               for(int i=1; i<=n; i+=i){
               c++;
               }
         Ans - i+=i
               i=i+i;
               i=2i;  i*= 2;
               i= 1, 2, 4, 8, 16 ......
                  2^0, 2^1, 2^2, 2^3, 2^4, 2^5.....2^x;
                  2^x =n;
                  log2n =x;
                  Time Complexity = O(log2n);
                  Space Complexity = 0(1);
                  */
      /*
      int c =0;
      for(int i=1; i<n; i+=i){
         for(int j=0; j<i; j++){
         c++;
         }}
         i        j
         1        0                  1 time
         2        0,1                2 times
         4        0,1,2,3            4 times
         8        0,1,2,3,4,5,6,7    8 times
         .        .                  .
         .        .                  .
         2^x      0,1,2,3...(2^x-1)  2^x times
         //Method 1
         Total Number Of Operations = 1+2+4+8+....2^x
         This is A Geometric Progression
         Total Number of terms = x+1,    Common Ratio = 2
         Sum of the operations- (a(r^n-1))/r-1 = 1(2^x+1 -1)/2-1 = 2*n-3
         Time Complexity = O(2*n-3)~O(n)
         //Method 2  Refer Notes
         For the rest Questions, Refer Notes in NoteBook


       */
    }
}
