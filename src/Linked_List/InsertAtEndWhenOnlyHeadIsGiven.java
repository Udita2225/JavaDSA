package Linked_List;

public class InsertAtEndWhenOnlyHeadIsGiven {
    public static  class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void insertAtEnd(Node head,int val){
       Node temp = new Node(val);
       Node t =head;
       while(t.next != null){
           t = t.next;
       }
       t.next = temp;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;
        insertAtEnd(a,87);
        display(a);
    }
}
