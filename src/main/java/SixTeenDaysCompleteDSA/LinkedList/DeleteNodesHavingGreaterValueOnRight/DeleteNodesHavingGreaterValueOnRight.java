package SixTeenDaysCompleteDSA.LinkedList.DeleteNodesHavingGreaterValueOnRight;

public class DeleteNodesHavingGreaterValueOnRight {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    Node compute(Node head) {
        if(head==null || head.next==null)return head;
        head = reverse(head);

        Node node = head;
        int max = node.data;
        while(node.next!=null){
            if(node.next.data<max){
                node.next = node.next.next;
            }else{
                node = node.next;
                max = node.data;
            }
        }
        return reverse(head);
    }

    private Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = head.next;
        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null){
                next = next.next;
            }
        }
        return curr;
    }
}
