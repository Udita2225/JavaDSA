package Arrays;

public class MergerTwoSortedArrays {
    //merge two sorted arrays into one single sorted array
    public static void main(String[] args) {
        int[] a = {11, 33, 43, 72};
        int[] b = {26, 54, 69, 81,94,98};
        int m = a.length;
        int n = b.length;
        int[] c = new int[m + n];

        int i = 0, j = 0, k = 0;
        //merging
        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;}
        if(i==m){//Now take elements from b only
            while(j<n){
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(j==n){//Now take elements from b only
            while(i<m){
                c[k]=a[i];
                i++;
                k++;
            }
        }
            for (int x : c) {
                System.out.print(x + " ");
            }
        }

    }
