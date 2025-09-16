package SlidingWindow;
//76. Minimum Window Substring
/*
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window.
If there is no such substring, return the empty string "".
The testcases will be generated such that the answer is unique.
Example 1:
Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:
Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:
Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
Constraints:
m == s.length
n == t.length
1 <= m, n <= 105
s and t consist of uppercase and lowercase English letters.
Follow up: Could you find an algorithm that runs in O(m + n) time?
*/
public class LeetCode76MinimumWindowSubstring {
/*
class Solution {
    public String minWindow(String s, String t) {
    int n = s.length();
    int m = t.length();
    if(s==null || t==null || n<m) return "";
    HashMap<Character, Integer> map = new HashMap<>();
    for(char ch: t.toCharArray()){
        map.put(ch, map.getOrDefault(ch,0)+1);
    }
    int i=0;
    int formed = 0;
    int required = map.size();
    int minLen = Integer.MAX_VALUE;
    int start =0;
    HashMap<Character, Integer> window = new HashMap<>();
    for(int j=0; j<n; j++){
        char ch =  s.charAt(j);
        window.put(ch, window.getOrDefault(ch,0)+1);
        if(map.containsKey(ch) && map.get(ch).equals(window.get(ch))) formed++;
        while(i<=j && formed==required){
            char c = s.charAt(i);
            int len = j-i+1;
            if(len < minLen){
                minLen = len;
                start = i;
            }
            int freq = window.get(c);
            freq--;
            window.put(c, freq);
            if(map.containsKey(c) && window.get(c)<map.get(c)) formed--;
            i++;
        }
    }
    return minLen==Integer.MAX_VALUE? "" : s.substring(start, start+minLen);
    }
}




//Brute Force
class Solution {
    public boolean containsAll(String str, String t){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch: str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch)==0) map.remove(ch);
            }
        }
        return map.isEmpty();
    }
    public String minWindow(String s, String t) {
    int n = s.length();
    String  ans ="";
    int minLen =  Integer.MAX_VALUE;
    char[] sc = s.toCharArray();
    for(int i = 0; i<n; i++ ){
        for(int j=i; j<n; j++){
            String str = s.substring(i,j+1);
                if(containsAll(str,t)){
                    if(str.length()<minLen){
                        minLen = str.length();
                        ans = str;
                    }
                }
            }
        }
    return ans;
    }
}
*/
}
