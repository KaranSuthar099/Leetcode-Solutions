public class Q122_Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i<prices.length; i++){
            maxProfit += Math.max(0, prices[i] - prices[i-1]);
        }
        return maxProfit;
    }

}
