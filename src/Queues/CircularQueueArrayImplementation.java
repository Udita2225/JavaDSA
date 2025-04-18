package Queues;
import java.util.*;
public class CircularQueueArrayImplementation {
    public static class CQA{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];
        int n = arr.length;
        public void add(int val) throws Exception{
            if(size==n){
                throw new Exception("Queue is Full!");
//                System.out.println(("Queue is full!"));
//                return;
            }
            else if(size==0){
                front =0;
                rear = 0;
                arr[0] = val;
            }
            else if(rear<n-1){//Normal Case
                arr[++rear]=val;
            }
            else if(rear==n-1){
                rear =0;
                arr[0]= val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!");
//                System.out.println("Queue is Empty!");
//                return -1;
            }
            else{
                int val = arr[front];
                if(front==n-1)  front =0;
                else front++;
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty !");
            }
            else return arr[front];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty! ");
                return;
            }
            if(front<=rear){
                for(int i= front; i<=rear; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            else if(rear<front){
                for(int i=front ; i<=n-1; i++){
                    System.out.print(arr[i]+ " ");
                }
                for(int i=0; i<=rear; i++){
                    System.out.print(arr[i]+ " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        CQA q = new CQA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();//1 2 3 4 5
        q.remove();
        q.display();//2 3 4 5
        q.add(6);
//        q.add(7);
//        q.add(8);
        q.remove();
        q.display();//3 4 5 6
        for(int i=0; i<q.arr.length; i++){
            System.out.print(q.arr[i]+ " ");//6 2 3 4 5
        }
    }
}
