package Linked_List;
class Node{//This class can be accessed in all files of package Linked_List
    int val;//data can also be written in place of val
    Node next;//address of next node
    Node(int val){//Constructor

        this.val = val;
    }
}
public class Linked_ListNodeClass {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(10);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        System.out.println(a); //Linked_List.Node@5f184fc6 Address Of a
        System.out.println(b); //Linked_List.Node@3feba861 Address Of b
        System.out.println(a.val);//10
        System.out.println(b.val);//10
        System.out.println(c.val);//30
        System.out.println(a.next);//null
        System.out.println(b.next);//null
    }
}
