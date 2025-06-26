package HashSetAndHashMap;

public class LeetCode206ReverseLLPractice {
/*
/* Recursive
class Solution {
    public ListNode reverseList(ListNode head) {
    if(head==null || head.next==null) return head;
    ListNode a = head.next;
    ListNode newHead =  reverseList(a);
    a.next=head;
    head.next=null;
    return newHead;
    }
}
Iterative Much Better Code
class Solution {
    public ListNode reverseList(ListNode head) {
    ListNode prev =null;
    ListNode curr =head;
    ListNode Next =curr;
    while(curr!=null){
        Next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = Next;
    }
    return prev;
    }
}
 */
}
