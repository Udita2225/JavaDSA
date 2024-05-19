package MultiDimensionalArrayAndArrayList;

public class RotatingTheMatrix90ByReversing {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        //transposing
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <= i ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;}
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
       //rotate -> reverse each  row after transposing
        for (int i = 0; i <m ; i++) {
            int a =0, b =m-1;//a = lower index b = last index
            while(a<b){
                //Swap arr[i][a] and arr[i][b]
                int  temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b]=  temp;
                a++;
                b--;
            }

        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
