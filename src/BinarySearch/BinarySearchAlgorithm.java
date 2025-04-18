package BinarySearch;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        //The Array must be sorted in order to use Binary Search for Searching.
        //In order to use Binary Search, first of all make two variables low and high
        //low is for index 0 and high is for index n-1
        //No of checks are only 3
        int[] arr = {10, 23, 46, 89, 91, 97, 107, 140, 264};
        int n= arr.length;
        int target =45;
        int low = 0, high = n-1;
        boolean flag = false; // false means not present
        while(low<=high){
            int mid = (low+high)/2;
            //baar baar teeno chize nahi chalani isliye low ko hum sbse last me le gaye
            if(arr[mid]==target){
                flag = true;
                break;
            }
           else if(arr[mid]>target) {
                high = mid - 1;
            }
           else if(arr[mid]<target){
               low = mid+1;
            }
        }
        if(flag==true){
            System.out.println("Target Found");
        }
        else{
            System.out.println("Target Not Found");
        }
    }
}
