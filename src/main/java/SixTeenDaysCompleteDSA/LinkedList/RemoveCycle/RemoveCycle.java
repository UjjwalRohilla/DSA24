package SixTeenDaysCompleteDSA.LinkedList.RemoveCycle;

import java.util.HashSet;

public class RemoveCycle {
    static class Node
    {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public static void removeLoop(Node head){
        if(head==null || head.next == null)return;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow.next==head){
                slow.next = null;
                break;
            }
            if(slow==fast){
                Node i = head;
                while(i.next != slow.next){
                    i = i.next;
                    slow = slow.next;
                }
                if(i.next == slow.next){
                    slow.next = null;
                    return;
                }
            }
        }
    }

    public static int findFirstNode(Node head){
        if(head==null || head.next ==null)return -1;
        Node slow = head;
        Node fast = head.next;
        boolean flag = false;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow.next == head){
                return head.data;
            }

            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(flag){
            Node temp = head;
            while (temp!=slow){
                temp = temp.next;
                slow = slow.next;
            }
            return slow.data;
        }
        return -1;
    }


    //HashSet Solution
    public Node removeDuplicatesUnsorted(Node head) {
        if(head==null || head.next == null)return head;
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = null;
        while(current!=null){
            if(set.contains(current.data)){
                current = current.next;
            }else{
                set.add(current.data);
                if(prev!=null){
                    prev.next = current;
                }
                prev = current;
                current = current.next;
            }
        }
        prev.next = null;
        return head;
    }

    public Node removeDuplicateUnsortedN2(Node head){
        if(head==null ||head.next==null)return head;
        Node pres = head;

        while(pres!=null){
            Node current = pres.next;
            Node prev = pres;
            while(current!=null){
                if(current.data==pres.data){
                    current = current.next;
                }else{
                    prev.next = current;
                    pres = current;
                    current = current.next;
                }
            }
            prev.next = null;
            pres = pres.next;
        }
        return head;
    }

    public void moveLastToFirst(Node head){
        if(head==null || head.next==null)return;
        Node last = head;
        Node prev = null;
        while(last.next != null){
            prev = last;
            last = last.next;
        }
        last.next = head;
        head = last;
        prev.next = null;
    }

    public static Node addOne(Node head)
    {
        if(head==null)return head;
        Node reverseHead = reverse(head);
        Node temp = reverseHead;
        Node prev = null;
        int carry = 1;
        while(temp!=null){
            int num = temp.data+carry;
            temp.data = num%10;
            carry = num/10;
            prev = temp;
            temp = temp.next;
        }
        if(carry>0){
            Node newNode = new Node(carry);
            prev.next = newNode;
        }
        reverseHead = reverse(reverseHead);
        return reverseHead;
    }

    private static Node reverse(Node head) {
        Node prev = null;
        Node pres = head;
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

    static Node mergeSort(Node head)
    {
        if(head==null || head.next == null)return head;
        Node mid = findMid(head);
        Node left = mergeSort(head);
        Node right = mergeSort(mid);


        return mergeHelper(left,right);
    }

    private static Node mergeHelper(Node left, Node right) {
        Node merged = new Node(-1);
        Node temp = merged;
        while(left!=null && right!=null){
            if(left.data<=right.data){
                temp.next = left;
                temp = temp.next;
                left = left.next;
            }else{
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }
        while(left!=null){
            temp.next = left;
            temp = temp.next;
            left = left.next;
        }
        while (right!=null){
            temp.next = right;
            temp = temp.next;
            right = right.next;
        }
        merged = merged.next;
        return merged;
    }

    static Node findMid(Node node){
        Node slow = node;
        Node fast = node;
        Node prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev!=null){
            prev.next = null;
        }

        return slow;
    }
}
