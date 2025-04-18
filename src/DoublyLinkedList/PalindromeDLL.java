package DoublyLinkedList;
public class PalindromeDLL {
    public static class Node{
        int val;
        Node prev;
        Node next;
        Node(int val){
            this.val =val;
        }
    }
    public static boolean ifPalindrome(Node head){
        Node temp =head;
        while(temp.next!=null){
            temp =temp.next;
        }
        Node tail = temp;
        Node h = head;
        Node t = tail;
        while(h!=t){
            if(h.val!=t.val) return false;
            else{
                h = h.next;
                t = t.prev;
            }
        }
        return true;
    }
    public static void main(String[] args) {
            Node a = new Node(4);
            Node b = new Node(10);
            Node c = new Node(78);
            Node d = new Node(3);
            Node e = new Node(78);
            Node f = new Node(10);
            Node g = new Node(4);
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
            System.out.println(ifPalindrome(a));
    }
}
