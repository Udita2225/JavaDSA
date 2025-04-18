package Linked_List;

public class ShallowCopyOfNode {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node temp =a;
        System.out.println(a.val);//10
        System.out.println(temp.val);//10
        System.out.println(a);//Linked_List.Node@5f184fc6
        System.out.println(temp);//Linked_List.Node@5f184fc6
        temp.val =12;
        System.out.println(a.val); //12
    }
}
