package SixTeenDaysCompleteDSA.LinkedList;

public class ReverseALinkedList {
    class Node {
        private final int value;
        int data;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    Node reverseList(Node head) {
        Node newHead = head;
        while(newHead.next!=null){
            newHead = newHead.next;
        }
        helper(head);

        return newHead;
    }

    private Node helper(Node head) {
        if(head.next==null){
            return head;
        }
        Node node = helper(head.next);
        node.next = head;
        head.next = null;
        return head;
    }
}
