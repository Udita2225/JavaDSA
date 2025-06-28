package HashSetAndHashMap;

import java.util.Scanner;

public class BinarySearchRevision {
    public static void main(String[] args) {
    int[] arr = {10,23,46,89,91,97,107,140,264};
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    int n = arr.length;
    int lo =0, hi=n-1;
    boolean flag=false;
    while(lo<=hi){
        int mid = (lo+hi)/2;
        if(arr[mid]<target) lo =mid+1;
        else if(arr[mid]>target) hi=mid-1;
        else if(arr[mid]==target){
            flag = true;
            break;
        }
    }
    if(flag==false) System.out.println("False");
    else System.out.println("True");
    }
}
