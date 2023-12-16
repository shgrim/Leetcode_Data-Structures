package Leetcode;

public class Leetcode_70 {
    public static void main(String[] args) {
        int a=5;
        System.out.println(climbStairs(a));

    }
    static int climbStairs(int n) {
        int one=1; int two=1;
        for(int i=0;i<n-1;i++)
        {
            int temp=one;
            one = one+two;
            two=temp;
        }
        return one;
    }
}
