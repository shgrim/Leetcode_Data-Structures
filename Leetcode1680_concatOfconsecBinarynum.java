package Leetcode;

public class Leetcode1680_concatOfconsecBinarynum {
    public static void main(String[] args) {
        int n=20;
        System.out.println(concat(n));
    }
    public static int concat(int n) {
        int MOD = 1_000_000_007;
        long sum = 0;
        int length = 0;

        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0)//checking for power of 2.
                // Why? Explained in video
                length++;
            sum = ((sum << length) | i) % MOD;//adding each number
        }

        return (int) sum;
    }

}
