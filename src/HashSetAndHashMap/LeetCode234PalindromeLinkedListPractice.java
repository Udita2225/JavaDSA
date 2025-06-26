package HashSetAndHashMap;

public class LeetCode234PalindromeLinkedListPractice {
/*Method 1 T.C:- O(n) S.C. O(n);
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ans.add(temp.val);
            temp =temp.next;
        }
        int i=0, j=ans.size()-1;
        while(i<=j){
            if(ans.get(i)!=ans.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

*/

/*Method 2 T.C-O(n) S.C:- O(n)
class Solution {
    public ListNode reverseList(ListNode head){
        if(head==null || head.next==null) return  head;
        ListNode prev =null;
        ListNode curr =head;
        ListNode Next =curr;
        while(curr!=null){
            Next =curr.next;
            curr.next = prev;
            prev =curr;
            curr =Next;
        }
        return prev;
    }
    public boolean ifPalindrome(ListNode head, ListNode newHead){
        ListNode t1 =head;
        ListNode t2 =newHead;
        while(t1!=null){
            if(t1.val != t2.val) return false;
            t1 =t1.next;
            t2 =t2.next;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        //Deep Copy
        ListNode t1 = head.next;
        ListNode newHead = new ListNode(head.val);
        ListNode t2 = newHead;
        while(t1!=null){
            ListNode temp = new ListNode(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        newHead  = reverseList(newHead);
        return ifPalindrome(head,newHead);

    }
}
*/
/*
// Method 3
//Not a Good Method use slow and fast pointer
class Solution {
    public ListNode reverse(ListNode node){
        ListNode prev=null;
        ListNode curr=node;
        ListNode Next=curr;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
    int size=0;
    ListNode temp=head;
    while(temp!=null){
        size++;
        temp =temp.next;
    }
    temp=head;
    if(size%2==0){
        int i=0;
        while(i!=size/2){
            temp=temp.next;
            i++;
        }
        temp = reverse(temp);
        ListNode t1=head;
        while(temp!=null){
            if(t1.val!=temp.val) return false;
            t1=t1.next;
            temp=temp.next;
        }
    }
    else{
        int i=0;
        while(i!=(size/2)+1){
            temp =temp.next;
            i++;
        }
        temp = reverse(temp);
        ListNode t1=head;
        i=0;
        while(i<(size/2)){
            if(t1.val!=temp.val) return false;
            t1= t1.next;
            temp = temp.next;
            i++;
        }
    }
    return true;
    }
}*/
/*Method 4
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode Next=curr;
        while(curr!=null){
            Next = curr.next;
            curr.next =prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp = reverse(slow);
        ListNode t1 = head;
        while(temp!=null){
            if(t1.val!=temp.val) return false;
            t1= t1.next;
            temp =temp.next;
        }
        return true;
    }
}
*/
}
