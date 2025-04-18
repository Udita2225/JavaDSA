package Queues;
import java.util.*;
public class DequeSTL {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        //add , remove/poll, peek/Element, addFirst , addLast , addAll
        //add.Last peeche se add hona
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(1);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq);// 1 2 1 4 5
        dq.addFirst(6);
        dq.addFirst(8);
        System.out.println(dq);// 8 6 1 2 1 4 5
        dq.removeLast();
        System.out.println(dq);// 8 6 1 2 1 4
        dq.removeFirst();
        System.out.println(dq);// 6 1 2 1 4
        System.out.println(dq.getFirst());// 6
        System.out.println(dq.getLast());// 4
        dq.add(7); // Last Add
        System.out.println(dq);//6 1 2 1 4 7
        dq.remove(); // First Remove
        System.out.println(dq);//1 2 1 4 7
       // dq.removeAll(dq); //Removes Everything
        dq.removeFirstOccurrence(1);
        System.out.println(dq);//2 1 4 7
        dq.removeLastOccurrence(1);
        System.out.println(dq);//2 4 7
    }
}
