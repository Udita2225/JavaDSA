package Stacks_Interview_Questions;
//LEETCODE 20 VALID PARENTHESES
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Example 1:
Input: s = "()"
Output: true
Example 2:
Input: s = "()[]{}"
Output: true
Example 3:
Input: s = "(]"
Output: false
Example 4:
Input: s = "([])"
Output: true
Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/
public class LeetCode20ValidParentheses {
/*
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n= s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{'||ch== '['){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.size()==0) return false;
                else if(st.peek()=='(') st.pop();
                else if(st.peek()=='{'||st.peek()=='[') return false;
            }
             else if(ch=='}'){
                if(st.size()==0) return false;
                else if(st.peek()=='{') st.pop();
                else if(st.peek()=='('||st.peek()=='[') return false;
            }
             else {
                if(st.size()==0) return false;
                else if(st.peek()=='[') st.pop();
                else if(st.peek()=='('||st.peek()=='{') return false;
            }
        }
        if(st.size()==0) return true;
        else return false;
    }
}
*/
}
