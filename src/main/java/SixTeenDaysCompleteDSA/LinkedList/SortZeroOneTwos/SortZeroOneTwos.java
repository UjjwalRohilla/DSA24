package SixTeenDaysCompleteDSA.LinkedList.SortZeroOneTwos;

public class SortZeroOneTwos {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    static Node segregate(Node head) {
        if(head==null && head.next==null)return head;
        Node zeros = new Node(-1);
        Node ones = new Node(-1);
        Node twos = new Node(-1);

        Node zeroHead = zeros;
        Node oneHead = ones;
        Node twoHead = twos;

        Node temp = head;
        while(temp!=null){
            if(temp.data==0){
                zeros.next = new Node(0);
                zeros = zeros.next;
            } else if (temp.data == 1) {
                ones.next = new Node(1);
                ones = ones.next;
            }else {
                twos.next = new Node(2);
                twos = twos.next;
            }
            temp = temp.next;
        }

        if(zeroHead.next !=null) zeroHead = zeroHead.next;
        if (oneHead.next!= null) oneHead = oneHead.next;
        if(twoHead.next!=null) twoHead = twoHead.next;

        if(zeroHead.data!=-1 && oneHead.data!=-1){
            zeros.next = oneHead;
        }
        if(oneHead.data!=-1 && twoHead.data!=-1){
            ones.next = twoHead;
        } else if (oneHead.data == -1 && zeroHead.data!=-1 && twoHead.data!=-1){
            zeros.next = twoHead;
        }

        if(zeroHead.data!=-1)return zeroHead;
        else if (oneHead.data!=-1) return oneHead;
        else return twoHead;
    }
}
