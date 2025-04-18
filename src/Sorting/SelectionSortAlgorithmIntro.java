package Sorting;
import java.util.*;
public class SelectionSortAlgorithmIntro {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /*
    Concept of Sorted Array/ Unsorted array
    No swapping of adjacent elements
    We find the minimum element and put it on the first place
    In every pass, we find the kth smallest element and put it in its right place.
     */
    //Minimum element aur us element ka index nikalna bahot imp hai
    public static void main(String[] args) {
        //SELECTION SORTING
        int[] arr = {10, -4, 20, 1, -6, 8};
        print(arr);
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            int min = Integer.MAX_VALUE;
            int mindex =-1; //This is the index of minimum value
            for(int j =i; j<n; j++) {
                if (arr[j] < min) {//Minimum nikalte time less than hi lagana hai varna solution me uncertainty ho jayegi
                    min = arr[j];
                    mindex = j;
                }
            }
            //swap arr[i] and arr[mindex]
//         int temp = arr[i];
//         arr[i] = arr[mindex];
//         arr[mindex] = temp;
            swap(arr, i, mindex);
        }
    print(arr);
    }
}
//There are no such optimizations in Selection Sort
