package BinarySearch;
import java.util.*;
public class UpperBoundBinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,23,46,46,91,97,97,140,264};
        int n=arr.length;
        int target =46;
        int ub = n;
        int low =0, high =n-1;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(arr[mid]>target){ //UpperBound me bas ye condition change ho jayegi baaki same hi rahegi
                //Condition arr[integer]>target  (Not equal to)
                ub = Math.min(ub, mid);
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println("UpperBound = " +ub);//ub = 4
    }
}
