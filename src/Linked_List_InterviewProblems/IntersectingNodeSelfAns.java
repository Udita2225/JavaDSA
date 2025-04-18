package Linked_List_InterviewProblems;

public class IntersectingNodeSelfAns {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static int size(Node head) {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
    public static Node Intersect(Node head1, Node head2) {
        int m = size(head1);
        int n = size(head2);
        Node temp1 = head1;
        Node temp2 = head2;
        if (m > n) {
            for (int i = 1; i <= m - n; i++) {
                temp1 = temp1.next;
            }
        } else  {
            for (int i = 1; i <= n - m; i++) {
                temp2 = temp2.next;
            }}
        while(temp1 != null && temp2 != null){
            if(temp1==temp2) return temp1;
            temp1 =temp1.next;
            temp2 =temp2.next;
        }
        return null; //No intersection
    }
    public static void main(String[] args) {
        Node a = new Node(87);
        Node b = new Node(100);
        Node c = new Node(13);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(12);
        Node g = new Node(10);
        Node A = new Node(90);
        Node B = new Node(9);
        Node C = new Node(5);
        Node D = new Node(12);
        Node E = new Node(10);
       a.next =b;
       b.next =c;
       c.next =d;
       d.next =e;
       e.next =f;
       f.next =g;
       A.next =B;
       B.next =e;
       Node q = Intersect(a,A);
       System.out.println(q.data);

    }

}
