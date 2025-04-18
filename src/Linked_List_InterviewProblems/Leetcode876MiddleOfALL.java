package Linked_List_InterviewProblems;
/*
LEETCODE 876. Middle of the Linked List
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
Constraints:
The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100
*/
public class Leetcode876MiddleOfALL {
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
NOT A GOOD SOLUTION

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int len =0;
        while(temp!=null){
            temp =temp.next;
            len++;
        }
        int mid = len/2 +1;
        temp =head;
        for(int i=1; i<=mid-1; i++){
            temp =temp.next;
        }
        return temp;
    }
}
*/
/*
The interviewer will accept this answer only.
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode fast =head;
        ListNode slow =head;
        while(fast!=null && fast.next!null){
            slow =slow.next;
            fast =fast.next.next;
        }
        return slow;
    }
}
*/
}
