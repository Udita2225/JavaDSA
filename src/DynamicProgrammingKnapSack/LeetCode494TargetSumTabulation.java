package DynamicProgrammingKnapSack;

public class LeetCode494TargetSumTabulation {
/*
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
    int n =  nums.length;
    int sum = 0;
    for(int ele: nums) sum += ele;
    int[][] dp =  new int[n][2*sum+1];
    if(target>sum || target<-sum) return 0;
    dp[0][nums[0]+sum] += 1;
    dp[0][-nums[0]+sum] += 1;
    for(int i=1; i<n; i++){
        for(int j=0; j<=2*sum; j++){
            if(dp[i-1][j]>0){
                if(j+nums[i]<=2*sum) dp[i][j+nums[i]] += dp[i-1][j];
                if(j-nums[i]>=0) dp[i][j-nums[i]] += dp[i-1][j];
            }
        }
    }
    return dp[n-1][target+sum];
    }
}
*/
}
