package Linked_List;

public class LengthMethod {
    public static int length(Node head){
        int count =0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(10);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(100);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(length(a));
    }
}
