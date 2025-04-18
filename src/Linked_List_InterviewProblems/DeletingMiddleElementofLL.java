package Linked_List_InterviewProblems;

public class DeletingMiddleElementofLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
        }
        //For the deletion of Right Middle Node
        public static void DeleteMiddle(Node head){
            if(head.next==null) return; //This line is for single node LinkedList
            Node slow = head;
            Node fast = head;
            while(fast.next.next != null && fast.next.next.next !=null){
                slow = slow.next;
                fast =fast.next.next;
            }
            slow.next =slow.next.next;
        }
        //For the deletion of Left Middle Node
        public static void DeleteLeftMiddle(Node head){
            if(head.next ==null) return;
            Node slow = head;
            Node fast = head;
            while(fast.next.next.next!=null && fast.next.next.next.next != null){
                fast =fast.next.next;
                slow =slow.next;
            }
            slow.next = slow.next.next;
        }
        public static void print(Node head){
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp =temp.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Node a = new Node(1);
            Node b = new Node(20);
            Node c = new Node(100);
            Node d = new Node(56);
            Node e = new Node(32);
            Node f = new Node(66);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            print(a);
            DeleteMiddle(a);
            print(a);
            DeleteLeftMiddle(a);
            print(a);
        }
    }
}
