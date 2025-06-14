package Strings;
//242. Valid Anagram
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
Follow up: What if the inputs contain Unicode characters?
How would you adapt your solution to such a case?
*/
public class LeetCode242ValidAnagram {
/*
class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()) return false;
    char[] c1 = s.toCharArray();
    char[] c2 = t.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    for(int i=0; i<c1.length; i++){
        if(c1[i]!=c2[i]) return false;
    }
    return true;
    //return Arrays.equals(c1,c2);
    //return Arrays.toString(c1).equals(Arrays.toString(c2));
    }
}
*/
}
