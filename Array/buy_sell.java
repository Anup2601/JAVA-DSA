class buy_sell{
    public static int buy_sell_stocks(int price[]){
        // for buy the stock 
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < price.length; i++) {
            if(buyPrice<price[i]){
                int profit=price[i]-buyPrice;// today profit
                if(maxProfit<profit){ //maximum profit 
                    maxProfit=profit;
                }
            }
            else{
                buyPrice=price[i];
            }
        }
        return maxProfit;
   }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.println(buy_sell_stocks(price)+"%");
    }
}