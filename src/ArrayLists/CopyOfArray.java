package ArrayLists;

import java.util.Arrays;

public class CopyOfArray {
    /*Shallow Copy
    Isme real copy nahi hoti hai kisi bhi array ki bas ek doosra name de diya jaata  hai array ko
    Jo changes hum shallow copy me karte hain wo original  array me bhi reflect hite hain
    */
    /*Deep Copy
    Yaha par real copy hoti hai kisi bhi array ki
    Changes that are made in the Deep Copy does not gets reflected iin the original array
    There are two methods of making Deep Copy:-
    a. Using Built-In Methods
    b. By using Loops..(Each element gets copied one by one)
    */
    public static void main(String[] args) {
    int[] arr ={30, 10, 40, 23, 89, 34};
    for(int ele:arr){
        System.out.print(ele+ " ");
    }
        System.out.println();
//    int[] nums =arr; //Shallow Copy - Memory ke andar koi naya array nahi banta
//        nums[0]  =70;//arr or nums ek hi array hote hain
//        System.out.print(arr[0]);
//    for(int i =0; i<nums.length; i++){
//        System.out.print(nums[i]+ " ");
//    }
     //Deep Copy Method 1
     int[] brr= Arrays.copyOf(arr, arr.length);
     brr[0] = 70;
        System.out.println(arr[0]); //yaha par arr[0] = 30 hi aaega
    //Deep Copy Method 2
        int[] crr = new int[arr.length];//new array crr of length of original Array
        for(int i=0; i<arr.length; i++) {
            crr[i] = arr[i];
            System.out.print(crr[i] + " ");
        }
        System.out.println();
        crr[0] =100;
        System.out.println(arr[0]);
        System.out.println(crr[0]);
    }
}
