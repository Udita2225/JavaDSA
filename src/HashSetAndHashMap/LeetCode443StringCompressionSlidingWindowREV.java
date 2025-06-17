package HashSetAndHashMap;

public class LeetCode443StringCompressionSlidingWindowREV {
//443. String Compression
/*
Given an array of characters chars, compress it using the following algorithm:
Begin with an empty string s. For each group of consecutive repeating characters in chars:
If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars.
Note that group lengths that are 10 or longer will be split into multiple characters in chars.
After you are done modifying the input array, return the new length of the array.
You must write an algorithm that uses only constant extra space.
Example 1:
Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
Example 2:
Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.
Example 3:
Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
Constraints:
1 <= chars.length <= 2000
chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.
*/
/*
class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i=0; int j=0;
        StringBuilder ans = new StringBuilder("");
        while(j<n){
            if(chars[i]==chars[j]) j++;
            else{
                ans.append(chars[i]);
                int len = j-i;
                if(len>1){
                    ans.append(len);
                }
                i=j;
            }
        }
        ans.append(chars[i]);
        int len = j-i;
        if(len>1) ans.append(len);
        for(int k=0; k<ans.length(); k++){
            chars[k] = ans.charAt(k);
        }
        return ans.length();
    }
}
/*This is an inefficient Code because string is immutable .
Java does not modify ans, it:
Creates a new StringBuilder internally.
Appends the old string and the new value.
Converts it back to a new String.
Assigns it to ans.


class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;
        String ans ="";
        while(j<chars.length){
            if(chars[j]==chars[i]) j++;
            else{
                ans += chars[i];
                int diff = j-i;
                if(diff>1){
                    ans += diff;
                }
                i = j;
            }
        }
        ans += chars[i];
        int len = j-i;
        if(len>1) ans += len;
        char[] temp = ans.toCharArray();
        for(int k=0; k<temp.length; k++){
            chars[k]= temp[k];
        }
        return ans.length();
    }
}


*/
}
