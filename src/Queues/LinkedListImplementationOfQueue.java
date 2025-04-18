package Queues;
import java.util.*;
public class LinkedListImplementationOfQueue {
    public static class Node{//user defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class QueueLL{
        private Node head = null;
        private Node tail = null;
        private int size =0;
         public void add(int val){
            Node temp = new Node(val);
            if(size==0){
                head = temp;
                tail =temp;
            }
            else{
            tail.next = temp;
            tail = temp;
            }
            size++;
         }
         public int peek(){
             if(size==0){
                 System.out.println("Queue is Empty");
                 return -1;
             }
             return head.val;
         }
         public int remove(){
             if(size==0){
                 System.out.println("Queue is Empty");
                 return -1;
             }
             Node temp = head;
             head = head.next;
             size--;
             return temp.val;
         }
         public void display(){
             if(size==0){
                 System.out.println("Queue is Empty");
                 return;
             }
             Node temp = head;
             while(temp!=null){
                 System.out.print(temp.val+ " ");
                 temp =temp.next;
             }
             System.out.println();
         }
         public boolean isEmpty(){
            // if(head==null && tail ==null) return true;
             if(size==0) return true;
             else return false;
         }
    }
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        System.out.println(q.isEmpty());//true
        System.out.println(q.size);//0
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();//1 2 3 4
        System.out.println(q.size);//4
        System.out.println(q.isEmpty());//false
        System.out.println(q.peek());//1
        q.remove();
        System.out.println(q.peek());//2
        System.out.println(q.size);//3
    }
}
