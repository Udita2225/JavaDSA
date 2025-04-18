package Sorting;

public class TransformArrayQuestionSeclectionSortingNegativeMarking {
    //Using for-each loop we can just print the array, we can't modify the elements of array
    /*
 Question- Given an array with N distinct elements and all are positive, convert the given array to a form where all elements are in the range from 0 to N-1.
                  The order of elements is the same, i.e, 0 is placed in the place of the smallest element, 1 is placed for the second smallest
                  element,....N-1 is placed for the largest element.
*/
/*
    index      0  1  2  3  4  5      n=6 size of array
    arr       54 11 28 47 91 63
    order      3  0  1  2  5  4  (This is the order in which the given array is arranged from smallest to largest). We have to write the code for this
                                  order only.)
*/
/*
HINT:- Negative Marking
*/
//Code
    public static void print(int[] arr){
        int n =arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

//Code
   int[] arr = {48, 12, 78, 34, 100, 57, 23};
   // Solution should be -
   //            3,  0,  5,  2,  6,  4,  1
   int n = arr.length;
   print(arr);
   int x =0;
   for(int i =0; i<n; i++){
       int min = Integer.MAX_VALUE;
       int mindex = -1;
       for(int j =0; j<n; j++) {
           if (arr[j] < min && arr[j]>0) {
               min = arr[j];
               mindex = j;
           }
       }
       arr[mindex] = x;
       x--;
   }
   print(arr);
   for(int i=0; i<n; i++){
       arr[i]*=(-1);
       System.out.print(arr[i] + " ");
       }
    }
}
