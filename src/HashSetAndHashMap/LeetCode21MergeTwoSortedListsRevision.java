package HashSetAndHashMap;

public class LeetCode21MergeTwoSortedListsRevision {
/*Without Creating A New Linked List
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head3 = new ListNode(-1);
        ListNode temp3 = head3;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                temp3.next = temp1;
                temp1 = temp1.next;
            }
            else{
                temp3.next = temp2;
                temp2= temp2.next;
            }
            temp3 = temp3.next;
        }
        if(temp1!=null) temp3.next =temp1;
        else temp3.next=temp2;
        /*These Loops are not required now as nodes are already connected to each other
        while(temp1!=null){
            temp3.next=temp1;
            temp3 = temp3.next;
            temp1 = temp1.next;
        }
        while(temp2!=null){
            temp3.next = temp2;
            temp3 = temp3.next;
            temp2 =temp2.next;
        }

        return head3.next;
}
}

//By Creating New ListNodes
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode temp1 = list1;
    ListNode temp2 = list2;
    ListNode head3 = new ListNode(-1);
    ListNode temp3 = head3;
    while(temp1 != null && temp2!=null){
        if(temp1.val<=temp2.val){
            ListNode temp =  new ListNode(temp1.val);
            temp3.next = temp;
            temp3 = temp3.next;
            temp1 = temp1.next;
        }
        else{
            ListNode temp= new ListNode (temp2.val);
            temp3.next = temp;
            temp3 =temp3.next;
            temp2 =temp2.next;
        }
    }
        while(temp1!=null){
            ListNode temp = new ListNode(temp1.val);
            temp3.next = temp;
            temp3 =temp3.next;
            temp1 = temp1.next;
        }
        while(temp2!=null){
            ListNode temp = new ListNode(temp2.val);
            temp3.next = temp;
            temp3 = temp3.next;
            temp2 = temp2.next;
        }
        head3 =head3.next;
        return head3;
    }
}
*/
}
