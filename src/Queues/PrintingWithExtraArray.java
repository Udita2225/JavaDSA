package Queues;
import java.util.*;
public class PrintingWithExtraArray {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int[] arr = new int[q.size()];
        int i=0;
        System.out.print("[");
        while(q.size()>1){
            System.out.print(q.peek()+ ","+" ");
            arr[i] = q.peek();
            q.remove();
            i++;
        }
        System.out.println(q.peek()+"]");
        arr[arr.length-1]=q.peek();
        q.remove();
        int j=0;
        while(j<arr.length){
            q.add(arr[j]);
            j++;
        }
        System.out.println(q);
    }
}
