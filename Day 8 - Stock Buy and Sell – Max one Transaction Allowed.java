    public int maximumProfit(int prices[]) {
        int maxProfit = 0;
        int n = prices.length;
        int i=0;
        int j=1;
        int profit = 0;
        while(j<n){
            if(prices[i]<prices[j]){
                if(profit < (prices[j] - prices[i])){
                    profit = prices[j]-prices[i];
                }
            }
            if(profit> maxProfit){
                maxProfit = profit;
            }
            if(prices[i]>prices[j]){   
                profit = 0;
                i = j;
            }
            j++;
        }
        return maxProfit;
    }
