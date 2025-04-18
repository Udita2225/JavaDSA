package Sorting;
import java.util.*;
public class BubbleSortAlgorithmIntro {
    //Bubble Sorting - Swapping of two adjacent numbers
    //We have to print the array multiple times. So we will use Function for this

    public static void print(int[] x) {
        for (int ele : x) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
//    public static void main(String[] args) {
//        int[] arr = {3,1,2,5,4};
//        int n = arr.length;
//        print(arr);
//        for(int i =0; i<n-1; i++) {
//            if (arr[i] > arr[i+1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        print(arr);

    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2};//This time we will have to run the loop 3 times in order to sort the array
        int n = arr.length;
        print(arr);
//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
        //Instead of writing the same code for three times, we can use nested loops
       //Bubble Sort
        for(int j =1; j<=n-1; j++) {//n-1 passes
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        print(arr);

    }
}
//Maximum passes will be in the decreasing order i.e, {5,4,3,2,1}
//Sorting a decreasing order array is the worst case
//In 1st pass the maximum element comes at the last.
//In second pass 2nd largest element comes at the second last.
//In 3rd pass 3rd largest element comes at th 3rd last.
//In 4th pass, 4th largest element comes at the 4th last
//If n=5 , then maximum passes will be 4 (n-1)