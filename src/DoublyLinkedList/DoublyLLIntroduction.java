package DoublyLinkedList;

public class DoublyLLIntroduction {
    public static class Node{
        int val;
        Node next;//By Default null
        Node prev;//null
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp =temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node random){//Ek random node ki help se hume starting se lekar end tak puri LinkedList print karni hai
        Node temp = random;
        //Move this temp backwards to the head
        while(temp.prev != null){
            temp =temp.prev;
        }
        //Now temp is at head;
        //Print the list
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp =temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //4 10 2 99 13
        Node a =new Node(4);
        Node b =new Node(10);
        Node c =new Node(2);
        Node d =new Node(99);
        Node e =new Node(13);
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
        display(a);
        displayrev(e);
        display2(c);
    }
}
