package DynamicProgrammingKnapSack;

public class LeetCode416PartitionEqualSubsetSumTabulation {
/*
class Solution {
    public boolean canPartition(int[] nums) {
    int n = nums.length;
    int sum = 0;
    for(int ele: nums) sum += ele;
    if(sum%2!=0) return false;
    int res = sum/2;
    boolean[][] dp = new boolean[n][res+1];
    for(int i=0; i<n; i++) dp[i][0] = true;
    for(int j=1; j<=res; j++) dp[0][j] = (nums[0]==j)? true :false;
    for(int i=1; i<n; i++){
        for(int j=1; j<=res; j++){
            boolean skip = dp[i-1][j];
            boolean pick = false;
            if(nums[i]<=j) pick =  dp[i-1][j-nums[i]];
            dp[i][j] = skip||pick;
        }
    }
    return dp[n-1][res];
    }
}

//
class Solution {
    public boolean canPartition(int[] nums) {
    int n =  nums.length;
    int sum =0;
    for(int i=0; i<n; i++){
        sum += nums[i];
    }
    if(sum % 2 != 0) return false;
    int res = sum/2;
    boolean[][] dp = new boolean[n][res+1];
    for(int i=0; i<n; i++) dp[i][0] = true;
    if(nums[0]<=res) dp[0][nums[0]] = true;
    for(int i=1; i<n; i++){
        for(int j=1; j<=res; j++){
            boolean skip = dp[i-1][j];
            boolean pick = false;
            if(nums[i]<=j){
                pick = dp[i-1][j-nums[i]];
            }
            dp[i][j] =  skip||pick;
        }
    }
    return dp[n-1][res];
    }
}
*/
}
