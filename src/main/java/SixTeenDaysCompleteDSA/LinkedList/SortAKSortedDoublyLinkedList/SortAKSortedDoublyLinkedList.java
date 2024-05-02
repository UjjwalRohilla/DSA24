package SixTeenDaysCompleteDSA.LinkedList.SortAKSortedDoublyLinkedList;

public class SortAKSortedDoublyLinkedList {
    class Node
    {
        int data;
        Node next, prev;
        Node(int d)
        {
            data = d;
            next = prev = null;
        }
    }
    public Node sortK(Node head){
        if(head==null || head.next==null)return head;

        Node mid = findmid(head);

        Node left = sortK(head);
        Node right = sortK(mid);

        return merge(left,right);
    }

    private Node merge(Node left, Node right) {
        Node ans = new Node(-1);
        Node temp = ans;

        while (left!=null && right!=null){
            if(left.data<= right.data){
                temp.next = left;
                left = left.next;
            } else{
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        while (left!=null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while (right!=null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return ans.next;
    }

    private Node findmid(Node head) {
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
}
