package DoublyLinkedList;
public  class InsertionInDLL {
    public static class Node{
        Node prev;
        int val;
        Node next;
        Node(int val){
            this.val =val;
        }
    }
    public static Node insertAtHead(Node head, int x){
        Node temp = new Node(x);
        temp.next =head;
        head.prev=temp;
        head =temp;
        return head;
    }
    public static void insertAtTail(Node head, int val){
        Node temp =head;
        //temp ko tail tak lekar jayenge
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(val);
        temp.next= t;
        t.prev = temp;
    }
    public static void insertAtIndex(Node head, int idx, int val){
        Node s = head;
        for(int i =0; i<idx-1; i++){
            s =s.next;
        }
        //s is at idx-1 position
        Node r =s.next;//idx
        Node t =new Node(val);
        // s t r
        s.next = t;
        t.prev =s;
        t.next =r;
        r.prev =t;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp =temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev =null;
        a.next =b;
        b.prev =a;
        b.next =c;
        c.prev =b;
        c.next =d;
        d.prev =c;
        d.next =e;
        e.prev =d;
        e.next =null;
        Node newHead = insertAtHead(a,35);
        display(newHead);
        insertAtTail(a,48);
        display(newHead);
        insertAtIndex(newHead,3,56);
        display(newHead);
    }
}
