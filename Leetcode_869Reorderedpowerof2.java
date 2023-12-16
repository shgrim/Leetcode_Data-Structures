package Leetcode;

public class Leetcode_869Reorderedpowerof2 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(reorderedPowerOf2(n));
    }
    public static boolean reorderedPowerOf2(int N) {
        int[] t = counter(N);

        for (int i = 0; i < 32; i++)
            if (check(t, counter(1 << i))) return true;

        return false;
    }

    public static int[] counter(int N) {
        int[] arr = new int[10];
        while(N > 0){
            arr[N % 10]++;
            N = N / 10;
        }
        return arr;
    }

    public static boolean check(int[] a, int[] b){
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }
}
