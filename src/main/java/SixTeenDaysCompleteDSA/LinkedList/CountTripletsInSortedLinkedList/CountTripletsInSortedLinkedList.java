package SixTeenDaysCompleteDSA.LinkedList.CountTripletsInSortedLinkedList;

public class CountTripletsInSortedLinkedList {
    class Node
    {
        int data;
        Node prev, next;
        Node(int val)
        {
            data = val;
            prev = null;
            next = null;
        }
    }

    static int countTriplets(Node head, int x){
        if(head==null || head.next==null)return 0;
        int count = 0;
        Node start,last,curr;
        last = head;
        while(last.next!=null){
            last = last.next;
        }

        for (curr = head; curr!=null; curr = curr.next) {
            start = curr.next;
            count += pairsNode(start,last,x-curr.data);
        }
        return count;
    }

    private static int pairsNode(Node start, Node last, int x){

        int count = 0;
        while(start!=last){
            if(start.data+last.data == x){
                count++;
                start = start.next;
                last = last.prev;
            } else if (start.data+last.data <= x) {
                start = start.next;
            }else {
                last = last.prev;
            }
        }
        return count;
    }
}
