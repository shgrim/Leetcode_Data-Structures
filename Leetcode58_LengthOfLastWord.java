package Leetcode;

public class Leetcode58_LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] words=s.split("\\s");
        return words[words.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World  "));
    }
    }
//This also works
//        s=s.trim();
//        int op=0;
//        for(int i=s.length()-1;i>=0;i--){
//
//        if(s.charAt(i)==' '){
//        break;
//        }
//        op++;
//        }
//        return op;