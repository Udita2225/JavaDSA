package Arrays;

public class SyntaxandDeclaration {
    /*
    int x; integer declaration
    int[] y = new int[100]; 100 boxes ek saath line me
     memory ke andar ban gaye hain
     */
    public static void main(String[] args) {
        int x =5;
        int[] arr = new int[5];//Declaration & Allocation
        arr[0] =10;//Initializing
        arr[1]= 20;
        arr[2]= 30;
        arr[3]= 40;
        arr[4]= 50;
        //5 boxes ek saath create ho gaye jinka naam hai array
        //INDEXING:-
        /*
        0,1,2 3,4;
        It is from 0 to n-1; indices
         */
        //Output of array elements
        System.out.println(arr[0]+ " ");
        System.out.println(arr[1]+ " ");
        System.out.println(arr[2]+ " ");
        System.out.println(arr[3]+ " ");
        System.out.println(arr[4]+ " ");
        //output of array
        arr[0] = 99;
        arr[0] += 10;
        System.out.println(arr[0]);


    }

}
