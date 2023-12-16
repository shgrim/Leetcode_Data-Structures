package Leetcode;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
public class Leetcode_792 {
    public static void main(String[] args) {


        
    }
    public int numMatchingSubseq(String S, String[] words) {
        int ret = 0;
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char curr = S.charAt(i);
            if (!map.containsKey(curr)) {
                map.put(curr, new ArrayList<>());
            }
            map.get(curr).add(i);
        }

        for (String word : words) {
            if (match(S, word, map, 0)) {
                ret++;
            }
        }

        return ret;
    }

    private boolean match(String S, String word, Map<Character, List<Integer>> map, int startIndex) {
        if (word.length() == 0) return true;
        if (!map.containsKey(word.charAt(0))) return false;
        for (int start : map.get(word.charAt(0))) {
            if (start < startIndex) continue;
            String newWord = word.substring(1, word.length());
            return match(S, newWord, map, start + 1);
        }

        return false;
    }
}
