package AlgoPlayground.GFG.Stack;

import java.util.ArrayDeque;

public class BalanceParentheses {
    boolean matching(char a, char b) {
        return (a == '(' && b == ')')
                || (a == '{' && b == '}')
                || (a == '[' && b == ']');
    }

    boolean isBalanced(String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                else if (!matching(stack.peek(), c)) return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

