package SlidingWindow;
//1052. Grumpy Bookstore Owner
/*
There is a bookstore owner that has a store open for n minutes. You are given an integer array customers of length n where customers[i] is the number of the customers that enter the store
at the start of the ith minute and all those customers leave after the end of that minute.
During certain minutes, the bookstore owner is grumpy. You are given a binary array grumpy where grumpy[i] is 1 if the bookstore owner is grumpy during the ith minute, and is 0 otherwise.
When the bookstore owner is grumpy, the customers entering during that minute are not satisfied. Otherwise, they are satisfied.
The bookstore owner knows a secret technique to remain not grumpy for minutes consecutive minutes, but this technique can only be used once.
Return the maximum number of customers that can be satisfied throughout the day.
Example 1:
Input: customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3
Output: 16
Explanation:
The bookstore owner keeps themselves not grumpy for the last 3 minutes.
The maximum number of customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.
Example 2
Input: customers = [1], grumpy = [0], minutes = 1
Output: 1
Constraints:
n == customers.length == grumpy.length
1 <= minutes <= n <= 2 * 104
0 <= customers[i] <= 1000
grumpy[i] is either 0 or 1.
*/
public class LeetCode1052GrumpyBookstoreOwner {
    /*
//Better and Optimized Code
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
    int n =  customers.length;
    int i=0, j=minutes-1;
    int MaxUnsatisfied = 0;
    int Unsatisfied = 0;
    int start = i;
    int end = j;
    for(int x=i; x<=j; x++){
        if(grumpy[x]==1) Unsatisfied += customers[x];
    }
    while(j<n){
        if(Unsatisfied > MaxUnsatisfied){
            MaxUnsatisfied = Unsatisfied;
            start = i;
            end = j;
        }
        i++ ; j++;
        if(j<n && grumpy[j]==1) Unsatisfied += customers[j];
        if(grumpy[i-1]==1) Unsatisfied -= customers[i-1];
    }
    for(int k=start; k<=end; k++){
        grumpy[k] = 0;
    }
    int satisfied = 0;
    for(int x=0; x<n; x++){
        if(grumpy[x]==0) satisfied += customers[x];
    }
    return satisfied;
    }
}
//Brute Force
//243ms Very Bad Time Complexity
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
    int maxUnsatisfied = 0;
    int n = customers.length;
    int start = 0;
    int sum = 0;
    for(int i=0; i<=n-minutes; i++){
        int unsatisfied = 0;
        for(int j=i; j<i+minutes; j++){
            if(customers[j]!=0 && grumpy[j]==1) unsatisfied += customers[j];
        }
        if(unsatisfied>maxUnsatisfied){
                maxUnsatisfied =  unsatisfied;
                start = i;
            }
    }
    int i=0;
    while(i<n){
        if(i==start){
            int end = start+minutes;
            while(i<n && i<end){
                sum += customers[i];
                i++;
            }
        }
        else if(grumpy[i]==0){
        sum += customers[i];
        i++;
        }
        else i++;
    }
    return sum;
    }
}
     */
}
