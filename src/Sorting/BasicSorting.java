package Sorting;

public class BasicSorting {
    public static void main(String[] args) {
        /*
        BUBBLE SORT ALGORITHM
        Ques- Check if given array is sorted Array.
        1) arr ={1,4,7,8,10,12} -Sorted
        2) arr ={1,4,7,6,10,12} -Unsorted
        Any array is said to be sorted
        if arr[i] <= arr[i+1]; for every i
        where i =0,1,2,.........n-2
        if (arr[i]>arr[i+1]) - Unsorted
         */
        int[] arr ={1,7,3,8,9,12};
        int n = arr.length;
        boolean flag =true; //True means Sorted
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                flag = false; //false -> Unsorted
                break;
            }
        }
        if(flag == true){
            System.out.println("SORTED");
        }
        else{
            System.out.println("UNSORTED");
        }
    }
}
