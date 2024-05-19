package Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {-10, -8, -430, 12, -5234, -56};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, arr[i]);
        }
        System.out.println(mx);
        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > smx && arr[i] != mx) smx = arr[i];

//            if(arr[i] != mx){
//                smx = Math.max(smx, arr[i]);
//            }
        }
        System.out.println(smx);
        //NOW IF all the elements are same;
        int[] arr2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int m = arr2.length;
        int MAX = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            MAX = Math.max(MAX, arr2[i]);
            index = i;
            //
        }
            System.out.println(MAX);
            System.out.println(index);

         //int[] num = new int[5] = IT SHOWS THE SIZE OF ARRAY NUM
        // arr[5] = 11; = HERE  5 IS PARTICULAR ELEMENT
        //If we assign a value to an element of an array whose subscript exceeds the size of the array , then it will give error message from the compiler
//        int[] ar = new int[6];
//        ar[8] = 5;
        //ArrayINDEXOutOfBoundsExceptio
    }
}