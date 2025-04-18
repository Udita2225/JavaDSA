package Linked_List_InterviewProblems;

public class LeetCode206ReverseLinkedListRecursively {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        if(head==null) return;
        Node temp =head;
        System.out.print(temp.val + " ");
        display(temp.next);
    }

/*    public static void reversedisplay(Node head){
        //We can print the reverse values of the LinkedList but we need the reverse the connection between the nodes of
        // LinkedList in reality.Customize Toolbar...
        if(head==null) return;
        Node temp =head;
        if(temp.next==null) return;
        reversedisplay(temp.next);
        System.out.print(temp.val + " ");
    }
 */
    public static Node reverse(Node head){
        Node temp= head;
        if(temp.next==null) return temp;
        Node newHead = reverse(temp.next);
        temp.next.next =temp;//Interchanging the connections
        temp.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(8);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        display(a);
        System.out.println();
//      reversedisplay(a);
         a = reverse(a);
        display(a);
    }
}
/*
3 5 1 8 4
4 8 1 5 3
*/