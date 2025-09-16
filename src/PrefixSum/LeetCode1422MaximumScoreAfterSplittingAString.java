package PrefixSum;
//1422. Maximum Score After Splitting a String
/*
Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings
(i.e. left substring and right substring).
The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.
Example 1:
Input: s = "011101"
Output: 5
Explanation:
All possible ways of splitting s into two non-empty substrings are:
left = "0" and right = "11101", score = 1 + 4 = 5
left = "01" and right = "1101", score = 1 + 3 = 4
left = "011" and right = "101", score = 1 + 2 = 3
left = "0111" and right = "01", score = 1 + 1 = 2
left = "01110" and right = "1", score = 2 + 1 = 3
Example 2:
Input: s = "00111"
Output: 5
Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
Example 3:
Input: s = "1111"
Output: 3
Constraints:
2 <= s.length <= 500
The string s consists of characters '0' and '1' only.
*/
public class LeetCode1422MaximumScoreAfterSplittingAString {
/*
Better Code
class Solution {
    public int maxScore(String s) {
    int n = s.length();
    int ones=0, zeros=0, max=Integer.MIN_VALUE;
    for(char ch: s.toCharArray()){
        if(ch=='1') ones++;
    }
    for(int i=0; i<n-1; i++){
        if(s.charAt(i)=='0') zeros++;
        else ones--;
        max = Math.max(max, zeros+ones);
    }
    return max;
    }
}

class Solution {
    public int maxScore(String s) {
    int n = s.length();
    char[] arr = s.toCharArray();
    int[] preZero =  new int[n];
    int[] preOne = new int[n];
    if(arr[0]=='0') preZero[0]++;
    if(arr[n-1]=='1') preOne[n-1]++;
    for(int i=1; i<n; i++){
        if(arr[i]=='0') preZero[i]++;
        preZero[i] += preZero[i-1];
    }
    for(int i=n-2; i>=0; i--){
        if(arr[i]=='1') preOne[i]++;
        preOne[i] += preOne[i+1];
    }
    int j=1;
    int k=0;
    int max = Integer.MIN_VALUE;
    while(j<n){
        int sum = preZero[k++] + preOne[j++];
        max = Math.max(sum, max);
    }
    return max;
    }
}
*/
}
