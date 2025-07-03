package Strings;
//Index of the First Occurrence of pattern in a text
/*
Given two strings text and pattern, find the first index where pattern exactly matches with any substring of text.
Return -1 if pattern doesn't exist as a substring in text.
Example 1:
Input:
text = gffgfg
pattern = gfg
Output: 3
Explanation:  Considering 0-based indexing, substring of text from 3rd to last index is gfg.
Example 2:
Input:
text = gffggg
pattern = gfg
Output: -1
Explanation: pattern "gfg" does not exist in the text.
Your Task:
You don't need to read input or print anything. Your task is to complete the function findMatching() which takes the
strings text and pattern as the input parameters and returns the first index of matching.
Expected Time Complexity: O(|text| * |pattern|)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ |text|, |pattern| ≤  103
*/
public class GFGIndexOfFirstOccurenceOfPatternInText {
/*
// User function Template for Java

class Solution {
    public int findMatching(String text, String pat) {
        // Code here
        int tLength = text.length();
        int pLength = pat.length();
        for(int i=0; i<=tLength-pLength; i++){
            if(text.substring(i, i+pLength).equals(pat)) return i;
        }
        return -1;
    }
}

*/
}
