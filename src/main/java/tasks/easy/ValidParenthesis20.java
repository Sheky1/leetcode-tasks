package tasks.easy;

import java.util.Stack;

public class ValidParenthesis20 {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') stack.push(s.charAt(i));
            else {
                if(stack.size() == 0) return false;
                char top = stack.peek();
                if((s.charAt(i) == ')' && top != '(') || (s.charAt(i) == ']' && top != '[') || (s.charAt(i) == '}' && top != '{')) return false;
                stack.pop();
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("()"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("["));
        System.out.println(isValid("]"));
    }

}
