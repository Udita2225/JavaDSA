package StringBuilderClass;
//1047. Remove All Adjacent Duplicates In String
public class LeetCode1047RemoveConsecutiveDuplicatesInString {
/*
You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent
and equal letters and removing them.
We repeatedly make duplicate removals on s until we no longer can.
Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
Example 1:
Input: s = "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
Example 2:
Input: s = "azxxzy"
Output: "ay"
Constraints:
1 <= s.length <= 105
s consists of lowercase English letters.
*/
/*
class Solution {
    public String removeDuplicates(String s) {
    Stack<Character> st = new Stack<>();
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        if(st.size()!=0 && st.peek()==ch) st.pop();
        else st.push(ch);
    }
    while(st.size()>0){
        sb.append(st.pop());
    }
    return sb.reverse().toString();
    }
}
*/
}
