package DynamicProgramming2D;
//121. Best Time to Buy and Sell Stock
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
Constraints:
1 <= prices.length <= 105
0 <= prices[i] <= 104
*/
public class LeetCode121BestTimeToBuyAndSellStock {
/*
// Using DP
class Solution {
    public int maxProfit(int[] prices) {
        int n =  prices.length;
        int minStock =  prices[0];
        int maxPrice = 0;
        int[] dp =  new int[n];
        dp[0] = 0;
        for(int i=1; i<n; i++){
            int profit = prices[i]-minStock;
            dp[i] =  Math.max(dp[i-1],profit);
            minStock =  Math.min(minStock, prices[i]);
        }
        return dp[n-1];
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // Track minimum price seen so far
        int maxProfit = 0;                  // Track maximum profit

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;           // Update minPrice if current price is lower
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Update maxProfit
            }
        }

        return maxProfit;
    }
}



Brute Force -> Time Limit Exceeded
class Solution {
    public int maxProfit(int[] prices) {
    int profit = 0;
    int n = prices.length;
    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(prices[j]>prices[i]){
                int diff = prices[j]-prices[i];
                profit =  Math.max(profit,diff);
            }
        }
    }
    return profit;
    }
}
*/
}
