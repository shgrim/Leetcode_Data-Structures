package Leetcode;

public class Leetcode367_Perfectsquare {
    public static void main(String[] args) {
        long num= 18;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(long num) {
        long s=0;
        long e=num;
        while(s<=e) {
            long mid = s + (e - s) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                e = mid - 1;
            } else
                s = mid + 1;
        }
                return false;
    }
}