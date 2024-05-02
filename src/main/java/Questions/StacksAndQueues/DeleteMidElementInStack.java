package Questions.StacksAndQueues;

import java.util.Stack;

import static java.lang.Math.floor;

public class DeleteMidElementInStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s);
        deleteMid(s,s.size());
        System.out.println(((6+1)/2));
        System.out.println(s);
    }
    public static void deleteMid(Stack<Integer> s, int sizeOfStack){
        int mid = (sizeOfStack+1)/2;
        deleteMidHelper(s,sizeOfStack,mid);
    }
    public static void deleteMidHelper(Stack<Integer> s ,int n, int current){
        if(s.isEmpty() || current==n) return;

        int x = s.pop();
        deleteMidHelper(s,n,current+1);

        if(current != ((n+1)/2)){
            s.push(x);
        }
    }
}
