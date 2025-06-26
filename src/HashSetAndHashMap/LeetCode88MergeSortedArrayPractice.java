package HashSetAndHashMap;

public class LeetCode88MergeSortedArrayPractice {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }
    public static void main(String[] args) {
        int[] a ={10,30,50,60,80,90};
        int[] b ={21,42,72,78};
        print(a);
        print(b);
        int[] c = new int[a.length+b.length];
        merge(a,b,c);
        print(c);
    }
/*LeetCode 88
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] ans = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Compare elements from nums1 and nums2 using actual counts m and n
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                ans[k++] = nums1[i++];
            } else {
                ans[k++] = nums2[j++];
            }
        }

        // Copy remaining elements
        while (i < m) {
            ans[k++] = nums1[i++];
        }
        while (j < n) {
            ans[k++] = nums2[j++];
        }

        // Copy merged result back to nums1
        for (int t = 0; t < m + n; t++) {
            nums1[t] = ans[t];
        }
    }
}
/*
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m + n];
        int i = m - 1, j = n - 1, k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                ans[k--] = nums1[i--];
            } else {
                ans[k--] = nums2[j--];
            }
        }

        while (i >= 0) {
            ans[k--] = nums1[i--];
        }

        while (j >= 0) {
            ans[k--] = nums2[j--];
        }

        // Copy back to nums1
        for (int t = 0; t < m + n; t++) {
            nums1[t] = ans[t];
        }
    }
}
*/

}
