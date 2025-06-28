package HashSetAndHashMap;

public class LeetCode148SortListRevision {
/*Best Code
    class Solution {
    public ListNode merge(ListNode a , ListNode b){
        ListNode dummy = new ListNode(-1);
        ListNode t1 = a;
        ListNode t2 = b;
        ListNode t3 = dummy;
        while(t1!=null&& t2!=null){
            if(t1.val<=t2.val){
                t3.next = t1;
                t1 = t1.next;
            }
            else{
                t3.next = t2;
                t2 = t2.next;
            }
            t3 = t3.next;
        }
        if(t1!=null) t3.next = t1;
        else t3.next =t2;
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
    if(head==null || head.next==null) return head;
    ListNode firstHalf = head;
    ListNode slow = head;
    ListNode fast = head;
    while(fast.next!=null && fast.next.next!=null){
        slow =slow.next;
        fast =fast.next.next;
    }
    ListNode secondHalf = slow.next;
    slow.next =null;
    firstHalf =sortList(firstHalf);
    secondHalf =sortList(secondHalf);
    ListNode merged = merge(firstHalf,secondHalf);
    return merged;
    }
}
*/
/* Not a perfect code because it uses Built-in Sort and  Extra Space
class Solution {
    public ListNode sortList(ListNode head) {
    ListNode temp= head;
    int size = 0;
    while(temp!=null){
        temp =temp.next;
        size++;
    }
    temp =head;
    int[] ans = new int[size];
    int i=0;
    while(temp!=null){
        ans[i] =temp.val;
        i++;
        temp =temp.next;
    }
    Arrays.sort(ans);
    temp=head;
    i=0;
    while(temp!=null){
        temp.val = ans[i];
        i++;
        temp =temp.next;
    }
    return head;
    }
}
/*
class Solution {
    public ListNode sortList(ListNode head) {
     List<Integer> arr = new ArrayList<>();
     ListNode temp = head;
     while(temp!=null){
        arr.add(temp.val);
        temp =temp.next;
    }
    temp = head;
    int i=0;
    Collections.sort(arr);
    while(temp!=null){
        temp.val  = arr.get(i++);
        temp =temp.next;
    }
    return head;
    }
}
*/
}
