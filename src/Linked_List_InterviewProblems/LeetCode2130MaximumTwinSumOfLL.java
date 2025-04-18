package Linked_List_InterviewProblems;
/*
LEETCODE 2130
Ques - Find the maximum twin sum of a linked list of even length.
Twin of any node at (i)th index is the node at (n-i-1)th index. Twin sum is the
sum of values of a node and its twin.
*/
public class LeetCode2130MaximumTwinSumOfLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp =temp.next;
        }
        System.out.println();
    }
    public static Node mid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next !=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node after = null;
        while(curr!=null){
            after =curr.next;
            curr.next =prev;
            prev =curr;
            curr =after;
        }
        return prev;
    }
    public static int maxTwin(Node head, Node rev){
        Node p1 =head;
        Node p2 =rev;
        int sum =0;
        int maxSum=Integer.MIN_VALUE;
        while(p2!=null){
            sum = p1.val +p2.val;
             maxSum = Math.max(maxSum, sum);
             p1 = p1.next;
             p2 = p2.next;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Node a =new Node(1);
        Node b =new Node(10);
        Node c =new Node(13);
        Node d =new Node(4);
        Node e =new Node(5);
        Node f =new Node(7);
        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;
        e.next =f;
        f.next =null;
        display(a);
        Node mid = mid(a);
        Node rev = reverse(mid.next);
        mid.next = rev;
        display(a);
        int maxTwin = maxTwin(a, rev);
        System.out.println(maxTwin);
    }
}
/*
LEETCODE SOLUTION
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {
    public ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!= null && fast.next.next!=null){
            slow =slow.next;
            fast =fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode midNext){
        ListNode curr =midNext;
        ListNode prev =null;
        ListNode after =null;
        while(curr!=null){
            after = curr.next;
            curr.next =prev;
            prev = curr;
            curr =after;
        }
        return prev;
    }
    public int maxTwin(ListNode head, ListNode rev){
        ListNode p1 =head;
        ListNode p2 =rev;
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        while( p2!=null){
            sum =p1.val +p2.val;
            maxSum = Math.max(maxSum,sum);
            p1 =p1.next;
            p2 =p2.next;
        }
        return maxSum;
    }
    public int pairSum(ListNode head) {
        ListNode mid =mid(head);
        ListNode rev =reverse(mid.next);
        int maxTwin =maxTwin(head,rev);
        return maxTwin;
    }
}
*/