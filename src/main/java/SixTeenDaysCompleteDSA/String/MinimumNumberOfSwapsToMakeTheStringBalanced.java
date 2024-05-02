package SixTeenDaysCompleteDSA.String;

import java.util.Stack;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    public static void main(String[] args) {
        String str = "][][][][][][";
        System.out.println(minSwapsCopy(str));
    }
    public int minSwaps(String s) {
        if(s.isEmpty())return 0;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else {
                if(stack.isEmpty() || stack.peek()==']'){
                    stack.push(s.charAt(i));
                }else{
                    stack.pop();
                }
            }
        }
        int totalBrackets = stack.size();
        int closeBrackets = totalBrackets/2;
        return (closeBrackets+1)/2;
    }

    private static int minSwapsCopy(String s){
        int extraclose = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==']') {
                extraclose++;
                max = Math.max(max, extraclose);
            } else  extraclose--;
        }
        return (max+1)/2;
    }
}
