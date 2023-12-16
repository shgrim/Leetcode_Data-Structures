package Leetcode;

public class Leetcode62_uniquePaths {
    public static void main(String[] args) {
        int m=1,n=2;
        System.out.println(uniquePaths(m,n));
    }
    public static int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }
}
