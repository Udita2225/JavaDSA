package Linked_List;
class Node3{
    int val;
    Node3 next;
    Node3(int val){
        this.val = val;
    }
}
public class DisplayingALinkedList {
    public static void main(String[] args) {
        //5 Nodes and 4 Links
        Node3 a = new Node3(10);//head Node
        Node3 b = new Node3(20);
        Node3 c = new Node3(30);
        Node3 d = new Node3(40);
        Node3 e = new Node3(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        Node3 temp = a;
//        System.out.println(temp);//Linked_List.Node3@5f184fc6
//        System.out.println(a);//Linked_List.Node3@5f184fc6
        Node3 temp = new Node3(10);
        System.out.println(temp);//Linked_List.Node3@5f184fc6
    }
}