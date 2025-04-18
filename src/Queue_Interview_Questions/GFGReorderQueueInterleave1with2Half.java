package Queue_Interview_Questions;
/*
Interleave the First Half of the Queue with Second Half
You are given a queue Q of N integers of even length, rearrange the elements
by interleaving the first half of the queue with the second half of the queue.
Note : Return the modified queue after the rearrangement as vector/ArrayList .
Example 1:
Input:
N = 4
Q = {2,4,3,1}
Output:
{2,3,4,1}
Explanation:
After the mentioned rearrangement of the first half
and second half, our final queue will be {2,3,4,1}.
Example 2:
Input:
N = 2
Q = {3,5}
Output:
{3,5}
Explanation:
After the mentioned rearrangement of the first half
and second half, our final queue will be {3,5}.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
2 <= N <= 105
N is even
1 <= Elements of Queue <= 103
Sum of N over all test cases doesn't exceeds 106
*/
public class GFGReorderQueueInterleave1with2Half {
/*
//By Using Arrays
class Solution {
    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        // code here
        int[] arr = new int[N];
        for(int i=0; i<N; i+=2){
            arr[i] =q.remove();
        }
        for(int i=1; i<N; i+=2){
            arr[i]= q.remove();
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<N; i++){
            res.add(arr[i]);
        }
        return res;
    }
}
*/
/*
//By Using Stacks
class Solution {
    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        // code here
        Stack<Integer> st = new Stack<>();
        while(q.size()!=N/2){
            st.push(q.poll());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        while(q.size()!=N/2){
            st.push(q.poll());
        }
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.poll());
        }
        while(q.size()>0){
            st.push(q.poll());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        ArrayList<Integer> res = new ArrayList<>();
        while(q.size()>0){
            res.add(q.poll());
        }
        return res;
    }
}


*/
}
