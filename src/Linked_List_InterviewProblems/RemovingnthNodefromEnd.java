package Linked_List_InterviewProblems;
//In one traversal
public class RemovingnthNodefromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
        }
    }
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp =temp.next;
        }
        System.out.println();
    }
    public static Node nthfromEnd(Node head, int n){
        Node fast =head;
        Node slow =head;
        for(int i=0 ; i<=n; i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow =slow.next;
            fast =fast.next;
        }
        return slow;
        }
    public static void deleteNthNodefromEnd(Node head , int n){
       Node fast =head;
       Node slow =head;
       for(int i =1; i<=n; i++){
           fast =fast.next;
       }
       if(fast==null){
           head =head.next;
           print(head);
           return;
       }
       while(fast.next != null){
           slow =slow.next;
           fast = fast.next;
       }
       slow.next = slow.next.next;
       print(head);

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
        Node q =nthfromEnd(a,1);
      //  print(a);
         deleteNthNodefromEnd(a,6);
       // print(a);
        /*
        OUTPUT
        100 13 4 5 12 10
        100 13 4 5 12
        100 13 4 5 12
        But Deleting 1st node from starting or last node from end will give an error.
         */
    }
}
