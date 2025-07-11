package Heaps1;

import java.util.Collections;
import java.util.PriorityQueue;

public class BasicHeapCollectionFramework {
    public static void main(String[] args) {
        //MinHeap
        //First element hamesha sabse smallest element hota hai
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        System.out.println(pq+" "+pq.peek());//[2] 2
        pq.add(10);
        System.out.println(pq+" "+pq.peek());//[2, 10] 2
        pq.add(1);
        System.out.println(pq+" "+pq.peek());//[1, 10, 2] 1
        pq.remove();//pq.poll() can also be used
        System.out.println(pq+" "+pq.peek());//[2, 10] 2
        pq.add(0);
        System.out.println(pq+" "+pq.peek());//[0, 10, 2] 0
        pq.add(-34);
        System.out.println(pq+" "+pq.peek());//[-34, 0, 2, 10] -34

        //MaxHeap
        //First element hamesha sabse maximum element hota hai
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
        PQ.add(2);
        System.out.println(PQ+" "+PQ.peek());//[2] 2
        PQ.add(10);
        System.out.println(PQ+" "+PQ.peek());//[10, 2] 10
        PQ.add(1);
        System.out.println(PQ+" "+PQ.peek());//[10, 2, 1] 10
        PQ.remove();
        System.out.println(PQ+" "+PQ.peek());//[2, 1] 2
        PQ.add(0);
        System.out.println(PQ+" "+PQ.peek());//[2, 1, 0] 2
        PQ.add(-34);
        System.out.println(PQ+" "+PQ.peek());//[2, 1, 0, -34] 2
    }
}
