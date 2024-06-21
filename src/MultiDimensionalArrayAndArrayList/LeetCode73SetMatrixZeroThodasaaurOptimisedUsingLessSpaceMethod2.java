package MultiDimensionalArrayAndArrayList;

public class LeetCode73SetMatrixZeroThodasaaurOptimisedUsingLessSpaceMethod2 {
    public static void main(String[] args) {
        /*
        m+n space gets wasted
        Boolean me by default False Store ho jaata hai
        0 1 2 0
        3 4 5 2
        1 3 1 5
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        Specific row number Column number ko pehle hi identify kar lenge ki kisko zero banana hai
        by using extra row and extra column
        Extra Row size= m Extra column size = n
        Total extra row and column space used = m+n
        */
      /*  class Solution {
            public void setZeroes(int[][] arr) {
                int m = arr.length, n =arr[0].length;
                boolean[] row = new boolean[m];
                boolean[] col = new boolean[n];
                //Marking The particular row and column
                for(int i =0; i<m; i++){
                    for(int j =0; j<n; j++){
                        if(arr[i][j]==0){
                            row[i]= true;
                            col[j]= true;
                        }
                    }}
                //Set the 'true' rows to 0;
                for(int i =0; i<m; i++){
                    if(row[i]==true){//set ith row to 0 for arr;
                        for(int j =0; j<n; j++){
                            arr[i][j] =0;
                        }
                    }}
                //Set the 'true' cols to 0;
                for(int j=0;j<n; j++){
                    if(col[j]==true){
                        //Set jth col to 0 in arr
                        for(int i =0; i<m; i++){
                            arr[i][j] =0;
                        }
                    }

                }

            }
        }
        */
    }
}
