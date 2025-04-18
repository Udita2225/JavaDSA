package Arrays;

public class MergeTWOArraysfromthelast {
    //By using Decreasing Format
    public static void main(String[] args) {
        int[] a = {11, 33, 43, 72};
        int[] b = {26, 54, 69, 81,94,98};
        int m = a.length;
        int n = b.length;
        int[] c = new int[m + n];

        int i = m-1, j = n-1, k = n+m-1;
        //merging
        while (i >=0 && j >=0) {
            if (a[i] >= b[j]) {
                c[k] = a[i];
                i--;
            } else {
                c[k] = b[j];
                j--;
            }
            k--;}
        if(i==-1){//Now take elements from b only
            while(j>=0){
                c[k]=b[j];
                j--;
                k--;
            }
        }
        if(j==-1){//Now take elements from b only
            while(i>=0){
                c[k]=a[i];
                i--;
                k--;
            }
        }
        for (int x : c) {
            System.out.print(x + " ");
        }
    }

}
//Output
//11 26 33 43 54 69 72 81 94 98




