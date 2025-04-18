package DoublyLinkedList;
import  java.util.ArrayList;
public class CriticalPointMaxAndMinDistance {
    public static class Node{
        int val;
        Node prev;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static int[] CriticalPoints(Node head) {
        if (head == null || head.next == null || head.next.next == null) return new int[]{-1, -1};
        ArrayList<Integer> ans = new ArrayList<>();
        Node temp =head.next;
        int index =1;
        int min =Integer.MAX_VALUE;
        while(temp.next != null){
            if((temp.val >temp.next.val && temp.val>temp.prev.val) || (temp.val<temp.next.val && temp.val<temp.prev.val))
            {
                ans.add(index);
                System.out.println("Critical point found : " + index);
            }
            temp =temp.next;
            index++;
        }
        if(ans.size()<2) return new int[]{-1,-1};
        int max = ans.get(ans.size()-1)-ans.get(0);
        System.out.println("Max Distance: " + max);
            for (int i = 0; i < ans.size()-1; i++) {
                int diff = ans.get(i+1) - ans.get(i);
                min = Math.min(min, diff);
                System.out.println("Distance between: "+ ans.get(i)+ " & " +ans.get(i+1)+ " is  " + diff );
            }
        System.out.println("Minimum Distance: " + min);
        return new int[]{min, max};
    }
    public static void main(String[] args){
        Node a =new Node(1);
        Node b =new Node(2);
        Node c =new Node(5);
        Node d =new Node(3);
        Node e =new Node(2);
        Node f =new Node(7);
        Node g =new Node(8);
        Node h =new Node(7);
        Node i =new Node(1);
        Node j =new Node(10);
        a.prev =null;
        a.next =b;
        b.prev =a;
        b.next =c;
        c.prev =b;
        c.next =d;
        d.prev =c;
        d.next =e;
        e.prev =d;
        e.next =f;
        f.prev =e;
        f.next =g;
        g.prev =f;
        g.next =h;
        h.prev =g;
        h.next =i;
        i.prev =h;
        i.next =j;
        j.prev =i;
        j.next =null;
        int[] ans =CriticalPoints(a);
        System.out.println("Minimum Distance: " + ans[0]);
        System.out.println("Maximum Distance: " + ans[1]);
    }
}
