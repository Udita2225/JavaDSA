package PrefixSum;
//2483. Minimum Penalty for a Shop
/*
You are given the customer visit log of a shop represented by a 0-indexed string customers consisting only of
characters 'N' and 'Y'
if the ith character is 'Y', it means that customers come at the ith hour
whereas 'N' indicates that no customers come at the ith hour.
If the shop closes at the jth hour (0 <= j <= n), the penalty is calculated as follows:
For every hour when the shop is open and no customers come, the penalty increases by 1.
For every hour when the shop is closed and customers come, the penalty increases by 1.
Return the earliest hour at which the shop must be closed to incur a minimum penalty.
Note that if a shop closes at the jth hour, it means the shop is closed at the hour j.
Example 1:
Input: customers = "YYNY"
Output: 2
Explanation:
- Closing the shop at the 0th hour incurs in 1+1+0+1 = 3 penalty.
- Closing the shop at the 1st hour incurs in 0+1+0+1 = 2 penalty.
- Closing the shop at the 2nd hour incurs in 0+0+0+1 = 1 penalty.
- Closing the shop at the 3rd hour incurs in 0+0+1+1 = 2 penalty.
- Closing the shop at the 4th hour incurs in 0+0+1+0 = 1 penalty.
Closing the shop at 2nd or 4th hour gives a minimum penalty. Since 2 is earlier, the optimal closing time is 2.
Example 2:
Input: customers = "NNNNN"
Output: 0
Explanation: It is best to close the shop at the 0th hour as no customers arrive.
Example 3:
Input: customers = "YYYY"
Output: 4
Explanation: It is best to close the shop at the 4th hour as customers arrive at each hour.
Constraints:
1 <= customers.length <= 105
customers consists only of characters 'Y' and 'N'.
*/
public class LeetCode2483MinimumPenaltyForAShop {
/*
//By Using A single Array
class Solution {
    public int bestClosingTime(String customers) {
    int n = customers.length();
    int[] pre = new int[n+1];
    int suf= 0;
    int idx =-1;
    int min = Integer.MAX_VALUE;
    for(int i=1; i<=n; i++){
        pre[i] += pre[i-1];
        if(customers.charAt(i-1)=='N') pre[i] += 1;
    }
    for(int i=n-1; i>=0; i--){
        if(customers.charAt(i)=='Y') suf++;
        pre[i] += suf;
    }
    for(int i=0; i<=n; i++){
       if(pre[i]<min){
        min = pre[i];
        idx = i;
       }
    }
    return idx;
    }
}
*/
/*Sir's Code By using 2 arrays
/*class Solution {
    public int bestClosingTime(String customers) {
    int n= customers.length();
    int min = Integer.MAX_VALUE;
    int[] pre =  new int[n+1];
    int[] suf =  new int[n+1];
    for(int i=1; i<=n; i++){
        pre[i] += pre[i-1];
        if(customers.charAt(i-1)=='N') pre[i] += 1;
    }
    for(int i=n-1; i>=0; i--){
        suf[i] += suf[i+1];
        if(customers.charAt(i)=='Y') suf[i] += 1;
    }
    for(int i=0; i<=n; i++){
        suf[i] += pre[i];
        min = Math.min(min,suf[i]);
    }
    for(int i=0; i<=n; i++){
        if(suf[i]==min) return i;
    }

    /*
    int[] penalty = new int[n+1];
    int min = Integer.MAX_VALUE;
    for(int i=0; i<=n ; i++){
        penalty[i] = pre[i] + suf[i];
        min = Math.min(min, penalty[i]);
    }
    for(int i=0; i<=n; i++){
        if(penalty[i]==min) return i;
    } //
    return -1;
    }
}

// My Code
class Solution {
    public int bestClosingTime(String customers) {
    int n = customers.length();
    int[] pre = new int[n];
    int[] suf = new int[n];
    for(int i=0; i<n; i++){
        char ch = customers.charAt(i);
        if(ch=='Y') suf[i]++;
        else if(ch=='N') pre[i]++;
    }
    for(int i=1; i<n; i++){
        pre[i] += pre[i-1];
    }
    for(int i=n-2; i>=0;i--){
        suf[i] += suf[i+1];
    }
    int[] helper = new int[n+1];
    helper[0] = suf[0];
    for(int i=1; i<n; i++){
    helper[i] = suf[i] + pre[i-1];
    }
    helper[n] = pre[n-1];
    int min = Integer.MAX_VALUE;
    int idx = -1;
    for(int i=0; i<=n; i++){
        if(helper[i]<min){
            min = helper[i];
            idx =i;
        }
    }
    return idx;
    }
}
*/
}
