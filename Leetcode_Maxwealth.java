package Leetcode;
/**
 *
 * @author Adolf K Weismann
 */
public class Leetcode_Maxwealth {

    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int max=0;
        
        for (int[] account1 : accounts) {
            for (int account = 0; account < account1.length; account++) {
                sum += account;
            }
            if(sum>=max)
            {
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}
