package BinaryTrees;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class ImplementationNodeOfTree {
    public static void main(String[] args) {
     Node a = new Node(1); //a is the root
     Node b = new Node(4);
     Node c = new Node(3);
     Node d = new Node(2);
     Node e = new Node(6);
     Node f = new Node(5);
     a.left = b; a.right =c;
     b.left = d; b.right =e;
     c.right =f;

     e.val = 55; //Updation Of the Node Value
     a.left.right.val = 88; //e updation via a
        // e.val = 88
        System.out.println(b.val);//4
        System.out.println(a.left.val);//4
        System.out.println(a.left.right.val);//e = 88
        System.out.println(e.val);//88
        System.out.println(a.left.right);//Trees.Node@5f184fc6
        System.out.println(e);//Trees.Node@5f184fc6
    }
}
