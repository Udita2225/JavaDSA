package Linked_List_InterviewProblems;
/*
LeetCode 19. Remove Nth Node From End of List
Given the head of a linked list, remove the nth
node from the end of the list and return its head.
Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:
Input: head = [1], n = 1
Output: []
Example 3:
Input: head = [1,2], n = 1
Output: [1]
Constraints:
The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
Follow up: Could you do this in one pass?
*/
public class LeetCode19RemoveNthNodeFromEndOfList {
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size =0;
        ListNode temp =head;
        while(temp!=null){
            temp =temp.next;
            size++;
        }
        //Edge
        if(size==n) return head.next;
        temp =head;
        for(int i=0; i<size-n-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
Better Method
Slow Fast Pointer
In this method we don't need to find the length of Linked List
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast =head;
        ListNode slow =head;
        //Move fast n steps ahead;
          for(int i =0; i<n; i++){
                fast =fast.next;
            }
          if(fast==null){//n==length
            //I have to delete the head
            return head.next;
          }
        //Move slow and  fast together until fast.next reaches tail
        while(fast.next!=null){
            slow =slow.next;
            fast =fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
*/

}
