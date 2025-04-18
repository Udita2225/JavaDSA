package Linked_List_InterviewProblems;

public class LeetCode234PalindromeLinkedListM2 {
//By using Left Middle Element and Reversing the Linked List after Middle
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val =val;
        }
}
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +" ");
            temp =temp.next;
        }
        System.out.println();
    }
    public static Node mid(Node head){
        Node slow =head;
        Node fast =head;
        while(fast.next!=null && fast.next.next!=null){
            slow= slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node reverse(Node head){
        Node curr= head;
        Node prev= null;
        Node after= null;
        while(curr!=null){
            after =curr.next;
            curr.next = prev;
            prev =curr;
            curr =after;
        }
        return prev;
    }
    public static boolean isPalindrome(Node head , Node rev){
        Node p1 = head;
        Node p2 = rev;
        while(p2!=null){
            if(p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(1);
        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;
        e.next =null;
        display(a);
        Node mid =mid(a);
        Node rev =reverse(mid.next);
        boolean ans = isPalindrome(a, rev);
        System.out.println(ans);
        mid.next = rev;
        display(a);
    }
}
//OUTPUT
/*
1 2 3 4 1
false
1 2 3 1 4

Process finished with exit code 0

*/
//LEETCODE SOLUTION
/*
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
    public ListNode reverse(ListNode head){
        ListNode prev =null;
        ListNode after =null;
        ListNode curr =head;
        while(curr!=null){
            after = curr.next;
            curr.next =prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next !=null){
            slow =slow.next;
            fast =fast.next.next;
        }
        ListNode temp = reverse(slow.next);
        slow.next = temp;
        ListNode p1 =head;
        ListNode p2 =slow.next;
        while(p2!=null){
            if(p1.val != p2.val) return false;
            p1 =p1.next;
            p2 =p2.next;
        }
        return true;
    }
}
*/