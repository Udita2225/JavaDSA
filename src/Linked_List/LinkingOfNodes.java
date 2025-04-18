package Linked_List;
class Node1{
    int val;
    Node1 next;
    Node1(int val){
        this.val = val;
    }
}
public class LinkingOfNodes {
    public static void main(String[] args) {
        //5 Nodes and 4 Links
        Node1 a = new Node1(10);
        Node1 b = new Node1(20);
        Node1 c = new Node1(30);
        Node1 d = new Node1(40);
        Node1 e = new Node1(50);
        System.out.println(a.next);//null
        a.next = b;//linking of a and b  a->b 10->20 30 40 50
        b.next = c;//10->20->30 40 50
        c.next = d;//10->20->30->40 50
        d.next = e;//10->20->30->40->50
        System.out.println(a);//Linked_List.Node1@5f184fc6
        System.out.println(a.next);//Linked_List.Node1@3feba861
        System.out.println(b);//Linked_List.Node1@3feba861   //Both are same as both are linked

    }
}
