package Heaps;

import java.util.PriorityQueue;

public class KthSmallestElementUsingMinHeap {
    public static void main(String[] args) {
        int[] arr = {10,2,8,-6,-2,9,-12};
        int k=2;
        //MinHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele: arr){
           pq.add(ele);
        }
        for(int i=1; i<=k-1; i++){
            pq.remove();
        }
        System.out.println(pq.peek());//-6
    }
}
