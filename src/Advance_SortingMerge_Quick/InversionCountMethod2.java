package Advance_SortingMerge_Quick;
import java.util.*;
public class InversionCountMethod2 {
    static int count; //Global variable
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void merge(int[] a, int[] b, int[] merged) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {//  '=' is for maintaining stability.
                merged[k++] = a[i++];
            }else {
                count += a.length - i;//extra
                merged[k++] = b[j++];
            }
        }
        while(j<b.length)
        {
            merged[k++] = b[j++];
        }
        while(i<a.length) {
            merged[k++] =a[i++];
        }
    }
    public static void mergesort(int[] arr){
        int n = arr.length;
        if(n==1) return; //base case
        //create two arrays of n/2 size each
        int[] a =new int[n/2];
        int[] b =new int[n-n/2];
        //copy pasting
        for(int i =0; i<n/2; i++){
            a[i]=arr[i];
        }
        for(int i = 0; i<n-n/2; i++){//This is the length of b[i]
            b[i] =arr[i+n/2];
        }
        //magic ->Recursion
        mergesort(a);
        mergesort(b);
        //inversion(a,b);
        //merge these 'a' and 'b'
        merge(a,b,arr);
        //delete a and b to improve space complexity
        a= null;
        b= null;
    }
    public static void main(String[] args) {
        int[] arr = {109,33,89,27,68,10,70};
        print(arr);
        mergesort(arr);
        print(arr);
        System.out.println(count);
    }
}
