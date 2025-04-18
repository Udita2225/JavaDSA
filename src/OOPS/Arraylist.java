package OOPS;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr =  new ArrayList<>(4);
        //The size of arraylist grows dynamically.
        System.out.println(arr.size());
        arr.add(1);
        arr.add(2);
        arr.add(9);
        arr.add(3);
        arr.add(5);
        System.out.println(arr.size());
        System.out.println(arr);
    }
}
