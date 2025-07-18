package Linked_List_InterviewProblems;
/*
147. Insertion Sort List
Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.
The steps of the insertion sort algorithm:
Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the
sorted list and inserts it there.
It repeats until no input elements remain.
The following is a graphical example of the insertion sort algorithm. The partially sorted list (black) initially
contains only the first element in the list. One element (red) is removed from the input data and inserted in-place into
the sorted list with each iteration.
Example 1:
Input: head = [4,2,1,3]
Output: [1,2,3,4]
Example 2:
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]
Constraints:
The number of nodes in the list is in the range [1, 5000].
-5000 <= Node.val <= 5000
*/
public class LeetCode147InsertionSortList {
/*
class Solution {
    public ListNode insertionSortList(ListNode head) {
    if(head==null || head.next==null) return head;
    ListNode dummy = new ListNode(0);//Dummy Node before the Sorted List
    ListNode curr = head;
    while(curr!=null){
        ListNode Next = curr.next;//Save curr.next Nodes
        //Find the position to insert the current Node
        ListNode prev =dummy;
        while(prev.next!=null && prev.next.val<curr.val){
            prev = prev.next;
        }
        //Insert curr between prev and prev.next
        curr.next = prev.next;
        prev.next = curr;
        //Move to the next Node
        curr = Next;
    }
    return dummy.next;
    }
}

class Solution {
    public void swap(List<Integer> arr, int x, int y){
        int temp = arr.get(x);
        arr.set(x,arr.get(y));
        arr.set(y,temp);
    }
    public ListNode insertionSortList(ListNode head) {
    List<Integer> arr = new ArrayList<>();
    ListNode temp = head;
    while(temp!=null){
        arr.add(temp.val);
        temp =temp.next;
    }
    int n = arr.size();
    int j=0;
    for(int i=1; i<n; i++){
        j=i;
        while(j>=1 && arr.get(j)<arr.get(j-1)){
             swap(arr,j,j-1);
             j--;
        }
    }
    ListNode newHead = new ListNode(arr.get(0));
    temp = newHead;
    for(int i=1; i<arr.size(); i++){
        ListNode x = new ListNode(arr.get(i));
        temp.next = x;
        temp = temp.next;
    }

    return newHead;
    }
}
*/
}
