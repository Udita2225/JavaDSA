package DoublyLinkedList;
public class TwoSumInaDLL {
    public static class Node{
        int val;
        Node prev;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void ifPresent(Node head, int target){
        Node h= head;
        Node t= head;
        while(t.next!=null){
            t = t.next;
        }
        while(h.val<t.val){
            if(h.val + t.val == target){
                System.out.println(h.val + " " + t.val + " ");
                break;
            }
            else if(h.val + t.val > target ){
                t= t.prev;
            }
            else if(h.val + t.val < target){
                h= h.next;
            }
        }
    }
    public static void main(String[] args) {
        Node a =new Node(3);
        Node b =new Node(5);
        Node c =new Node(8);
        Node d =new Node(13);
        Node e =new Node(100);
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
        ifPresent(a,88);
    }
}
