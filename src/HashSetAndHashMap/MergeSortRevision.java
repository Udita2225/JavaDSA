package HashSetAndHashMap;

public class MergeSortRevision {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] arr){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }
        while(i<a.length) arr[k++]=a[i++];
        while(j<b.length) arr[k++]=b[j++];
    }
    public static void mergeSort(int[] arr){
        int n=arr.length;
        if(n==1) return;
        //Create Two arrays of n/2 size each
        int[] a= new int[n/2];
        int[] b= new int[n-n/2];
        //Copy Pasting
        for(int i=0; i<n/2; i++) a[i] = arr[i];
        for(int i=0; i<n-n/2; i++)  b[i] = arr[i+n/2];
        //Magic
        mergeSort(a);
        mergeSort(b);
        //Merge Two Sorted Array
        merge(a,b,arr);
        //Delete a and b
        //It is done to improve Space Complexity
        a = null;
        b =null;
    }
    public static void main(String[] args) {
        int[] arr = {88, 30, 50, 20, 60, 10, 70, 40};
        print(arr);
        mergeSort(arr);
        print(arr);
    }
}