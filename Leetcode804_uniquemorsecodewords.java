package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode804_uniquemorsecodewords {
    public static void main(String[] args) {
        String[] s={"grab", "the", "code"};
        System.out.println(uniqueMorseRepresentations(s));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        final String[] morse = {".-",   "-...", "-.-.", "-..",  ".",   "..-.", "--.",  "....", "..",
                ".---", "-.-",  ".-..", "--",   "-.",  "---",  ".--.", "--.-", ".-.",
                "...",  "-",    "..-",  "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> transformations = new HashSet<>();

        for (final String word : words) {
            StringBuilder transformation = new StringBuilder();
            for (final char c : word.toCharArray())
                transformation.append(morse[c - 'a']);
            transformations.add(transformation.toString());
        }

        return transformations.size();
    }
}
