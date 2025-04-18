package OOPS;
import java.util.*;
public class MakingOfArrayListUsingClass {
    public static class MyArrayList{
        int[] arr = new int[5];//Jaise hi arr object declare huwa hai waise hi
                              // 5 size ka ek arr create ho jaaye
        int idx = 0;
        int size =0;
        public void add(int ele){
            if(size==arr.length){
                int[] brr = Arrays.copyOf(arr,arr.length*2);
                arr =brr;
            }
            arr[idx]  = ele;
            idx++;
            size++;
        }
        public void set(int idx, int val){
          arr[idx] = val;
        }
        public void printElements(){
            System.out.print("[" + "");
            for(int i =0; i<arr.length; i++){
                System.out.print(arr[i]);
                if(i<arr.length-1){
                    System.out.print(",");
                }
            }
            System.out.print("" + "]");
        }
    }
    public static void main(String[] args) {
       MyArrayList arr = new MyArrayList();
       arr.add(2);
       arr.add(1);
       System.out.println(arr.size);
       arr.add(3);
       System.out.println(arr.size);
       arr.set(0,10);
       System.out.println(arr.size);
       arr.printElements();
    }
}
//Output
/*
2
3
3
[10,1,3,0,0]
 */