package Questions.StacksAndQueues;

import java.util.Stack;

public class ReverseInStack {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(reverse(str));
    }
    public static String reverse(String S){
        Stack<Character> chars = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            chars.push(S.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!chars.isEmpty()){
            sb.append(chars.pop());
        }
        return sb.toString();
    }
}
