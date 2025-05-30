package Stacks;

public class GFGReverseAStack {
/*
You are given a stack St. You have to reverse the stack using recursion.
Example 1:
Input:
St = {3,2,1,7,6}
Output:
{6,7,1,2,3}
Explanation:
Input stack after reversing will look like the stack in the output.
Example 2:
Input:
St = {4,3,9,6}
Output:
{6,9,3,4}
Explanation:
Input stack after reversing will look like the stack in the output.
Your Task:
You don't need to read input or print anything. Your task is to complete
the function Reverse() which takes the stack St as input and reverses the given stack.
Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(1)
Constraints:
1 <= size of the stack <= 104
-109 <= Each element of the stack <= 109
Sum of N over all test cases doesn't exceeds 106
Array may contain duplicate elements.
*/
/*
    class Solution
{
    static void insert(Stack<Integer> st, int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top= st.pop();
        insert(st, ele);
        st.push(top);
    }
    static void reverse(Stack<Integer> st)
    {
        if(st.size()==1){
            return;
        }
        int ele =st.pop();
        reverse(st);
        insert(st,ele);
    }
}*/
}
