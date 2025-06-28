package HashSetAndHashMap;

public class LeetCode23MergeKSortedListsRevision {
/*Final and Most Efficient Method
class Solution {
    public ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(-1);
        ListNode t1 = a;
        ListNode t2 = b;
        ListNode t3 = dummy;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                t3.next = t1;
                t1 = t1.next;
            }
            else{
                t3.next =t2;
                t2 = t2.next;
            }
            t3 =t3.next;
        }
        if(t1!=null) t3.next =t1;
        else t3.next=t2;
        return dummy.next;
    }
    public ListNode FinalMerge(ListNode[] lists, int lo, int hi){
        if(lo==hi) return lists[lo];
        int mid = lo + (hi-lo)/2;
        ListNode a = FinalMerge(lists,lo,mid);
        ListNode b = FinalMerge(lists,mid+1,hi);
        return merge(a,b);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        return FinalMerge(lists, 0, lists.length-1);
    }
}
*/
/* Using Queue More Efficient than previous one
class Solution {
    public ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(-1);
        ListNode t1 =a;
        ListNode t2 =b;
        ListNode t3 =dummy;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                t3.next = t1;
                t1 = t1.next;
            }
            else{
                t3.next=t2;
                t2 = t2.next;
            }
            t3 = t3.next;
        }
        if(t1!=null) t3.next=t1;
        else t3.next = t2;
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0 || lists == null) return null;
        if(lists.length==1) return lists[0];
        Queue<ListNode> q = new LinkedList<>();
        for(int i=0; i<lists.length; i++){
            q.add(lists[i]);
        }
        while(q.size()!=1){
        ListNode a= q.poll();
        ListNode b= q.poll();
        ListNode x = merge(a,b);
        q.add(x);
        }
        return q.poll();
    }
}
*/
/* Not a very Good Code
class Solution {
    public ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(-1);
        ListNode t1 =a;
        ListNode t2 =b;
        ListNode t3 =dummy;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                t3.next = t1;
                t1 = t1.next;
            }
            else{
                t3.next=t2;
                t2 = t2.next;
            }
            t3 = t3.next;
        }
        if(t1!=null) t3.next=t1;
        else t3.next = t2;
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0 || lists == null) return null;
        if(lists.length==1) return lists[0];
        ArrayList<ListNode> ans = new ArrayList<>();
        for(int i=0; i<lists.length; i++){
            ans.add(lists[i]);
        }
        while(ans.size()>1){
        ListNode a= ans.remove(ans.size()-1);
        ListNode b= ans.remove(ans.size()-1);
        ListNode x = merge(a,b);
        ans.add(x);
        }
        return ans.get(0);
    }
}
*/
}
