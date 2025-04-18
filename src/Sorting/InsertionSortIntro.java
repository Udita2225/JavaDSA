package Sorting;
import java.util.*;
public class InsertionSortIntro {
    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
public static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
}
     //Insertion Sort
public static void main(String[] args) {
        int[] arr= {10, -4, 20, 78, -6, 8};
        int n = arr.length;
        print(arr);
//        for(int i =1; i<=n-1; i++) {//n-1 passes
//            for (int j = i; j >= 1; j--) {
//                if (arr[j] < arr[j-1]) {
//                    swap(arr, j, j - 1);
//                } else {
//                    break;
//                }
//            }
//        }
    //INSERTION SORTING USING WHILE LOOP  --> Standard Code For Insertion Sorting
    /*for(int i =1; i<n; i++){
        int j =i;
        while(j>=1 && arr[j]<arr[j-1]){
            swap(arr, j, j-1);
            j--;
        }
    }

     */
    //Same process can be done with for loop also. Both conditions can be written in the same loop only
    for(int i=1; i<n; i++){
        for(int j=i; j>=1 && arr[j]<arr[j-1]; j--){
            swap(arr, j, j-1);
        }
    }
     print(arr);
    }
}
//Yaha par Boolean flag ki zarurat nahi padti aur Best case ki Time Complexity bhi Bubble Sort ki tarah hi hoti hai
//(i.e)