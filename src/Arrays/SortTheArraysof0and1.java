package Arrays;

public class SortTheArraysof0and1 {
    //Method 1:- Array.sort(arr);
    /*
    Method 2:-a) int NOofZeros =0; NoofOnes = 0;
              b) Calculate no. of 0's and 1's;
              c) Update the array with 0's and 1's
 */
    public static void main(String[] args) {
        int[] arr ={1,0,0,1,1,0,0,0,1,0};
        int n = arr.length;
        int noOfZeros =0, noOfOnes =0;
        for(int i =0; i<n; i++){
            if(arr[i]==0) noOfZeros++;
            else noOfOnes++;
        }
        for(int i =0; i<noOfZeros; i++){
            arr[i] =0;
        }
        for(int i =noOfZeros; i<n; i++){
            arr[i] =1;
        }
        /*
       for(int i =0; i<n; i++){
        if(i<noOfZeros) arr[i]=0;
        else arr[i] =0;*/
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}
