package SixTeenDaysCompleteDSA.LinkedList.CheckPalindrome;

public class CheckPalindrome {
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

    boolean isPalindrome(Node head)
    {
        if(head==null || head.next==null)return false;
//        Node left = head;
        Node mid = findMiddle(head);
        Node reversed = reverse(mid);
        Node reReversed = reversed;
        while(head!=null && reversed!=null){
            if(head.data!=reversed.data){
                break;
            }
            head = head.next;
            reversed = reversed.next;
        }
        reverse(reReversed);
        if(head==null || reversed==null){
            return true;
        }
        return false;
    }

    private Node reverse(Node head) {
        Node pres = head;
        Node prev = null;
        Node next = head.next;
        while(pres!=null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }

    private Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
