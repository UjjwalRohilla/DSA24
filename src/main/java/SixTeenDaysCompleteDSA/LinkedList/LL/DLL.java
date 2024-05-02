package SixTeenDaysCompleteDSA.LinkedList.LL;

import SixTeenDaysCompleteDSA.LinkedList.CountTripletsInSortedLinkedList.CountTripletsInSortedLinkedList;

public class DLL {
    private Node head;
    private int size;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
        size++;
    }
    public void insertLast(int value){
        if(head==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        Node last = head;
        while (last.next!=null){
            last = last.next;
        }
        node.next = null;
        last.next = node;
        node.prev = last;
        size++;
    }
    public Node find(int num){
        if(head==null)return null;
        Node temp = head;
        while (temp!=null){
            if(temp.value == num){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void insertAfterVal(int after,int value){
        Node temp = find(after);
        Node node = new Node(value);
        node.next = null;
        if(temp == null){
            insertFirst(value);
            return;
        }
        node.next = temp.next;
        if(temp.next!=null){
            temp.next.prev = node;
        }
        node.prev = temp;
        temp.next = node;
        size++;
    }

    public void print(){
        Node node = head;
        while (node!=null){
            System.out.print(node.value +" -> ");
            node = node.next;
        }
        System.out.println("null");
    }
    public void printInReverse(){
        Node node = head;
        while(node!=null && node.next!=null){
            node = node.next;
        }
        while (node!=null){
            System.out.print(node.value+" -> ");
            node = node.prev;
        }
        System.out.println("null");
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    static int countTriplets(Node head, int x){
        if(head==null || head.next==null)return 0;
        Node curr = head;

        Node lastMain = head;
        while(lastMain.next!=null){
            lastMain = lastMain.next;
        }
        int count = 0;


        while(curr!=null){
            Node first = curr.next;
            Node last = lastMain;
            while(first!=null && first!=last){
                int total = curr.value+ first.value+last.value;
                if(total==x){
                    count++;
                    first = first.next;
                    last = last.prev;
                } else if (total < x) {
                    first = first.next;
                }else{
                    last = last.prev;
                }
            }
            curr = curr.next;
        }
        return count;
    }

    public static void main(String[] args){
        DLL list = new DLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(8);
        list.insertLast(9);
        list.print();
        System.out.println();
        System.out.println(countTriplets(list.head, 15));

    }
}
