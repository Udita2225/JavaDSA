package HashSetAndHashMap;

public class LeetCode2130MaxTwinSumOfALLPractice {
/*
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode Next=curr;
        while(curr!=null){
            Next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        int sum=0;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=reverse(slow);
        ListNode t1= head;
        while(temp!=null){
            int x = t1.val +temp.val;
            sum = Math.max(sum,x);
            t1 = t1.next;
            temp =temp.next;
        }
        return sum;
    }
}
*/
}
