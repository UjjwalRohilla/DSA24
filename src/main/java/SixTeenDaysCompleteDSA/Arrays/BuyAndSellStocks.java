package SixTeenDaysCompleteDSA.Arrays;

import java.util.Arrays;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
        if(prices.length==0)return 0;
        int profit = 0;
        int min = prices[0];
        for (int stockPrice : prices) {
            min = Math.min(min,stockPrice);
            profit = Math.max(profit,stockPrice-min);
        }
        return profit;
    }
}
