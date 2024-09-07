package javaArrays.array;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(buySell(arr));
    }

    public static int buySell(int[] prices) {
        // profit = sellingPrice - buyingPrice;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

}
