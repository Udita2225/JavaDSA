package MultiDimensionalArrayAndArrayList;
import java.util.Scanner;

public class TraversalThrough2DArray {
    public static void main(String[] args) {
        //yaha par loop ke andar loop lagta hai
        //traversal means  array me travel karna
        Scanner sc =  new Scanner(System.in);
        int[][] arr = new int[2][3];
        int m= arr.length;      //This time it is printing the length of row  i.e, 2
         System.out.println(m);
         //For length of columns
        int n = arr[0].length; //zeroth row par kitne column hain
        System.out.println(n);
        for(int i=0; i<3;i++){
            for(int j=0; j<3; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        //Row wise printing
        //Output Of 2-D Array
        for(int i =0; i<3; i++){//rows
            for(int j=0; j<3; j++){//columns
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        //Output using for each loop
        //2- D ARRAY CAN BE PRINTED USING for each loop ..because for 2-D array memory is not allocated in a continuous manner
    }
}
