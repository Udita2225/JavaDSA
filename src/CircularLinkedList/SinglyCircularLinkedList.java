package CircularLinkedList;

public class SinglyCircularLinkedList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val =val;
        }
    }
    public static void display(Node head){
        Node temp = head.next;
        System.out.print(head.val + " ");
        while(temp!=head){
            System.out.print(temp.val+ " ");
            temp= temp.next;
        }
        System.out.println();
    }
    public static  Node deleteAtHead(Node head){
        Node temp = head.next;
        while(temp.next!=head){
            temp =temp.next;
        }
        temp.next = head.next;
        head = head.next;
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(5);
        Node d = new Node(3);
        Node e = new Node(100);
        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;
        e.next =a;
        display(a);
        System.out.println(e.next.val);
        Node newHead = deleteAtHead(a);
        display(newHead);

    }
}
