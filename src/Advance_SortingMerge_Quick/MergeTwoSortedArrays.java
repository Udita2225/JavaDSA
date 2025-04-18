package Advance_SortingMerge_Quick;

public class MergeTwoSortedArrays {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] merged) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                merged[k++] = a[i++];//c[k++] =a[i++] This is a shortcut for these three lines
                //i++;
                // k++;
            } else {
                merged[k++] = b[j++]; //merged[k++] = b[j++];
                //j++;
                //k++;
            }
            //k++;
             }
            while(j<b.length) merged[k++] = b[j++];
            while(i<a.length) merged[k++] =a[i++];
    }
    public static void main(String[] args) {
   //Merge Two Sorted Arrays
   int[] a = {10,30,50,60,80,90};
   int[] b = {21,42,72,78};
   print(a);
   print(b);
   int[] merged = new int[a.length + b.length];
   merge(a,b,merged);
   print(merged);
    }
}
