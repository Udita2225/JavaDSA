package Arrays;
import java.util.*;
public class InsertAnElementAtAgivenIndex {
    public static void  print(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] insertAt(int[] arr, int x, int pos){
        int n= arr.length;
        int[] ans = new int[n+1];
        int i;
        for( i =0; i<n-pos; i++){
            ans[i]= arr[i];
        }
        ans[pos-1]= x;
        for( i =pos; i<=n; i++){
            ans[i]= arr[i-1];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={2,3,5, 3, 4};
        print(arr);
        int[] ans = insertAt(arr, 8,3);
        print(ans);
    }
}
