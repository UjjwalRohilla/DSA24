package SixTeenDaysCompleteDSA.LinkedList.FlattenTheLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlatteningALinkedList {
    class Node
    {
        int data;
        Node next;
        Node bottom;

        Node(int d)
        {
            data = d;
            next = null;
            bottom = null;
        }
    }
    Node flatten(Node root) {
        if(root==null)return null;
        if(root.next==null)return root;

        List<Integer> list = new ArrayList<>();

        Node temp = root;
        while(temp!=null){
            Node t2 = temp;
            while(t2!=null){
                list.add(t2.data);
                t2 = t2.bottom;
            }
            temp = temp.next;
        }

        Collections.sort(list);
        return convert(list);
    }

    private Node convert(List<Integer> list) {
        Node temp = new Node(-1);
        Node t = temp;
        for (int num : list) {
            t.bottom = new Node(num);
            t = t.bottom;
        }
        return temp.bottom;
    }
}
