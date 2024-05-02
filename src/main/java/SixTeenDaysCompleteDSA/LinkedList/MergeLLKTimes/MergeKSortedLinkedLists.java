package SixTeenDaysCompleteDSA.LinkedList.MergeLLKTimes;

import java.util.Arrays;

public class MergeKSortedLinkedLists {
    class Node {
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
    Node mergeKList(Node[] arr,int K) {
        if(arr.length==0) return null;

        Node ans = new Node(-1);
        Node merging = ans;

        for (int i = 0; i < arr.length; i++) {
            if(arr[0]!=null){
                merging.next = arr[i];
            }
            while(merging.next!=null){
                merging = merging.next;
            }
        }
        if(ans.next==null)return null;

        return mergeSort(ans.next);
    }

    private Node mergeSort(Node head) {
        if(head==null || head.next==null)return head;

        Node mid = findMiddle(head);
        Node left = mergeSort(head);
        Node right = mergeSort(mid);

        return merge(left,right);
    }

    private Node merge(Node left, Node right) {
        if(left==null)return right;
        if(right==null)return left;

        Node node = new Node(-1);
        Node temp = node;
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

        return node.next;
    }

    private Node findMiddle(Node head) {
        if(head==null || head.next==null)return head;
        Node prev = null;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
}
