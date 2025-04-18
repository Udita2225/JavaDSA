package Queues;
import java.util.*;
public class ArrayImplementationOfQueue {
    public static class queueArray{
        private int f =-1;
        private int r =-1;
        int size=0;
        private int[] arr = new int[100];
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is Full");
                return;
            }
            if(f==-1){//Queue is currently Empty
                f=r=0;
                arr[r]=val;
            }
            else {
                arr[++r] = val;
//                arr[r+1] = val;
//                r++;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[f];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
           if(size==0){
               System.out.println("Queue is Empty");
           }
           else {
               for (int i = f; i <= r; i++) {
                   System.out.print(arr[i] + " ");
               }
               System.out.println();
           }
        }
    }
    public static void main(String[] args) {
        queueArray q = new queueArray();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();//1 2 3 4 5
        q.remove();
        q.display();//2 3 4 5
        System.out.println(q.peek());//2
        System.out.println(q.size);//3
    }
}
