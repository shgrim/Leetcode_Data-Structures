package Leetcode;

public class Leetcode342powerof4 {
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOfFour(n));
    }
    public static boolean isPowerOfFour(int n) {
        return (n>0) && ((n & (n-1))==0) && ((n & 0x55555555)==n);
    }
}
