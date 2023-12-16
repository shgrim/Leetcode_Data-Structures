package Leetcode;
import java.util.Arrays;
public class Leetcode242_validAnagram {
    public static void main(String[] args) {

    }
    public boolean isAnagram(String s, String t) {
        int lens = s.length(), lent = t.length();

        if (lens != lent) {
            return false;
        }

        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chart);

        return Arrays.equals(chars, chart);
    }
}
