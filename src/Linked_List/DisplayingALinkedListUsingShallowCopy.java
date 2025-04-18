package Linked_List;

public class DisplayingALinkedListUsingShallowCopy {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        /*
        Node temp = a;
        System.out.println(temp.val);
        temp = temp.next;
        System.out.println(temp.val);
        */
        Node temp =a;
            /*
            for(int i =1; i<=5; i++){
            System.out.println(temp.val);
            temp = temp.next; //temp ko aage badhane ke liye}
            */
           //When we don't know the length of Linked_List then we will use the following
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }

    }
}
