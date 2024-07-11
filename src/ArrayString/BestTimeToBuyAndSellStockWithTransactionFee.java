//You are given an array prices where prices[i] is the price of a given stock on the ith day, 
//and an integer fee representing a transaction fee.
//
//Find the maximum profit you can achieve. You may complete as many transactions as you like, 
//but you need to pay the transaction fee for each transaction.
//
//Note:
//
//You may not engage in multiple transactions simultaneously 
//(i.e., you must sell the stock before you buy again).
//The transaction fee is only charged once for each stock purchase and sale.
// 
//
//Example 1:
//
//Input: prices = [1,3,2,8,4,9], fee = 2
//Output: 8
//Explanation: The maximum profit can be achieved by:
//- Buying at prices[0] = 1
//- Selling at prices[3] = 8
//- Buying at prices[4] = 4
//- Selling at prices[5] = 9
//The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
//Example 2:
//
//Input: prices = [1,3,7,5,10,3], fee = 3
//Output: 6

package ArrayString;

/* case 1: I have stock on day i represented by dp[i][1], select max of the below:
 * 	- option 1: I bought it today
 * 				dp[i[1] = dp[i-1][0] - price[i] - fee
 * 	- option 2: I am carrying a pre-bought stock, doing nothing
 * 				dp[i][1] = dp[i-1][1]
 * case 2: I dont have stock on day i represented by dp[i][0], select max of the below:
 * 	- option 1: I sold it today
 * 				dp[i][0] = dp[i-1][1] + price[i]
 * 	- option 2: I sold a stock at some previous day, doing nothing
 * 				dp[i][0] = dp[i-1][0]
 */


public class BestTimeToBuyAndSellStockWithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        if (prices.length <= 1) {
        	return 0;
        }
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0] - fee;
        
        for (int i = 1; i < prices.length; i++) {
        	dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
        	dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i] - fee);
        }
        
        return dp[prices.length-1][0];
    }
    
//    public int maxProfit(int[] prices, int fee) {
//        int sell = 0;
//        int hold = Integer.MIN_VALUE;
//
//        for (final int price : prices) {
//          sell = Math.max(sell, hold + price);
//          hold = Math.max(hold, sell - price - fee);
//        }
//
//        return sell;
//      }
}
