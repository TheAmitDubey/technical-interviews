package src.leetcode;

public class Leetcode121 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int maxProfit =0 ;
        int profit = 0;
        int buy = 0;
        int sell = 1;

        while(buy < prices.length && sell < prices.length){
            if(prices[buy] < prices[sell]){
                int curr = sell;

                while(curr < prices.length && (prices[curr] - prices[buy]) > 0){
                    profit = prices[curr] - prices[buy];
                    maxProfit = Math.max(profit, maxProfit);

                    curr++;
                }
            }

            buy++;
            sell++;

        }

        return maxProfit;
    }
}
