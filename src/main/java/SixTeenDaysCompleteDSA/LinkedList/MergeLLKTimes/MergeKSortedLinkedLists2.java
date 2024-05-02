package SixTeenDaysCompleteDSA.LinkedList.MergeLLKTimes;

public class MergeKSortedLinkedLists2 {
    class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }
    
    Node mergeKList(Node[] arr, int K) {
        if(arr.length==0)return null;
        Node node = null;
        for (int i = 0; i <arr.length ; i++) {
            node = merge(node,arr[i]);
        }
        return node;
    }

    private Node merge(Node left, Node right) {
        Node node = new Node(-1);
        while(left!=null && right!=null){
            if(left.data<= right.data){
                node.next = left;
                node = node.next;
                left = left.next;
            }else{
                node.next = right;
                node = node.next;
                right = right.next;
            }
        }
        while(left!=null){
            node.next = left;
            node = node.next;
            left = left.next;
        }
        while(right!=null){
            node.next = right;
            node = node.next;
            right = right.next;
        }
        return node.next;
    }
}
