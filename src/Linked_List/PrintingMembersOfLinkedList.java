package Linked_List;
class Node2{
    int val;
    Node2 next;
    Node2(int val){
        this.val = val;
    }
}
public class PrintingMembersOfLinkedList {
    public static void main(String[] args) {
        //5 Nodes and 4 Links
        Node2 a = new Node2(10);
        Node2 b = new Node2(20);
        Node2 c = new Node2(30);
        Node2 d = new Node2(40);
        Node2 e = new Node2(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
      /*  System.out.println(a.val);
        System.out.println(b.val);
        System.out.println(c.val);
        System.out.println(d.val);
        System.out.println(e.val);
       */
        //Printing all elements by only using 'a':-
        //Esi printing tabhi possible hai jab saare elements aapas me link ho
        //Agar ek bhi link toot gayi to esi printing karna possible nahi hoga and it will give error
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);
        /*
        Output
        10
        20
        30
        40
        50
         */
    }
}
