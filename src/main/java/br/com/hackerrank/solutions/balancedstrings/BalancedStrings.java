package br.com.hackerrank.solutions.balancedstrings;

import java.util.Stack;

public class BalancedStrings {

    public static char[][] TOKENS = {{'{', '}'}, {'[', ']'}, {'(', ')'}};

    private boolean matches(char openTerm, char closeTerm) {
        for (char[] array : TOKENS) {
            if (array[0] == openTerm) {
                return array[1] == closeTerm;
            }
        }
        return false;
    }

    private boolean isOpenTerm(char c) {
        for (char[] array : TOKENS) {
            if (array[0] == c) {
                return true;
            }
        }
        return false;
    }

    public boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (isOpenTerm(c)) {
                stack.push(c);
            } else {
                if (!matches(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
