package Advance_SortingMerge_Quick;
import java.util.*;
public class kthSmallestElementQuickSort {
    static int ans;
    public static void print(int[] arr){
        for(int ele :arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int lo, int hi){
        int pivot = arr[lo];//pIdx ->pivot index
        int pivotIndex = lo;
        int smallerCount =0;
        for(int i= lo+1; i<=hi; i++){
            if(arr[i]<=pivot) smallerCount++;
        }
        int correctIndex = pivotIndex + smallerCount;
        //swap arr[pIdx]  arr[correctIndex]
        swap(arr,pivotIndex, correctIndex);
        //partition
        int i=lo;
        int j=hi;
        while(i<correctIndex && j>correctIndex){
            if(arr[i]<pivot) i++;
            else if(arr[j] >pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctIndex;
    }
    public static void  quickSelect(int[] arr, int lo, int hi, int k){
        if(lo>hi) return;
        if(lo==hi){
            if(lo==k-1){
                ans = arr[lo];
                return;
            }}
        //pivot (arr[lo] ko sahi jagah rakho
        //& left part me <=pivot
        int idx =  partition(arr, lo, hi);//calling and taking the index value
        if(idx==k-1){
            ans = arr[idx];
            return;
        }
        if(k-1<idx){
            quickSelect(arr, lo, idx-1,k);
        }
        else {
            quickSelect(arr, idx + 1, hi, k);
        }
    }
    public static void main(String[] args) {
        int[] arr ={4,9,1,2,6,5,8};
        int n = arr.length;
        print(arr);
        int k=7;
        ans=-1;
        quickSelect(arr,0,n-1,k);
        System.out.println(ans);
    }
}
