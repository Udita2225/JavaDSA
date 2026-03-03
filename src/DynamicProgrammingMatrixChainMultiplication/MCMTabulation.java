package DynamicProgrammingMatrixChainMultiplication;

public class MCMTabulation {
    static void main() {
        int[] arr  = {1,2,3,4,2};
        int n =  arr.length-1;
        int[][] dp =  new int[n][n];
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=n-1; j++){
                if(i==j) {
                    dp[i][j] = 0;
                    continue;
                }
                int minCost =  Integer.MAX_VALUE;
                for(int k=i; k<j; k++){
                    int x = arr[i] * arr[k+1] * arr[j+1];
                    int totalCost =  dp[i][k] + dp[k+1][j] + x;
                    minCost =  Math.min(minCost,totalCost);
                }
                dp[i][j] =  minCost;
            }
        }
        System.out.println(dp[0][n-1]);
    }
}
