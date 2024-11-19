package Stack;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean ispar(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stk.push(c);
            } else {
                if (!stk.empty() &&
                        ((stk.peek() == '(' && c == ')') ||
                        (stk.peek() == '{' && c == '}') ||
                        (stk.peek() == '[' && c == ']'))) {
                    stk.pop();
                } else {
                    return false;
                }
            }
        }

        return stk.empty();
    }

    public static void main(String[] args) {
        String s = "{()}[]";
        if (ispar(s)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
