package HashSetAndHashMap;
/*
2094. Finding 3-Digit Even Numbers
You are given an integer array digits, where each element is a digit. The array may contain duplicates.
You need to find all the unique integers that follow the given requirements:
The integer consists of the concatenation of three elements from digits in any arbitrary order.
The integer does not have leading zeros.
The integer is even.
For example, if the given digits were [1, 2, 3], integers 132 and 312 follow the requirements.
Return a sorted array of the unique integers.
Example 1:
Input: digits = [2,1,3,0]
Output: [102,120,130,132,210,230,302,310,312,320]
Explanation: All the possible integers that follow the requirements are in the output array.
Notice that there are no odd integers or integers with leading zeros.
Example 2:
Input: digits = [2,2,8,8,2]
Output: [222,228,282,288,822,828,882]
Explanation: The same digit can be used as many times as it appears in digits.
In this example, the digit 8 is used twice each time in 288, 828, and 882.
Example 3:
Input: digits = [3,7,5]
Output: []
Explanation: No even integers can be formed using the given digits.
Constraints:
3 <= digits.length <= 100
0 <= digits[i] <= 9
*/
public class LeetCode2094Finding3DigitEvenNumber {
/* Sir's Method
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<digits.length; i++){
            int key = digits[i];
            if(map.containsKey(key)){
                int freq = map.get(key);
                map.put(key,freq+1);
            }
            else map.put(key,1);
        }
        for(int i=100; i<999; i+=2){
            int x =i;
            int c =x%10; x/=10;
            int b =x%10; x/=10;
            int a =x;
            if(map.containsKey(a)){
                int freq1 = map.get(a);
                map.put(a, freq1-1);
                if(freq1==1) map.remove(a);
                if(map.containsKey(b)){
                    int freq2 = map.get(b);
                    map.put(b, freq2-1);
                    if(freq2==1) map.remove(b);
                    if(map.containsKey(c)){
                        ans.add(i);
                    }
                    map.put(b,freq2);
                }
                map.put(a,freq1);
            }
        }
        int[] arr = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            arr[i] = ans.get(i);
        }
        Arrays.sort(arr);
        return arr;
    }
}
*/
/* This is my code
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<digits.length; i++){
            int key = digits[i];
            if(map.containsKey(key)){
                int freq = map.get(key);
                map.put(key,freq+1);
            }
            else map.put(key,1);
        }
        for(int i=100; i<999; i+=2){
            int x =i;
            int c =x%10; x/=10;
            int b =x%10; x/=10;
            int a =x;
            HashMap<Integer, Integer> temp =  new HashMap<>(map);
            if(temp.containsKey(a) && temp.get(a)>=1){
                int freq1 =  temp.get(a);
                temp.put(a,freq1-1);
                if(temp.containsKey(b)&& temp.get(b)>=1){
                    int freq2 = temp.get(b);
                    temp.put(b, freq2-1);
                    if(temp.containsKey(c)&& temp.get(c)>=1){
                        int freq3 = temp.get(c);
                        temp.put(c, freq3-1);
                        ans.add(i);
                    }
                }
            }
        }
        int[] arr = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            arr[i] = ans.get(i);
        }
        Arrays.sort(arr);
        return arr;
    }
}
*/
}
