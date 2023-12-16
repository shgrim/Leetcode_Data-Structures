package Leetcode;

import java.util.Arrays;

public class Leetcode300_increasingsubseq {
    public static void main(String[] args) {
        int[] num={10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(num));
    }
    public static int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        int max = 1;
        for(int i = 1; i < len; i++){
            for(int j = i; j >= 0; j--){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}
