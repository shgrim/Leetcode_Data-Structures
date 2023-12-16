package Leetcode;

import java.util.Stack;

public class Leetcode20_Parantheses {
    public static void main(String[] args) {
        String s="()[";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {

        if (s == null || s.length() == 0)   return false;

        Stack<Character> sk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')   sk.push(c);
            else if (c == ')' || c == '}' || c == ']') {

                // @note: I missed stack check
                if (sk.isEmpty())   return false;

                char pop = sk.pop();
                if (!valid(pop, c))   return false;
            }
            else    return false; // some other chars except parenthesis
        }


        // @note: i missed sanity check, what if only "["
        return sk.isEmpty() ? true : false;
    }

    public static boolean valid(char left, char right) {

        return (left == '(' && right == ')') || (left == '[' && right == ']') || (left == '{' && right == '}');
    }
}
