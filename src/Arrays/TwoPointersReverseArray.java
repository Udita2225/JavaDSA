package Arrays;

import java.util.Arrays;

public class TwoPointersReverseArray {
    public static void main(String[] args){
        //Write a program to reverse the array without using any extra array.
        int[] arr={10, 20, 30, 40, 50, 60, 70};
        int n =arr.length;
        for(int ele: arr){
            System.out.print(ele +" ");}
        System.out.println();
        Arrays.sort(arr);
        for(int ele: arr){
            System.out.print(ele+ " ");}
            System.out.println();
            //reverse;
//            for(int i =0; i<n/2; i++){for part to be reversed i=1; j=5
//              int j= n-1-i;
//              int temp =arr[i];
//              arr[i] = arr[j];
//              arr[j] = temp;
//            }
//            for( int ele : arr){
//                System.out.print(ele+ " ");
//            }
//            System.out.println();
        //Using Two Pointer
        int i= 0, j=n-1;
        while(i<=j){
//            int temp= arr[i];
//            arr[i]= arr[j];
//            arr[j] = temp;
            swap(arr, i, j);//We are also passing arr which is pass by reference;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
        public static void swap(int[] arr, int i,int j){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
        }
        //If we want to reverse the selected part;
    /*
    int i = 1, j=5; //Part of array to reverse
     */
    }

