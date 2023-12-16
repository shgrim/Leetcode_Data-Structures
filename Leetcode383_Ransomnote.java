package Leetcode;

import java.util.HashMap;

public class Leetcode383_Ransomnote {
    public static void main(String[] args) {
        String ransomNote = "bg", magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
        System.out.println(canConstruct(ransomNote,magazine));
    }
//    public static boolean canConstruct(String ransomNote, String magazine) {
//        int[] count = new int[128];
//
//        for (final char c : magazine.toCharArray())
//            ++count[c];
//
//        for (final char c : ransomNote.toCharArray())
//            if (--count[c] < 0)
//                return false;
//
//        return true;
//    }
        public static boolean canConstruct(String ransomNote, String magazine) {
            char[] a=ransomNote.toCharArray();
            char[] b=magazine.toCharArray();
            int c=0;
            HashMap<Integer,Character> map = new HashMap<>();
            for (int i = 0; i < a.length; i++) {
                map.put(i,a[i]);
            }
            for(int j=0;j<b.length;j++)
            {
                if (map.containsKey(b[j]))
                    c+=1;

            }
            if(c==a.length)
                return true;
            return false;
    }
}
