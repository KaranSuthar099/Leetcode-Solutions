public class Q122_Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        // the greedy algorithm
        int sum = 0;
        int length = prices.length;
        for (int i = 1; i<length; i++){
            if (prices[i] > prices[i-1]){
                sum += prices[i] - prices[i-1];
            }
        }
        return sum;

    }

}
