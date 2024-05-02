package SixTeenDaysCompleteDSA.LinkedList.LL;

import SixTeenDaysCompleteDSA.LinkedList.MergeTwoLL;
import SixTeenDaysCompleteDSA.LinkedList.RemoveCycle.RemoveCycle;

import java.security.spec.RSAOtherPrimeInfo;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size  = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    private void insertAtIndex(int index,int value){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public void insertAtIndexRec(int index , int value){
        insertRecHelper(head,index,value);
    }

    private Node insertRecHelper(Node node, int index, int value) {
        if(index==0){
            Node newNode = new Node(value);
            newNode.next = node;
            size++;
            return newNode;
        }
        node.next =  insertRecHelper(node.next,index-1,value);
        return node;
    }
    public void deleteDuplicate(){
        if(head==null)return;
        Node node = head;
        while(node.next!=null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public int deleteFirst(){
        if(head==null){
            return -1;
        }
        Node node = head;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return node.value;
    }
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

        Node node = get(size-2);
        int value= tail.value;
        tail = node;
        tail.next = null;
        size--;
        return value;
    }
    public int deleteAtIndex(int index){
        if(size==0)return -1;
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node node = get(index-1);
        int value = node.next.value;
        node.next = node.next.next;
        size--;
        return value;
    }

    public void print(){
        Node node = head;
        while(node !=null){
            System.out.print(node.value+" -> ");
            node = node.next;
        }
        System.out.print("null");
    }



    //bubble sort
    public void bubbleSort(){
        bubbleSortHelper(size-1,0);
    }
    private void bubbleSortHelper(int row,int col){
        if(row==0)return;
        if(col<row){
            Node first = get(col);
            Node second = get(col+1);

            if(first.value>second.value){
                if(first==head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col-1);
                    tail = first;
                    prev.next = second;
                    second.next = first;
                    first.next= null;
                }else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSortHelper(row,col+1);
        }else{
            bubbleSortHelper(row-1,0);
        }
    }

    public void reverse(){
        reverseHelperVoid(head);
    }

    private Node reverseHelper(Node node) {
        if(node == tail){
            head = tail;
            return node;
        }
        Node temp = reverseHelper(node.next);
        temp.next = node;
        tail = node;
        tail.next = null;
        return node;
    }

    private void reverseHelperVoid(Node node) {
        if(node == tail){
            head = tail;
            return;
        }
        reverseHelperVoid(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
        return ;
    }

    public void reverseInPlace(){
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
        head = prev;
    }

    public void moveLastToFirst(){
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

    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.print();
        System.out.println();
        list.moveLastToFirst();
        list.print();

    }

}
