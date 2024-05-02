package SixTeenDaysCompleteDSA.LinkedList.FlattenTheLinkedList;

public class FlatteningALinkedListRec {
    class Node
    {
        int data;
        Node next;
        Node bottom;

        Node(int d)
        {
            data = d;
            next = null;
            bottom = null;
        }
    }

    Node flatten(Node root) {
        if(root!=null || root.next==null)return root;
        return flatternRec(root);
    }

    private Node flatternRec(Node root) {
        if(root==null || root.next==null){
            return root;
        }
        Node root2 = flatternRec(root.next);

        return mergeFlatten(root,root2);
    }

    private Node mergeFlatten(Node left, Node right) {
        Node node = new Node(-1);
        Node nodeTemp = node;
        while(left!=null && right!=null){
            if(left.data<=right.data){
                nodeTemp.bottom = left;
                nodeTemp = left;
                left = left.bottom;
            }else{
                nodeTemp.bottom = right;
                nodeTemp = right;
                right = right.bottom;
            }
            nodeTemp.next = null;
        }
        if(left!=null){
            nodeTemp.bottom = left;
        }else {
            nodeTemp.bottom = right;
        }
        if(nodeTemp.bottom!=null){
            nodeTemp.bottom.next = null;
        }
        return node.bottom;
    }
}
