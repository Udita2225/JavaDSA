package Advance_SortingMerge_Quick;
/*
Count Inversions
Given an array of integers arr[]. You have to find the Inversion Count of the array.
Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].
Examples:
Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count.
Input: arr[] = [10, 10, 10]
Output: 0
Explanation: As all the elements of array are same, so there is no inversion count.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 104
Expected Complexities
Time Complexity: O(n log n)
Auxiliary Space: O(n)
Company Tags
FlipkartAmazonMicrosoftMakeMyTripAdobeBankBazaarMyntra
*/
public class GFGCountInversions {
/*
class Solution {
    static int count;
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a =  new int[(n+1)/2];
        int[] b =  new int[n/2];
        int idx = 0;
        for(int i=0; i<a.length; i++) a[i] = arr[idx++];
        for(int i=0; i<b.length; i++) b[i] = arr[idx++];
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else {
                count += a.length-i;
                c[k++] = b[j++];
            }
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
    static int inversionCount(int arr[]) {
        // Code Here
        count =0;
        mergeSort(arr);
        return count;
    }
}
/*
class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        // This code will not work beacuse expected time complexity is O(nlogn)
        int n = arr.length;
        int count  = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[i]) count++;
            }
        }
        return count;
    }
}
*/

}
