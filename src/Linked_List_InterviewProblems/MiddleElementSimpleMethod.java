package Linked_List_InterviewProblems;
//SIMPLE METHOD
public class MiddleElementSimpleMethod {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node Middle(Node head){
        Node temp = head;
        int length =0;
        while(temp!= null){
            length++;
            temp =temp.next;
        }
        if(length%2==0){
            temp =head;
            for(int i =1; i<=(length/2)-1 ; i++){
                temp =temp.next;
            }
        }
        else{
            temp =head;
            int size = length/2;
            for(int i =1; i<=size; i++){
                temp =temp.next;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Node a =new Node(100);
        Node b =new Node(13);
        Node c =new Node(4);
        Node d =new Node(5);
        Node e =new Node(12);
       // Node f =new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
       // e.next = f;
        Node mid =Middle(a);
        System.out.println(mid.data);
    }
}
