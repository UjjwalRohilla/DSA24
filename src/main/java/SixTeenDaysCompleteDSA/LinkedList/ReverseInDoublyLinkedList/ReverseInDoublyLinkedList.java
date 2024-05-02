package SixTeenDaysCompleteDSA.LinkedList.ReverseInDoublyLinkedList;

public class ReverseInDoublyLinkedList {
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

    public static Node reverseDLL(Node  head) {
        if(head==null || head.next==null){
            return head;
        }

        Node prev = null;
        Node pres = head;
        Node next = head.next;
        while(pres!=null){
            pres.next = prev;
            pres.prev = next;
            prev = pres;
            pres = next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }

}
