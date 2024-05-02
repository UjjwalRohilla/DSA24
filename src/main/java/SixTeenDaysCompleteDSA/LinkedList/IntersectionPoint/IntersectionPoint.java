package SixTeenDaysCompleteDSA.LinkedList.IntersectionPoint;

import SixTeenDaysCompleteDSA.LinkedList.DeletionInCircular.Deletion;

public class IntersectionPoint {
    class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    int intersectPoint(Node head1, Node head2) {
        Node l = head1;
        Node r = head2;
        while(l!=r){

            if(l.next==null && r.next==null){
                return -1;
            }else if(l.next==null){
                l = head2;
                r = r.next;
            } else if(r.next==null){
                r = head1;
                l = l.next;
            }else {
                l = l.next;
                r = r.next;
            }
        }
        return l.data;
    }
}
