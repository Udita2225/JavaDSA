package SlidingWindow;
//1248. Count Number of Nice Subarrays
/*
Given an array of integers nums and an integer k.
A continuous subarray is called nice if there are k odd numbers on it.
Return the number of nice sub-arrays.
Example 1:
Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
Example 2:
Input: nums = [2,4,6], k = 1
Output: 0
Explanation: There are no odd numbers in the array.
Example 3:
Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
Output: 16
Constraints:
1 <= nums.length <= 50000
1 <= nums[i] <= 10^5
1 <= k <= nums.length
*/
public class LeetCode1248CountNumberOfNiceSubarrays {
/*
// Clean Code Using Sliding Window
class Solution {
    public int atMost(int[] nums, int k){
        int n =  nums.length;
        int i=0, count=0, oddCount=0;
        for(int j=0; j<n; j++){
            if(nums[j]%2 != 0) oddCount++;
            while(oddCount > k){
                if(nums[i]%2 != 0) oddCount--;
                i++;
            }
            count += j-i+1;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
    // By Using Better Sliding Window Concept
        return atMost(nums, k) - atMost(nums, k-1);
    }
}



//Standard Prefix Sum Code

//When we Convert All even numbers as '0'  and Odd Numbers as '1' Then the question
//becomes the question of "No. of subarrays whose sum exactly equal to 'k'"
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
    int n =  nums.length;
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    // Making Even Number = '0' and Odd Number = '1'
    for(int i=0; i<n; i++){
        nums[i] %= 2;
    }
    // Making Prefix Sum Array
    for(int i=1; i<n ; i++){
        nums[i] += nums[i-1];
    }
    //  Traversing through the prefix array and using HashMap to check and add the frequency of nums[i]
    for(int i=0; i<n; i++){
        int ele =  nums[i];
        if(ele==k) count++;
        int rem = ele - k;
        if(map.containsKey(rem)){
            int freq =  map.get(rem);
            count += freq;
        }
        map.put(ele, map.getOrDefault(ele,0)+1);
    }
    return count;
    }
}

// Sir's Prefix Sum Method
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int n =  nums.length, count=0;
    for(int i=0; i<n; i++) nums[i] %= 2;
    for(int i=1; i<n; i++) nums[i] += nums[i-1];
    for(int i=0; i<n; i++){
        if(!map.containsKey(nums[i])) map.put(nums[i],i);
        int a = 0;
        if(map.containsKey(nums[i]-k)) a = map.get(nums[i]-k);
        int b = 0;
        if(map.containsKey(nums[i]-k+1)) b = map.get(nums[i]-k+1);
        if(nums[i]==k) count += b-a+1;
        else if(nums[i]>k) count += b-a;
    }
    return count;
    }
}

// Sir's Method - More Intuitive
// TC-> O(n)
class Solution {
    // Sliding Window of Four Variables
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0, j=0, a=0, b=0, n=nums.length, k2=0, count=0;
        //Move 'i' to first odd Number
        while(i<n && nums[i]%2==0) i++;
        while(j<n && k2<k) if(nums[j++]%2!=0) k2++;
        if(k2<k) return 0;
        j--;
        b = j+1;
        while(b<n && nums[b]%2==0) b++;
        b--;
        while(b<n){//Window is from a to b
        count += (i-a+1)*(b-j+1);//Maths

        a = i+1;

        i++;
        while(i<n && nums[i]%2==0) i++;

        j = b+1;

        b = j+1;
        while(b<n && nums[b]%2==0) b++;
        b--;

        }
        return count;
    }
}
// This is my code.  It needs some improvements
// Method 1 Using Slidig Window
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
    int n = nums.length;
    int i=0;
    int temp=0;
    int count=0;
    for(int r=0; r<n; r++){
        nums[r] =  nums[r]%2;
    }
    while(i<n && nums[i]!=1){
        i++;
    }
    temp++;
    int j=i;
    while(j<n && temp!=k) {
        j++;
        if(j<n && nums[j]==1) temp++;
    }
    while(j<n){
        int a=i; int b=j;
        if(i>0) a=i-1;
        if(j<n-1) b=j+1;
        while(a>=0 && nums[a]!=1){
            a--;
        }
        while(b<n && nums[b]!=1){
            b++;
        }
        if(i==a && j==b) count+=1;
        else if(i==a && j!=b) count+= b-j;
        else if(i!=a && j==b) count+= i-a;
        else count += (i-a) * (b-j);
        i++; j++;
        while(i<n && nums[i]!=1) i++;
        while(j<n && nums[j]!=1) j++;
    }
    return count;
    }
}

Brute Force
//This code is not accepted as it gives Time Limit Exceeded Error
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int count=0;
        int ans = 0;
        for(int i=0; i<n; i++){
            count=0;
            for(int j=i; j<n; j++){
                if(nums[j]%2!=0) count++;
                if(count==k) ans++;
            }
        }
    return ans;
    }
}
*/
}
