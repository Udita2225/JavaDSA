package DoublyLinkedList;

public class DeletionInDLL {
    public static class Node{
        Node prev;
        int val;
        Node next;
        Node(int val){
            this.val =val;
        }
    }
    public static Node deleteAtHead(Node head){
        head =head.next;
        head.prev = null;
        return head;
    }
    public static void deleteAtTail(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp = temp.prev;
        temp.next = temp.next.next;
    }
    public static void deleteAtTailT(Node tail){
        Node temp =tail;
        temp = temp.prev;
        temp.next =temp.next.next;
    }
    public static void deleteAtIndex(Node head, int idx){
        Node temp = head;
        for(int i =0; i<idx-1; i++){
            temp = temp.next;
        }
        temp.next =temp.next.next;
        temp.next.prev =temp;
    }
    public static void display(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val +" ");
            temp =temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(5);
        Node d = new Node(3);
        Node e = new Node(100);
        Node f = new Node(67);
        Node g = new Node(89);
        a.prev = null;
        a.next =b;
        b.prev =a;
        b.next =c;
        c.prev =b;
        c.next =d;
        d.prev =c;
        d.next =e;
        e.prev =d;
        e.next =f;
        f.prev =e;
        f.next =g;
        g.prev =f;
        g.next =null;
        display(a);
        Node NewHead = deleteAtHead(a);
        display(NewHead);
        deleteAtTail(NewHead);
        display(NewHead);
        deleteAtTailT(f);
        display(NewHead);
        deleteAtIndex(NewHead, 2);
        display(NewHead);
    }
}
