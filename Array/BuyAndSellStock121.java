public class BuyAndSellStock121 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
      int buy = prices[0];
      int maxProfit = 0;

      for(int i=1;i<prices.length;i++){
        if(prices[i] < buy){
          buy = prices[i];
        }
        else{
          int profit = prices[i] - buy;
          if(maxProfit < profit){
            maxProfit = profit;
          }
        }
      }
      return maxProfit;
    }
}
