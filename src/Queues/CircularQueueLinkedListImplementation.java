package Queues;

public class CircularQueueLinkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val =val;
        }
    }
    public static class CQLL{
      private Node head = null;
      private Node tail =null;
      private int size =0;
        public void add(int val){
            Node temp = new Node(val);
            if(size==0){
                head=tail=temp;
                tail.next =head;
            }
            else{
                tail.next =temp;
                tail = temp;
                tail.next =head;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!");
            }
            Node temp = head;
            head =head.next;
            tail.next =head;
            size--;
            return temp.val;
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!");
            }
            else return head.val;
        }
        public void display(){
            if(size==0){
                System.out.print("Queue is Empty!");
            }
            else{
            Node temp =head.next;
                System.out.print(head.val + " ");
            while(temp!=head){
                System.out.print(temp.val + " ");
                temp =temp.next;
                }
             }
            System.out.println();
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
    }

    public static void main(String[] args) throws Exception{
        CQLL q = new CQLL();
        q.display();//Queue is Empty
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();//1 2 3 4 5
        q.remove();
        q.display();//2 3 4 5
        System.out.println(q.peek());//2
        System.out.println(q.isEmpty());//false
        q.add(9);
        q.display();//2 3 4 5 9
        System.out.println(q.size);//5
    }
}
