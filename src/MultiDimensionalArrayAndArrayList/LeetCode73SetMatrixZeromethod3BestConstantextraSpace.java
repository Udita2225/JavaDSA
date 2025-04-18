package MultiDimensionalArrayAndArrayList;

public class LeetCode73SetMatrixZeromethod3BestConstantextraSpace {
    public static void main(String[] args) {
        /*
        CONSTANT EXTRA SPACE SOLUTION - Ye solution number of rows and columns par depend nahi karta
        Marking is necessary in this question
            0  1  2  3  4           0  1  2  3  4
        0   1  2  2 11 21        0  1  0  2  0 21
        1   3  0 24 21  9        1  0  0 24 21  9
        2   6 10  7  0 -8        2  0 10  7  0 -8
        3   8  4 19  3 99        3  8  4 19  3 99
         We have done the marking in the array itself.
         We have first ignored the Zeroth column and zeroth Row
         And then after encountering Zero in the Remaining Array, we have done the marking in the Zeroth column and Zeroth Row.
         After Marking, We initiate the loop only in the Zeroth Column and Zeroth Row and the after Finding Zero We make that
         whole Row or Column =0
         Par is Algorithm me ek problem hai .. Jaise humne 0th Row Aur Zeroth Column ko marking ke liye use kiya hai  but agar
         0th row aur 0th Column Me hi 0 aa gay to...
         In order to tackle this problem,
         We will take (VERY VERY IMPORTANT CONCEPT)
         boolean zeroRow = false;(Zeroth Row)
         booleam zeroCol = false;(Zeroth Column)
         Before Traveling in the SubArray i.e., before using the Zeroth Column and zeroth Row as the Column vector and Row Vector

         We will first check whether 0th Row or 0th Column contains Zero or not and then we will mark it
*/
//CODE
        /*
        class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length, n =arr[0].length;
        .............................................
        boolean zeroRow =false;
        boolean zeroCol = false;
        //Check the 0th row
        for(int j =0; j<n ; j++){
            if(arr[0][j] ==0){
                zeroRow = true;
                break;
            }
        }
        //Check the 0th Column
        for(int i = 0; i<m; i++){
            if(arr[i][0]==0){
                zeroCol = true;
                break;
            }
        }
        ...............................................................
        //Traverse in the Sub-Matrix wIthout Zeroth Row and 0th Column
        for(int i =1; i<m; i++){
            for(int j =1; j<n; j++){
                if(arr[i][j]==0){
                    arr[0][j] =0;
                    arr[i][0] =0;
                }
            }
        }
        //Traverse in the Zeroth Column
        for(int i =1; i<m; i++){
            if(arr[i][0] ==0){//Set this entire ith Row to 0
                for(int j = 1; j<n; j++){
                    arr[i][j] =0;
                }
            }
        }
        //Traverse in the 0th Row
        for(int j = 1; j<n ; j++){
            if(arr[0][j] == 0){//Set jth column to 0
                for(int i = 1; i<m; i++){
                    arr[i][j] =0;
                }
            }
        }
        ............................................
        if(zeroRow == true){//Set the 0th Row to 0
           for(int j =0; j<n; j++){
            arr[0][j]= 0;
           }
        }
        if(zeroCol == true){//Set the 0th Column to 0
         for(int i =0; i<m; i++){
            arr[i][0] =0;
         }
        }
    }
}


         */


    }
}
