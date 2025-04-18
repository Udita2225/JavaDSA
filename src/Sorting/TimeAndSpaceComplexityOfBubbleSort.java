package Sorting;
import java.util.Scanner;
import java.util.*;
public class TimeAndSpaceComplexityOfBubbleSort {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        int n =arr.length;
        //BUBBLE SORTING-1 (Bekaar Method)
        /*for(int x=1; x<=n-1; x++){
            for(int i=0; i<n-1; i++){
                if(arr[i]>arr[i+1]){
                    int temp= arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        Space Complexity = O(n) Given Array of size =n
        Auxillary Space = O(1) No extra space is used
        Time Complexity:-
        No. of operations = (n-1)(n-1) = (n-1)^2 = n^2-2n+1
                            O(n^2-2n+1)~O(n^2)

         */
        //BUBBLE SORTING-2 (Here No. Of Operations are less)
        /*
        Main Idea - After every single pass, the nth largest element comes to its right place, then why to run the innerpass n-1 times everytime
                    Everytime Char baar swap karne ki need nahi hai
         for(int x=0; x<n-1; x++){
           for(int i=0; i<n-1-x; i++){
           if(arr[i]>arr[i+1]){
           int temp = arr[i];
           arr[i] = arr[i+1];
           arr[i+1] = temp;
           }
         }
       }
       Space Complexity O(n)
       Auxillary Space O(1)
       Time Complexity:-
       x              i
       0             0,1,2,3   (n-1) times
       1             0,1,2     (n-2)  times
       2             0,1
       n-2           0           1 time
      Total Number Of Operations- (n-1) + (n-2) + ......+1 = Total terms =n(n-1)/2
      Time Complexity O(n^2/2 - n/2) ~ O(n^2)
         */

        //Much better Method
        /* More Optimized Code
        for(int x=0; x<n-1; x++){
        for(int i=0; i<n-1-x; i++){
        if(arr[i] >arr[i+1]){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp
           }
        }
        //check if this pass has sorted or not
        boolean flag = true; //true means sorted
        for(int i =0; i<n-1-x; i++){
        if (arr[i]>arr[i+1]){
        flag= false;
        break;
           }
        }
        if(flag == true) break; //For outer loop
        }

         */
        //The upper code can be optimised more by using boolean wala part in one code only:-
        //FINAL CODE
        for(int x =0; x<n-1; x++){//n-1 passes
        boolean flag= true;
          for(int i=0; i<n-1-x; i++){
           if(arr[i] >arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            flag = false;
            }
          }
          if(flag==true) break;
          }
        for(int ele: arr){
        System.out.print(ele + " ");
    }
        System.out.println();
    }
}
//Time Comlexity - O(n^2/2 - n/2) ~O(n^2)