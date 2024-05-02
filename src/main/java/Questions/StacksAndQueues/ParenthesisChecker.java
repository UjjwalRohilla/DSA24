package Questions.StacksAndQueues;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(ispar(str));
    }
    private static boolean ispar(String x) {
        if(x.isEmpty())return true;
        Stack<Character> bracks = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i)=='{' || x.charAt(i)=='[' || x.charAt(i)=='('){
                bracks.push(x.charAt(i));
            }else{
                if(bracks.isEmpty()) return false;

                char c = bracks.pop();
                if(!((x.charAt(i)==')' && c=='(') || (x.charAt(i)==']' && c=='[') || (x.charAt(i)=='}' && c=='{'))){
                    return false;
                }
            }
        }
        return bracks.isEmpty();
    }
}
