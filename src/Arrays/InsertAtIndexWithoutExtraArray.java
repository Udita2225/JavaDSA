//package Arrays;
//import java.util.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Arrays;
//public class InsertAtIndexWithoutExtraArray {
//    public static void print(int[] arr){
//        int n = arr.length;
//        System.out.print(Arrays.toString(arr));
//        System.out.println();
//    }
//    public static void insertAtIndex(int[] arr ,int x,int pos){
//      print(arr);
//      List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//      list.add(pos-1, x);
//      arr = list.toArray(arr);
//      print(arr);
//    }
//    public static void main(String[] args) {
//    int[] arr = {1,2,3,4,5};
//    print(arr);
//    insertAtIndex(arr, 8, 3);
//    }
//}
