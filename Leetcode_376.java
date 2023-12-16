package Leetcode;
import java.util.Arrays;
public class Leetcode_376 {
    public static void main(String[] args) {

    }
    public static int wiggleMaxLength(int[] nums) {

        if (nums.length < 2) {
            return nums.length;
        }

        // up[i] refers to the length of the longest wiggle subsequence obtained so far
        //      considering i^th element as the last element of the wiggle subsequence and ending with a rising wiggle.
        int[] up = new int[nums.length];

        int[] down = new int[nums.length];

        Arrays.fill(up, 1); // initialization, each position is at least 1 for that char
        Arrays.fill(down, 1); // @note: or don't do this step, in final return just `1+()`

        for (int i = 1; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    up[i] = Math.max(up[i],down[j] + 1);
                } else if (nums[i] < nums[j]) {
                    down[i] = Math.max(down[i],up[j] + 1);
                }
            }
        }

        return Math.max(down[nums.length - 1], up[nums.length - 1]);
    }
}
