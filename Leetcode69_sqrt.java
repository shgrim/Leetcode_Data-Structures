package Leetcode;

public class Leetcode69_sqrt {
    public static void main(String[] args) {
        int num=20;
        System.out.println(mySqrt(num));
    }
    public static long mySqrt(long x) {
        {
            long s = 0;
            long e = x;
            while (s <= e) {
                long mid = s + (e - s) / 2;
                if (mid * mid == x) {
                    return (int)mid;
                } else if (mid * mid > x) {
                    e = mid - 1;
                } else
                    s = mid + 1;
            }
            if (s == e) return (int)(e-1);
            return (int)(s-1);
        }
    }
}
