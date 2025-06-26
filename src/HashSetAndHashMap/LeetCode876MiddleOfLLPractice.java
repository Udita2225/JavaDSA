package HashSetAndHashMap;

public class LeetCode876MiddleOfLLPractice {
/*Method 2
//Slow Fast Pointer
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        //null ka next nahi hota
        while(fast!=null && fast.next!=null ){
            slow =slow.next;
            fast =fast.next.next;
        }
        return slow;
    }
}

Method 1 Two Pass Solution
Total No.Of Operations:- n + n/2
TC:-O(n)
class Solution {
    public ListNode middleNode(ListNode head) {
    ListNode temp=head;//Nothing is created
    int len=0;
    while(temp!=null){
        temp=temp.next;
        len++;
    }
    int mid = len/2+1;
    temp=head;
    for(int i=1; i<=mid-1; i++){
        temp=temp.next;
    }
    return temp;
    }
}
*/
}
