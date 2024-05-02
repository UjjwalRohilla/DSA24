package SixTeenDaysCompleteDSA.LinkedList.MargerSort;

import SixTeenDaysCompleteDSA.LinkedList.MergeTwoLL;

public class MergeSort {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode merge(ListNode list1,ListNode list2){
        ListNode mergeHead = new ListNode(-1);
        ListNode merged = mergeHead;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                merged.next = list1;
                list1 = list1.next;
                merged = merged.next;
            }else{
                merged.next = list2;
                list2 = list2.next;
                merged = merged.next;
            }
        }
        while(list1!=null){
            merged.next = list1;
            list1 = list1.next;
            merged = merged.next;
        }
        while (list2!=null){
            merged.next = list2;
            list2 = list2.next;
            merged = merged.next;
        }
        mergeHead = mergeHead.next;
        return mergeHead;
    }

    public ListNode findMiddle(ListNode node){
        ListNode slow = node ;
        ListNode fast = node;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = findMiddle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left,right);
    }



}