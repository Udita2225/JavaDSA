package HashSetAndHashMap;
//1930. Unique Length-3 Palindromic Subsequences
/*
Given a string s, return the number of unique palindromes of length three that are a subsequence of s.
Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.
A palindrome is a string that reads the same forwards and backwards.
A subsequence of a string is a new string generated from the original string with some characters (can be none)
deleted without changing the relative order of the remaining characters.
For example, "ace" is a subsequence of "abcde".
Example 1:
Input: s = "aabca"
Output: 3
Explanation: The 3 palindromic subsequences of length 3 are:
- "aba" (subsequence of "aabca")
- "aaa" (subsequence of "aabca")
- "aca" (subsequence of "aabca")
Example 2:
Input: s = "adc"
Output: 0
Explanation: There are no palindromic subsequences of length 3 in "adc".
Example 3:
Input: s = "bbcbaba"
Output: 4
Explanation: The 4 palindromic subsequences of length 3 are:
- "bbb" (subsequence of "bbcbaba")
- "bcb" (subsequence of "bbcbaba")
- "bab" (subsequence of "bbcbaba")
- "aba" (subsequence of "bbcbaba")
Constraints:
3 <= s.length <= 105
s consists of only lowercase English letters.
*/
public class LeetCode1930UniqueLength3PalindromicSubsequence {
/*//Done using Frequency Array
/*class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] firstOccurence =  new int[26];
        int[] lastOccurence =  new int[26];
        int count =0;
        for(int i=0; i<26; i++){
            firstOccurence[i] =-1;
            lastOccurence[i] =-1;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            int idx = ascii-97;
            if(firstOccurence[idx]==-1) firstOccurence[idx] = i;
            lastOccurence[idx] = i;
        }
        boolean[] freq = new boolean[26];
        for(int i=0; i<firstOccurence.length; i++){
            int firstIdx = firstOccurence[i];
            int lastIdx = lastOccurence[i];
            if(firstIdx!=-1 && firstIdx!=lastIdx){
                Arrays.fill(freq,false);
                for(int j=firstIdx+1; j<lastIdx; j++){
                    // char ch = s.charAt(j);
                    // int ascii = (int)ch;
                    // int idx = ascii-97;
                    freq[s.charAt(j)-'a'] = true;
                }
                for(boolean present: freq){
                    if(present) count++;
                }
            }
            // HashSet<Character> set = new HashSet<>();
            // if(firstIdx!=lastIdx){
            //     for(int j= firstIdx+1; j<lastIdx; j++){
            //         set.add(s.charAt(j));
            //     }
            //     count += set.size();
            }
        return count;

    }
}

//Using HashMap
class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character, Integer> firstMap = new HashMap<>();
        HashMap<Character, Integer> lastMap = new HashMap<>();
        int count=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            //Store the first Occurence
            if(!firstMap.containsKey(ch)) firstMap.put(ch,i);
            //Always Update the last Occurence
            lastMap.put(ch,i);
        }
        for(char ch: firstMap.keySet()){
            HashSet<Character> set = new HashSet<>();
            int firstIdx = firstMap.get(ch);
            int lastIdx = lastMap.get(ch);
            if(firstIdx!=lastIdx){
                for(int i=firstIdx+1; i<lastIdx; i++){
                    set.add(s.charAt(i));
                }
                count += set.size();
            }
        }
        return count;
    }
}*/

}
