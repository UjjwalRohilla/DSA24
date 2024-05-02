package SixTeenDaysCompleteDSA.String;

import java.util.Stack;

public class ParenthesisChecker {
    static boolean isPar(String x) {
        if(x.isEmpty())return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i)=='[' || x.charAt(i)=='(' || x.charAt(i)=='{'){
                stack.push(x.charAt(i));
            } else if ( !stack.isEmpty() && x.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
            } else if ( !stack.isEmpty() && x.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            } else if ( !stack.isEmpty() && x.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();
            }else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
