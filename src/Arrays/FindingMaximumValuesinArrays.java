package Arrays;
import java.util.Scanner;
public class FindingMaximumValuesinArrays {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter array elements");
//        for(int i =0; i<n; i++){
//            arr[i]= sc.nextInt();
//        }
       int[] arr ={19, 8, 43, 12, 5, 56, 3, 99};
       int n = arr.length;
       int mx =arr[0];
       for(int i =1; i<n; i++){//ab zero se nahi 1 se loop chalaenge
           if (arr[i]>mx){
               mx = arr[i];//updating the value
           }
       }
        System.out.println(mx);
    }
}
