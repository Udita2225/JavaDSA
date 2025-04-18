package Linked_List_InterviewProblems;
public class MiddleElementInterviewMethod {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node Middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next !=null && fast.next.next !=null){
            //When even number of nodes are present in the Linked List and left middle node is to be returned.
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(8);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        Node g = new Node(15);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Node mid = Middle(a);
        System.out.println(mid.data);
    }
}
