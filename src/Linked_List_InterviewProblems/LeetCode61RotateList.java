package Linked_List_InterviewProblems;
//LEETCODE 61 Rotate List
public class LeetCode61RotateList {
/*
Given the head of a linked list, rotate the list to the right by k places.
Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:
Input: head = [0,1,2], k = 4
Output: [2,0,1]
Constraints:
The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109
*/
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||head.next==null) return head;
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            temp =temp.next;
            n++;
        }
        k %= n;
        if(k==0) return head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1; i<=k; i++){
            fast =fast.next;
        }
        while(fast.next!=null){//fast will be at tail
            slow =slow.next;
            fast =fast.next;
        }
        ListNode newHead =slow.next;
        slow.next =null; //slow is now the new tail;
        fast.next =head;
        return  newHead;
    }
}

*/
}
