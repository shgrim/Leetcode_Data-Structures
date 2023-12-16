package Leetcode;

public class Leetcode458_poorpigs {
    public static void main(String[] args) {
        int buckets = 1000, minutesToDie = 15, minutesToTest = 60;
        System.out.println(poorPigs(buckets,minutesToDie,minutesToTest));
    }
    public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int side = minutesToTest / minutesToDie + 1;
        int min = (int) Math.ceil(Math.log(buckets) / Math.log(side));
        return min;
    }
}
