package HashSetAndHashMap;

public class LeetCode1497CheckIfArraysRDivByK {
//1497. Check If Array Pairs Are Divisible by k
/*
Given an array of integers arr of even length n and an integer k.
We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.
Return true If you can find a way to do that or false otherwise.
Example 1:
Input: arr = [1,2,3,4,5,10,6,7,8,9], k = 5
Output: true
Explanation: Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10).
Example 2:
Input: arr = [1,2,3,4,5,6], k = 7
Output: true
Explanation: Pairs are (1,6),(2,5) and(3,4).
Example 3:
Input: arr = [1,2,3,4,5,6], k = 10
Output: false
Explanation: You can try all possible pairs to see that there is no way to divide
arr into 3 pairs each with sum divisible by 10.
Constraints:
arr.length == n
1 <= n <= 105
n is even.
-109 <= arr[i] <= 109
1 <= k <= 105
*/
/* This is an Optimised Code
T.C O(n)
class Solution {
    public boolean canArrange(int[] arr, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0;i<arr.length; i++){
        // int ele =arr[i]%k;
        // if(ele<0) ele+=k;
        int ele = ((arr[i]%k)+k)%k;
        if(map.containsKey(ele)){
            int freq = map.get(ele);
            map.put(ele, freq+1);
        }
        else map.put(ele,1);
    }
    if(map.containsKey(0)){
        if(map.get(0)%2!=0) return false;
        map.remove(0);
    }
    if(k%2==0 & map.containsKey(k/2)){
        if(map.get(k/2)%2!=0) return false;
        map.remove(k/2);
    }
    for(int key: map.keySet()){
        int rem = k-key;
        if(!map.containsKey(rem)) return false;
        int keyFreq = map.get(key);
        int remFreq = map.get(rem);
        if(keyFreq!=remFreq) return false;
    }
    return true;
    }
}
*/
/* This is the worst code that  I have thought of . This will give time limit exceed
//Here the time complexity is O(n^3)
/*
≈ O(n²) comparisons × O(n) removal time
→ O(n³) worst-case time complexity
class Solution {
    public boolean canArrange(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int num : arr) {
            ans.add(num);
        }

        for (int j = 0; j < ans.size() - 1; j++) {
            boolean found = false;
            for (int m = j + 1; m < ans.size(); m++) {
                if ((ans.get(j) + ans.get(m)) % k == 0) {
                    ans.remove(m); // remove second element first
                    ans.remove(j); // then remove first
                    j = -1; // reset outer loop to start from 0 again
                    found = true;
                    break;
                }
            }
            if (!found && j != -1) {
                return false; // no valid pair found
            }
        }

        return ans.size() == 0;
    }
}
*/
}
