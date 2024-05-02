package SixTeenDaysCompleteDSA.LinkedList.DeletionInCircular;

import SixTeenDaysCompleteDSA.LinkedList.CheckPalindrome.CheckPalindrome;

public class Deletion {
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

    public Node deletionInDeletion(Node head,int key){
        if(head==null)return null;
        Node prev = null;
        Node curr = head;

        while(curr.data!=key){
            if(curr.next==head){
                break;
            }
            prev = curr;
            curr = curr.next;
        }

        if(curr.data==key && curr==head && curr.next==head){
            head=null;
            return head;
        }
        if(curr.data==key && curr==head){
            prev.next = head.next;
            while(prev.next!=head){
                prev = prev.next;
            }
            head = head.next;
            prev.next = head;
            return head;
        } else if (curr.data==key && curr.next==head){
            prev.next = head;
            return head;
        } else{
            if(curr.data==key){
                prev.next = curr.next;
            }
        }

        return head;
    }
}
