package DynamicProgrammingKnapSack;

public class KnapSack01Tabulation {
    public static void main(String[] args) {
        int[] val = {5,3,9,16};
        int[] wt = {1,2,8,10};
        int n =  wt.length;
        int capacity = 8;
        int[][] dp =  new int[n+1][capacity+1];
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=capacity; j++){
               int skip = dp[i+1][j];
               int pick = 0;
               if(wt[i]<=j){
                   pick =  val[i]+ dp[i+1][j-wt[i]];
               }
               dp[i][j] = Math.max(skip,pick);
            }
        }
        System.out.println(dp[0][capacity]);
    }
}
