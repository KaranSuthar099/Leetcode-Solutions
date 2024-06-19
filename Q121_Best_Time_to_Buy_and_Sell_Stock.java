public class Q121_Best_Time_to_Buy_and_Sell_Stock {

    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            int currentProfit = price - buy;
            if (currentProfit > maxProfit) maxProfit = currentProfit;
            if (price < buy) buy = price;
        }

        return maxProfit;

    }

}
