package Arrays;
import java.util.Scanner;

public class RotateTheARRAYByUsingExtraARRAY {
    public static void main(String[] args) {
        //Rotate the given array 'a' by k steps where k is non-negative
        //By using extra array
        Scanner sc =new Scanner(System.in);
        int[] a ={10,20,30,40,50,60,70};
        int n =a.length;
        for(int i =0; i<n; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        int k = sc.nextInt();
         k = k%n;
         int[] b = new int[n];
         for(int i =n-k; i<n; i++){
             b[i-(n-k)] =a[i];
         }
         for(int i =0; i<=n-k-1; i++) {
             b[i+k] = a[i];//This process helps us to avoid overlapping
         }
         for(int i =0; i<n; i++){
             a[i] = b[i];
             System.out.print(a[i]+" ");
         }
    }
}
