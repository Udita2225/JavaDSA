package Heaps2;
//767. Reorganize String
public class LeetCode767ReorganizeString {
/*
Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
Return any possible rearrangement of s or return "" if not possible.
Example 1:
Input: s = "aab"
Output: "aba"
Example 2:
Input: s = "aaab"
Output: ""
Constraints:
1 <= s.length <= 500
s consists of lowercase English letters.
*/
    /*
class Solution {
    public class Pair implements Comparable<Pair>{
        char ch;
        int freq;
        Pair(char ch, int freq){
            this.ch = ch;
            this.freq = freq;
        }
        public int compareTo(Pair p){
            return this.freq-p.freq;
        }
    }
    public String reorganizeString(String s) {
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        PriorityQueue<Pair> PQ = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<freq.length; i++){
            if(freq[i]>0) PQ.add(new Pair((char)(i+'a'),freq[i]));
        }
        StringBuilder st = new StringBuilder();
        while(PQ.size()>=2){
            Pair first =  PQ.remove();
            Pair second = PQ.remove();
            char a = first.ch;
            char b = second.ch;
            st.append(a);
            st.append(b);
            int freq1 = first.freq;
            int freq2 = second.freq;
            if(--freq1 >0) PQ.add(new Pair(a,freq1));
            if(--freq2 >0) PQ.add(new Pair(b,freq2));
        }
        if(!PQ.isEmpty()){
            Pair p = PQ.remove();
            if(p.freq>1) return "";
            else st.append(p.ch);
        }
        return st.toString();
    }
}
/*Without Heaps
class Solution {
    public String reorganizeString(String s) {
      int[] freq = new int[26];
      //Create a Frequency Array
      for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        freq[ch-'a']++;
      }
      //Find the character with Maximum Frequency
      int max=0;
      int letter =0;
      for(int i=0; i<26; i++){
        if(freq[i]>max){
            max = freq[i];
            letter = i;
        }
      }
      if(max>(s.length()+1)/2) return "";
      //Make a character Array for the newly formed string
      char[] ans = new char[s.length()];
      int idx =0;
      while(freq[letter]>0){
        ans[idx] = (char)(letter + 'a');
        freq[letter]--;
        idx += 2;
      }
      //Fill the remaining characters
      for(int i=0; i<freq.length; i++){
        while(freq[i]>0){
            if(idx >= ans.length) idx =1;
            ans[idx] = (char)(i + 'a');
            idx += 2;
            freq[i]--;
        }
      }
    String str =  new String(ans);
    return str;
    }
}
 */
}
