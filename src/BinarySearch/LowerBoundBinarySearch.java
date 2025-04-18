package BinarySearch;
import java.util.*;
public class LowerBoundBinarySearch {
    //Given a sorted integer array andd an integer 'x', find the upper bound of x.
    public static void main(String[] args) {
        int[] arr = {10,23,46,46,91,97,97,140,264};
        int n=arr.length;
        int target =46;
        int lb = n;
        int low =0, high =n-1;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(arr[mid]>=target){
                lb = Math.min(lb, mid);
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println("LowerBound = " +lb);//lb = 2
    }
}
