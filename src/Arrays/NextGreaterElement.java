package Arrays;

import java.util.Scanner;

public class NextGreaterElement {
    //Find the next greater element in a given Array
    //It is not necessary that array should be in a sorted way
    //Jo bhi number hai uske aage greatest integer kon sa hai
    //Last element ka koi bhi next greatest integer nahi hoga to usme -1 store kar denge
    public static void main(String[] args) {
        //Brute Force
        //This is very time consuming
       int[] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};
       int n = arr.length;
       int[] ans = new int[n];
       ans[n - 1] = -1;
//        for (int i = 0; i < n - 1; i++) {
//            int max = Integer.MIN_VALUE;
//            for (int j = i + 1; j < n; j++) {
//                max = Math.max(max, arr[j]);
//            }
//            ans[i] = max;
//        }
//        for (int ele : ans) {
//            System.out.print(ele + " ");
//        }
        //Method 2 :OPTIMISED STEP..All work in single loop/single iteration
        int nge =arr[n-1];
        for(int i = n-2; i>=0; i--){
            ans[i]=nge;
            nge = Math.max(nge, arr[i]);
        }
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
        for(int ele : ans){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}

