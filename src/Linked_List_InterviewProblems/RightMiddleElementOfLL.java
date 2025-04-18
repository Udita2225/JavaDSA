package Linked_List_InterviewProblems;

public class RightMiddleElementOfLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
        }
    }
    public static Node RightMiddle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast =fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(55);
        Node c = new Node(56);
        Node d = new Node(23);
        Node e = new Node(15);
        Node f = new Node(88);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node q = RightMiddle(a);
        System.out.println(q.data);
    }
}
