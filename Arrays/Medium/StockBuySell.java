package Arrays.Medium;

public class StockBuySell {
    public static int maxProfit(int[] prices) {
      int min=Integer.MAX_VALUE;
        int profit =0;
        for(int i=0;i<prices.length;i++){
            int diff = prices[i]-min;
            profit = Math.max(profit,diff);
            min = Math.min(min,prices[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
