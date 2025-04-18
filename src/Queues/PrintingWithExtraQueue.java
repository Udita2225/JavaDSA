package Queues;
import java.util.*;
public class PrintingWithExtraQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> helper = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(q.size()!=0){
            System.out.print(q.peek()+" ");
            //helper.add(q.peek());
            //q.remove();
            helper.add(q.remove());
        }
        System.out.println();
        while(helper.size()!=0){
            q.add(helper.remove());
        }
    }
}
