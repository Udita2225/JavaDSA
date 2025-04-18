package Linked_List_InterviewProblems;

public class LeetCode234PalindromeLinkedListM1 {
//By using duplicate LinkedList
//This is not an optimized code
public static class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public static void display(Node head){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.val + " ");
        temp =temp.next;
    }
    System.out.println();
}
public static Node Duplicate(Node head){
    Node newHead = new Node(head.val);
    Node newTemp = newHead;
    Node temp = head.next;
    while(temp!=null){
        Node newNode = new Node(temp.val);
        temp = temp.next;
        newTemp.next = newNode;
        newTemp = newNode;
    }
    return newHead;
}
public static Node reverse(Node newHead){
    Node temp = newHead;
    if(temp.next==null) return temp;
    if(temp==null) return null;
    Node New = reverse(temp.next);
    temp.next.next =temp;
    temp.next =null;
    return New;
}
public static boolean ifPalindrome(Node head, Node New){
    Node temp = head;
    Node Temp = New;
    while(temp !=null && Temp!=null){
        if(temp.val != Temp.val){
            return false;
        }
        temp =temp.next;
        Temp =Temp.next;
    }
    return true;
}
public static void main(String[] args) {
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(3);
    Node e = new Node(2);
    Node f = new Node(1);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    f.next = null;
    display(a);
    Node newHead = Duplicate(a);
    display(newHead);
    Node New =reverse(newHead);
    display(New);
    boolean ifPalindrome = ifPalindrome(a,New);
    System.out.print(ifPalindrome);
   }
}
/* LEETCODE SOLUTION
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
    //Not an optimized code
    public ListNode Duplicate(ListNode head){
        ListNode Dup = new ListNode(head.val);
        ListNode Temp = Dup;
        ListNode temp =head.next;
        while(temp!=null){
            ListNode newNode =new ListNode(temp.val);
            Temp.next = newNode;
            Temp = newNode;
            temp =temp.next;
        }
        return Dup;
    }
    public ListNode Reverse(ListNode Dup){
        ListNode temp = Dup;
        if(temp.next==null) return temp;
        if(temp==null) return null;
        ListNode rev = Reverse(temp.next);
        temp.next.next = temp;
        temp.next =null;
        return rev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode Dup = Duplicate(head);
        ListNode rev = Reverse(Dup);
        ListNode temp = head;
        ListNode Temp = rev;
        while(temp!= null && Temp!=null){
            if(temp.val != Temp.val){
                return false;
            }
            temp =temp.next;
            Temp =Temp.next;
        }
        return true;
    }
}
*/