package SixTeenDaysCompleteDSA.LinkedList;

import SixTeenDaysCompleteDSA.LinkedList.MargerSort.MergeSort;

public class MergeTwoLL {
    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public int lengthOfTheCycle(ListNode head){
//        ListNode node = head;
        ListNode slow = head;;
        ListNode fast = head;
        int count = 0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = slow.next;
                count++;
                while(slow!=fast){
                    count++;
                    slow = slow.next;
                }
            }
        }
        return count;
    }
    public ListNode detectCycleStarting(ListNode head){
        int length=0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                length = lengthOfTheCycle(slow);
                break;
            }
        }
        if(length==0){
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        while (length>0){
            second = second.next;
            length--;
        }
        while(first!=second){
            first = first.next;
            second = second.next;
        }

        return first;
    }
    public boolean isHappy(int n) {
        if(n==1)return true;

        int slow = n;
        int fast = n;
        do{
            slow = findSqr(slow);
            fast = findSqr(findSqr(fast));
        }while (slow!=fast);

        return slow == 1;
    }
    private int findSqr(int n){
        int sqr = 0;
        while (n>0){
            int temp = n%10;
            sqr+=temp*temp;
            n = n/10;
        }
        return sqr;
    }

    public ListNode findMiddle(ListNode node){
        ListNode slow = node ;
        ListNode fast = node;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)return head;
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current!=null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newLast = current;

        ListNode next = current.next;
        for (int i = 0; current!=null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null){
                next = next.next;
            }
        }
        if(last!=null){
            last.next = prev;
        }else{
            head = prev;
        }
        newLast.next = current;
        return head;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null)return true;
        ListNode mid = findMiddle(head);
        ListNode reverseHead = reverse(mid);
        ListNode reReverseHead = reverseHead;

        while(head!=null && reverseHead!=null){
            if(head.val!=reverseHead.val){
                break;
            }
            head = head.next;
            reverseHead = reverseHead.next;
        }


        reverse(reReverseHead);

        if(head==null || reverseHead==null){
            return true;
        }
        return false;
    }

    private ListNode reverse(ListNode node) {
        if(node.next==null){
            return node;
        }
        ListNode prev = null;
        ListNode pres = node;
        ListNode next = pres.next;
        while (pres!=null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        if(head==null)return;
        ListNode mid = findMiddle(head);
        ListNode hs = reverse(mid);
        ListNode hf = head;

        while(hs!=null && hf!=null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf!=null){
            hf.next = null;
        }
    }


}
