package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode1338reducearraybyhalf {
    public static void main(String[] args) {
        int[]arr={3,3,3,3,5,5,5,2,2,7};
        System.out.println(minSetSize(arr));
    }
    public static int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) map.put(x, map.getOrDefault(x, 0) + 1);

        int[] frequencies = new int[map.values().size()];
        int i = 0;
        for (int freq : map.values()) frequencies[i ++] = freq;
        Arrays.sort(frequencies);

        int ans = 0, removed = 0, half = arr.length / 2;
        i = frequencies.length - 1;
        while (removed < half) {
            ans += 1;
            removed += frequencies[i --];
        }
        return ans;
    }
}
