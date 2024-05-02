package SixTeenDaysCompleteDSA.LinkedList.FindPairsInDoublyLinkedList;

import SixTeenDaysCompleteDSA.LinkedList.ReverseInDoublyLinkedList.ReverseInDoublyLinkedList;

public class FindPairsInDoublyLinkedList {
    class Node
    {
        int data;
        Node next, prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private void findPairs(Node head, int k){
        if(head==null && head.next==null)return;

        Node first = head;
        Node second = head;
        boolean flag = false;
        while(second.next!=null){
            second = second.next;
        }
        while(first!=second){
            if(first.data+second.data == k){
                flag = true;
                System.out.println(first.data +" + "+second.data+" = "+first.data+second.data);
                first = first.next;
                second = second.prev;
            } else if (first.data + second.data > k) {
                second = second.prev;
            }else {
                first = first.next;
            }
        }
        if(!flag){
            System.out.println("No Pairs Found!");
        }
    }
}
