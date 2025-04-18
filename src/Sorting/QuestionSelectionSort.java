package Sorting;
import java.util.*;
public class QuestionSelectionSort {
    //Sort the given array in increasing order using Selection Sort, but in each pass put the kth maximum element
    // at the right position
    public static void main(String[] args) {
        int[] arr = {3,1,-2,5,4};
        int n =arr.length;
        for(int i = 0; i<n-1; i++){
            int max = Integer.MIN_VALUE;
            int maxindex = -1;
            for(int j = n-1-i; j>=0; j--){
                if(arr[j]> max){
                    max = arr[j];
                    maxindex = j;
                }
            }
        int temp = arr[n-1-i];
            arr[n-1-i]= arr[maxindex];
            arr[maxindex]= temp;

        }
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();

    }
}
