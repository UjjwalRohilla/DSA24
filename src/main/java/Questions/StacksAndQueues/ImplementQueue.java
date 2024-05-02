package Questions.StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementQueue {
    public static void main(String[] args) throws CustomQueueException {
//        Queue<Integer> queue = new LinkedList<>();
        //add
        //remove
        //peek
        CustomQueue customQueue = new CustomQueue();
        customQueue.add(5);
        customQueue.add(8);
        customQueue.add(11);
        customQueue.add(55);
        customQueue.add(77);
        customQueue.add(21);
        customQueue.add(19);
        customQueue.add(88);
        customQueue.add(1);
        customQueue.add(2);
        System.out.println(customQueue.peek());
        customQueue.printQueue();
        System.out.println(customQueue.getSize());
        customQueue.add(999);
        System.out.println(customQueue.getSize());
        customQueue.printQueue();
    }
}
