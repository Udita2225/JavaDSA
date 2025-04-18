package Linked_List_InterviewProblems;

public class OneTraversalMethod {
    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data =data;
        }
    }
    public static Node nthNodefromLast(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i =1; i<=n; i++){
            fast =fast.next;
        }
        while(fast!=null){
            slow =slow.next;
            fast =fast.next;
        }
        return slow;//After the loop slow apni sahi position par aa jayega
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;
        e.next =f;
        Node q = nthNodefromLast(a,2);
        System.out.println(q.data);

    }
}
