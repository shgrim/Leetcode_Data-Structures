package Leetcode;

public class Leetcode1025_DivisorGame {
    public static void main(String[] args) {
        int n=5;
        System.out.println(divisorGame(n));
    }
    public static boolean divisorGame(int n) {
        return (n%2==0);
    }
}
