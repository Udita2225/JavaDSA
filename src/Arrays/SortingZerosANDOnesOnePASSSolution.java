package Arrays;

public class SortingZerosANDOnesOnePASSSolution {
    public static void main(String[] args) {
      int[] arr ={1,0,0,1,1,0,0,0,1,0};
      int n = arr.length;
      //One Pass Solution
        // Pass = Only One LOOP
    /*
    HINT:
    1. 2 Pointer Approach
    2. Swapping
     */
        int i = 0, j = n - 1;
        while(i<j){
//            if(arr[i]==0) i++;
//            if(arr[j]==1) j--;
//         //   if(i>j) break;
//            if(i<j &&arr[i]==1 && arr[j]==0){
//                arr[i]= 0;
//                arr[j] =1;
//                i++;
//                j--;
                if(arr[i]==0) i++;
                else if(arr[j]==1) j--;
                else if(arr[i]==1 && arr[j]==0){
                    arr[i]= 0;
                    arr[j] =1;
                    i++;
                    j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}