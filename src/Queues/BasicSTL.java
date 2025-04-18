package Queues;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.*;
public class BasicSTL {
    public static void main(String[] args) {
        //Forming Basic Queue
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        //Declaration
        Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> t = new LinkedList<>();
        System.out.println(q.isEmpty());//true
        //Adding Elements
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);// [1, 2, 3, 4, 5]
        q.remove();
        System.out.println(q);// [2, 3, 4, 5]
        q.poll();
        System.out.println(q);// [3, 4, 5]
        System.out.println(q.size());//3
        System.out.println(q.element());// 3
        System.out.println(q.peek());// 3
    }
}
