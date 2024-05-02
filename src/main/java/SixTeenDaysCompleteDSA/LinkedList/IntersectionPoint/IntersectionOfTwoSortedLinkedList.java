package SixTeenDaysCompleteDSA.LinkedList.IntersectionPoint;

public class IntersectionOfTwoSortedLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }

    public static Node findIntersection(Node head1, Node head2) {
        if(head1==null || head2==null)return null;
        Node common = new Node(-1);
        Node commonTemp = common;
        Node node1 = head1;
        Node node2 = head2;
        while(node1!=null && node2!=null){
            if(node1.data == node2.data){
                commonTemp.next = new Node(node1.data);
                commonTemp = commonTemp.next;
                node1 = node1.next;
                node2 = node2.next;
            } else if (node1.data < node2.data) {
                node1 = node1.next;
            }else {
                node2 = node2.next;
            }
        }
        if(common.next!=null){
            common = common.next;
            return common;
        }
        return null;
    }
}
