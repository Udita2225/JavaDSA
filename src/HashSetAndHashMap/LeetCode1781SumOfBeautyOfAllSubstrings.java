package HashSetAndHashMap;
//1781. Sum of Beauty of All Substrings
/*
The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.
For example, the beauty of "abaacc" is 3 - 1 = 2.
Given a string s, return the sum of beauty of all of its substrings.
Example 1:
Input: s = "aabcb"
Output: 5
Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.
Example 2:
Input: s = "aabcbaa"
Output: 17
Constraints:
1 <= s.length <= 500
s consists of only lowercase English letters.
*/
public class LeetCode1781SumOfBeautyOfAllSubstrings {
/*//Using Frequency Array
class Solution {
    public int beautySum(String s) {
    int sum=0;
    for(int i=0; i<s.length(); i++){
        int[] freq = new int[26];
        for(int j=i; j<s.length(); j++){
            freq[s.charAt(j)-'a']++;
            int maxFreq =  Integer.MIN_VALUE;
            int minFreq =  Integer.MAX_VALUE;
            for(int f:freq){
                if(f>0){
                    maxFreq = Math.max(f,maxFreq);
                    minFreq = Math.min(f,minFreq);
                }
            }
            sum += (maxFreq-minFreq);
        }
    }
    return sum;
    }
}
*/
/*
//Using HashMap
class Solution {
    public int beautySum(String s) {
    int sum =0;
    for(int i=0; i<s.length(); i++){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int j=i; j<s.length(); j++){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch,freq+1);
            }
            else map.put(ch, 1);
            int maxFreq = Integer.MIN_VALUE;
            int minFreq = Integer.MAX_VALUE;
            for(char key: map.keySet()){
                int value = map.get(key);
                maxFreq = Math.max(maxFreq, value);
                minFreq = Math.min(minFreq, value);
            }
            sum += maxFreq-minFreq;
        }
    }
    return sum;
    }
}
*/
}
