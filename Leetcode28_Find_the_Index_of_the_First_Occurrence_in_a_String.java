package Leetcode;

public class Leetcode28_Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static void main(String args[])
    {
        String haystack = "butsadandsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
}
