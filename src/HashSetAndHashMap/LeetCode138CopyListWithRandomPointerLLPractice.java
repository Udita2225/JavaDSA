package HashSetAndHashMap;
//138. Copy List with Random Pointer
/*
A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.
Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has
its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should
point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state.
None of the pointers in the new list should point to nodes in the original list.
For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two
nodes x and y in the copied list, x.random --> y.
Return the head of the copied linked list.
The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
val: an integer representing Node.val
random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
Your code will only be given the head of the original linked list.
Example 1:
Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
Example 2:
Input: head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]
Example 3:
Input: head = [[3,null],[3,0],[3,null]]
Output: [[3,null],[3,0],[3,null]]
Constraints:
0 <= n <= 1000
-104 <= Node.val <= 104
Node.random is null or is pointing to some node in the linked list.
*/
public class LeetCode138CopyListWithRandomPointerLLPractice {
/*
//TC:-O(n)
//SC:- O(n) Required Space We are not using any extra space
class Solution {
    public Node deepCopy(Node head){
    Node head2 = new Node(head.val);
        Node t1 = head.next;
        Node t2 = head2;
        while(t1!=null){
            Node temp= new Node(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        return head2;
    }
    public void alternate(Node head, Node head2){
        Node t1 = head;
        Node t2 = head2;
        Node head3 = new Node(-1);
        Node t3 = head3;
        while(t1!=null && t2!=null){
            t3.next=t1;
            t3= t3.next;
            t1 =t1.next;

            t3.next =t2;
            t3 =t3.next;
            t2 = t2.next;
        }
    }
    public void assignRandom(Node head, Node head2){
        Node t1= head;
        Node t2= head2;
        while(t1!=null){
            t2 = t1.next;
            if(t1.random!=null) t2.random = t1.random.next;
            t1 =t1.next.next;
        }
    }
    public void split(Node head, Node head2){
    Node t1= head;
    Node t2= head2;
    while(t1!=null){
        t1.next=t2.next;
        t1 =t1.next;
        if(t1==null) break;
        t2.next=t1.next;
        t2 =t2.next;
        }
    }
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        //Step 1 Create Deep Copy Without Random Pointers
        Node head2 = deepCopy(head);
        //Step 2 Join head and head2 Alternatively
        alternate(head,head2);
        //Step 3 Assign Random Pointers
        assignRandom(head,head2);
        //Step 4 Split the LinkedList again
        split(head,head2);
        return head2;
    }
}
*/
}
