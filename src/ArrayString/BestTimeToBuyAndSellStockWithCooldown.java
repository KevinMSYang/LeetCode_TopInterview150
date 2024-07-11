//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//Find the maximum profit you can achieve. You may complete as many transactions as you like 
//(i.e., buy one and sell one share of the stock multiple times) with the following restrictions:
//
//After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
//Note: You may not engage in multiple transactions simultaneously 
//(i.e., you must sell the stock before you buy again).
//
// 
//
//Example 1:
//
//Input: prices = [1,2,3,0,2]
//Output: 3
//Explanation: transactions = [buy, sell, cooldown, buy, sell]
//Example 2:
//
//Input: prices = [1]
//Output: 0

package ArrayString;

/* dp[len][2]
 * case 1: We have a stock on day i, dp[i][1] max of the below:
 * 	- I bought it today
 * 		dp[i-2][0] - prices[i]
 * 	- I am carry forwarding
 * 		dp[i-1][1]
 * case 2: We have no stock on day i, dp[i][0] max of the below:
 * 	- I sold it today
 * 		dp[i-1][1] + prices[i]
 * 	- I am carry forwarding
 * 		dp[i-1][0]
 */
public class BestTimeToBuyAndSellStockWithCooldown {
    public int maxProfit(int[] prices)
    {
    	if (prices.length <= 1)
		{
			return 0;
		}
    	if (prices.length == 2 && prices[1] > prices[0])
    	{
    		return prices[1] - prices[0];
    	}
    	else if (prices.length == 2 && prices[0] > prices[1])
    	{
    		return 0;
    	}
    	
    	int[][] dp = new int[prices.length][2];
    	dp[0][0] = 0;
    	dp[0][1] = -prices[0];
    	dp[1][0] = Math.max(dp[0][0], dp[0][1] + prices[1]);
    	dp[1][1] = Math.max(dp[0][1], dp[0][0] - prices[1]);
    	
    	for (int i = 2; i < prices.length; i++)
    	{
    		dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
    		dp[i][1] = Math.max(dp[i-1][1], dp[i-2][0] - prices[i]);
    	}
    	
    	return dp[prices.length-1][0];
    }
    public static void main(String[] args)
    {
    	BestTimeToBuyAndSellStockWithCooldown bt = new BestTimeToBuyAndSellStockWithCooldown();
    	int[] prices = {1, 2, 3, 0, 2};
    	bt.maxProfit(prices);
    }
}
