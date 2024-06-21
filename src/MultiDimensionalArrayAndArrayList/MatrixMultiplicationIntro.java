package MultiDimensionalArrayAndArrayList;

public class MatrixMultiplicationIntro {
    public static void main(String[] args) {
      /* Write a program to print the multiplication of two matrices given by the user
      1  2     5  6        1*5+2*7     1*6+2*8          19  22
            *        =                           =
      3  4     7  8        3*5+4*7     3*6+4*8          43  50
      Pehle  wale ka ROW uar dusre wale ka COLUMN
      In Matrix x*y != y*x
       0 1 2     0 1 2
     0 1 2 3   0 9 8 7      1*9+2*6+3*3  1*8+2*5+3*2  1*7+2*4+3*1    30 24 18
     1 4 5 6 * 1 6 5 4 =    4*9+5*6+6*3  4*8+5*5+6*2  4*7+5*4+6*1  = 84 69 54
     2 7 8 9   2 3 2 1      7*9+8*6+9*3  7*8+8*5+9*4  7*7+8*4+9*1   138 137 90
       Two matrices can be added only if their orders are same
       Two matrices can be multiplied only if  n==p (m*n order of 1st matrix)
                                                    (p*q order of 2nd Matrix)
      Order of Resultant Matrix =  m*q
 *
 /*
           2*3              3*4            2*4
              a               b              c
          0 1 2         0 1 2 3        0 1 2 3
        0 1 2 1       0 1 0 1 2      0
        1 2 1 2  *    1 2 1 0 0  =   1
                      2 0 3 1 1

 c[0][1] = a[0][0]*b[0][1] + a[0][1]*b[1][1] + a[0][2]*b[2][1]
 c[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j]
 c[i][j] = Summation of a[i]b[k]*b[k][j]  where k is going from 0 to b.length-1
       */









    }
}
