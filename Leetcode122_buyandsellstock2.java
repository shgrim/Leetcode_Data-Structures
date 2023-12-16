package Leetcode;

public class Leetcode122_buyandsellstock2 {
    public static void main(String[] args) {
        int[] a={7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                profit +=(prices[i]-prices[i-1]);
            }
        }
        return profit;

    }
}
