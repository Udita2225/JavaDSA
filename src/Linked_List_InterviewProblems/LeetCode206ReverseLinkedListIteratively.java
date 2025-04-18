package Linked_List_InterviewProblems;

public class LeetCode206ReverseLinkedListIteratively {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        if(temp==null) return;
        System.out.print(temp.val + " ");
        display(temp.next);
    }
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node after = null;
        while(curr != null || after!=null){
            after =curr.next;
            curr.next =prev;
            prev = curr;
            curr =after;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        display(a);
        System.out.println();
        Node r = reverse(a);
        display(r);
    }
}
