package Leetcode;

public class Leetcode123_buyandsellstock3 {
    public static void main(String[] args) {
        int[] a={3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(a));
    }
    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1) return 0;
        int[] local = new int[3];
        int[] global = new int[3];
        for(int i = 0; i < prices.length - 1; i++){
            int diff = prices[i + 1] - prices[i];
            for(int j = 2; j >= 1; j--){
                local[j] = Math.max(global[j - 1] + Math.max(diff, 0), local[j] + diff);
                global[j] = Math.max(global[j], local[j]);
            }
        }
        return global[2];
    }
}
