package Leetcode;

public class Leetcode_69 {
    public static void main(String[] args) {
        int x=3;
        System.out.println(mySqrt(3));
    }
    public static int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int l =0;
        int r = x;
        while(l <= r){
            int mid = l +(r-l)/2;
            if( x/mid == mid ) return mid;
            else if( x/mid < mid){
                r = mid -1;
            }else{
                l = mid+1;
            }
        }
        return r;
    }
}
