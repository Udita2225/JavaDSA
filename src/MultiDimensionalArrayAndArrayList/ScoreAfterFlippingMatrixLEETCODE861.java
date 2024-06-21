package MultiDimensionalArrayAndArrayList;

public class ScoreAfterFlippingMatrixLEETCODE861 {
    public static void main(String[] args) {
        /*
You are given an m x n binary matrix grid.
A move consists of choosing any row or column and toggling each value in that row or column (i.e., changing all 0's to 1's, and all 1's to 0's).
Every row of the matrix is interpreted as a binary number, and the score of the matrix is the sum of these numbers.
Return the highest possible score after making any number of moves (including zero moves).
*/
        //FLIPPING THE MATRIX
        /*          Flipping 0th Row     Flipping 1st Column
        0 0 1 1 = 3  1 1 0 0    12          1 0 0 0    2^3*1 + 2^2*0 + 2^1*0 + 2^0*0 = 8
        1 0 1 0 =10  1 0 1 0    10          1 1 1 0    2^3*1 + 2^2*1 + 2^1*1 + 2^0*0 = 14
        1 1 0 0 =12  1 1 0 0    12          1 0 0 0    2^3*1 + 2^2*0 + 2^1*0 + 2^0*0 = 8
         SUM=  25      SUM   =  34                                              SUM = 30

     Highest score from these three is 34
       */
        /*
        Hints:-
        100000>001111
        1110> 1101
        LeftMost(Leading) Should be 1
        Trailing(Right Most) may be 0
         */
        //Binary Number Addition
        /* iska pehle binary addition karo fir usko integer me covert kar do

        1 1 1
        1 1 1 1   1+1+1 =3 aa raha hai to three ko pehle binary me convert karke answer likhenge
        1 0 0 1   2/3 = Quotient 1  remainder 1 .. So 3 in binary Number 3= 1
  +     1 1 1 1   3 =11(in binary) So 1 in ans and 1 in carry
    ------------  Last me (1+1+1+1(carry)) =4 ) and 4 =100(In Binary)
    1 0 0 1 1 1   This method will become very tedious if we will get 11 in carry
    ------------

       2^3  2^2  2^1  2^0
        3    2    1    0

        1    1    1    1
        1    0    0    1
      + 1    1    1    1
    ------------------------

    ------------------------


         */

    }
}
