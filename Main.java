class Main {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int buy=prices[0];
        for(int i=1;i<n;i++)
        {
            if(buy>prices[i])
            {
                buy=prices[i];
            }
            else if(prices[i]-buy > profit)
            {
                profit=prices[i]-buy;
            }
            // profit=sell-buy;
        }
        return profit;
        // return n;
    }
}