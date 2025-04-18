package Linked_List_InterviewProblems;

public class ReversalOfLinkedListUsingSwapping {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val =val;
        }
    }
    public static void display(Node head){
        Node temp =head;
        while(temp!=null) {
            System.out.print(temp.val + " ");
            temp =temp.next;
        }
        System.out.println();
    }
    public static void swap(Node head){
        Node temp = head;
        Node i = head;
        int size =0;
        while(temp!=null){
            temp =temp.next;
            size++;
        }
        Node j =head;
        for(int k=0; k<size-1; k++){
            j =j.next;
        }
        for(int k=0; k<size/2; k++){
           Node temp1 = new Node(0);
           temp1.val =i.val;
           i.val =j.val;
           j.val =temp1.val;
           i = i.next;
           j =head;
           for(int m=0; m< size-k-2; m++){
               j =j.next;
           }
        }
    }
    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(15);
        Node c = new Node(13);
        Node d = new Node(18);
        Node e = new Node(17);
        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;
        e.next =null;
        display(a);
        swap(a);
        display(a);
    }
}
/*
12 15 13 18 17
17 18 13 15 12
*/