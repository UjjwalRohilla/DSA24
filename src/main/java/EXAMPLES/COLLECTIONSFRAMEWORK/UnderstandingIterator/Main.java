package EXAMPLES.COLLECTIONSFRAMEWORK.UnderstandingIterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        OurList<Integer> list = new OurList<>();
        list.setItem(1);
        list.setItem(2);
        list.setItem(3);

        List<Number> alist = new LinkedList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(4);


        List<Long> alist2 = new LinkedList<>();
        alist2.add(1L);
        alist2.add(2L);
        alist2.add(3L);
        alist2.add(4L);

        alist.addAll(alist2);

        PriorityQueue<Integer> queue = new PriorityQueue<>(4);
        queue.add(4);
        queue.add(2);
        queue.add(1);
        queue.add(10);
        queue.add(5);
        System.out.println(queue);

    }
}
