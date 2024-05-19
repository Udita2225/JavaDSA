package Arrays;

public class DutchFlagThreePointerMethod {

//    public void swap(int[] arr, int x, int y) {
//        int temp = arr[x];
//        arr[x] = arr[y];
//        arr[y] = temp;
//    }

    public static void main(String[] args) {
        //Sort the array of 0's, 1's and 2's
        //DUTCH FLAG METHOD/3-POINTER APPROACH(low, mid ,high)
        //Two POINTER (i= low j=high)
        /*This is 3-pointer approach (low, mid, high)
        Step 1 - Break ARRAY into 4 parts;
        INDEX NUMBER
        0-(low-1)    contains 0
        low-(mid-1)  contains 1
        mid -high    contains unsorted part(This is imp portion)
      (high+1)-(n-1) contains 2
      //Low ke pehle saare 0 hone chahiye
      //Mid ke pehle saare 1 hone chahiye
      //High ke baad saare 2 hone chahiye
*/
        //Method 2:DUTCH FLAG ALGORITHM:-
        int[] arr = {0, 1, 2, 1, 1, 0, 2, 1, 1, 0, 0};
        int n = arr.length;
        int mid = 0, hi = n - 1, lo = 0;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {//arr[mid] ==2
//                swap(arr, mid, hi);
                int temp = arr[mid];
                arr[mid] = arr[hi];
                    arr[hi] = temp;
                    hi--;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }



