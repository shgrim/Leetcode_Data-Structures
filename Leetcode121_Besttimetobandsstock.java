package Leetcode;

public class Leetcode121_Besttimetobandsstock {
    public static void main(String[] args) {
        int[] a={7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }
    public static int maxProfit(int[] prices) {
        int l=0,r=1;
        int max=0;
        while(r<prices.length)
        {
            if(prices[l]<prices[r])
            {
                int profit =prices[r]-prices[l];
                max=Math.max(max,profit);
            }
            else
                l=r;
            r++;
        }
        return max;

    }
}
