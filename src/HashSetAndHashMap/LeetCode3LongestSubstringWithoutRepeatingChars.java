package HashSetAndHashMap;

public class LeetCode3LongestSubstringWithoutRepeatingChars {
/*
3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without duplicate characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Constraints:
0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
*/
/* Best Code
class Solution {
    public int lengthOfLongestSubstring(String s) {
    //Two pointer Approach i and j Sliding Window Concept
    //Expand the window when map does not contain the current character j++
    //Shrink the window when map contains the current character
    //Here map will contain the current character and its index
    int n = s.length();
    if(n<=1) return n;
    HashMap<Character, Integer> map = new HashMap<>();
    int i=0;
    int j=0;
    int MaxLen =0;
    while(j<n){
        char key = s.charAt(j);
        if(map.containsKey(key)){
            int idx = map.get(key);
            if(idx>=i && idx<=j){
                int len = j-i;
                MaxLen = Math.max(len,MaxLen);
                i = idx+1;
            }
        }
        map.put(key,j);
        j++;
    }
    MaxLen = Math.max(MaxLen,j-i);
    return MaxLen;
    }
}
*/
/*Intuitive And Self explanatory
class Solution {
    public int lengthOfLongestSubstring(String s) {
    //Two pointer Approach i and j Sliding Window Concept
    //Expand the window when map does not contain the current character j++
    //Shrink the window when map contains the current character
    //Here map will contain the current character and its index
    int n = s.length();
    if(n<=1) return n;
    HashMap<Character, Integer> map = new HashMap<>();
    int i=0;
    int j=0;
    int MaxLen =0;
    while(j<n){
        char key = s.charAt(j);
        if(!map.containsKey(key)){
            map.put(key,j);
            j++;
        }
        else if(map.containsKey(key)){
            int idx = map.get(key);
            if(idx>=i && idx<=j){
                int len = j-i;
                MaxLen = Math.max(len,MaxLen);
                i = idx+1;
                map.put(key,j);
            }
            else{
            map.put(key,j);
            }
            j++;
        }
    }
    MaxLen = Math.max(MaxLen,j-i);
    return MaxLen;
    }
}
*/
/*
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Two pointer Approach i and j Sliding Window Concept
        //Expand the window when map does not contain the current character j++
        //Shrink the window when map contains the current character
        //Here map will contain the current character and its index
        int n = s.length();
        if(n<=1) return n;
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int MaxLen =0;
        while(j<n){
            char key = s.charAt(j);
            // if(map.containsKey(key)){
            //     int idx = map.get(key);
            //     if(idx>=i && idx<=j){
            //         int len = j-i;
            //         MaxLen = Math.max(len,MaxLen);
            //         i = idx+1;
            //     }
            // }
            if(map.containsKey(key) && map.get(key)>=i){
                int len = j-i;
                MaxLen = Math.max(len,MaxLen);
                while(s.charAt(i)!=key) i++;
                i++;
                //i ko lekar jao map.get(key) se ek aage
            }
            map.put(key,j);
            j++;
        }
        MaxLen = Math.max(MaxLen,j-i);
        return MaxLen;
    }
}

 */
}
