package Questions.LinkedList;

public class ZeroOneTwos {
    public static void main(String[] args) {

    }
    static Node segregate(Node head)
    {
        Node zeroTemp = new Node(-1);
        Node oneTemp = new Node(-1);
        Node twoTemp = new Node(-1);

        Node zeros = zeroTemp;
        Node ones = oneTemp;
        Node twos = twoTemp;

        Node headIte = head;

        while(headIte != null){
            if(headIte.data == 0){
                zeros.next = new Node(0);
                zeros = zeros.next;
            } else if (headIte.data == 1) {
                ones.next = new Node(1);
                ones = ones.next;
            }else{
                twos.next = new Node(2);
                twos = twos.next;
            }
            headIte = headIte.next;
        }
        if(oneTemp.next != null) oneTemp = oneTemp.next;
        if(twoTemp.next != null) twoTemp = twoTemp.next;
        if(zeroTemp.next != null) zeroTemp = zeroTemp.next;

        if(zeroTemp.data != -1 && oneTemp.data != -1){
            zeros.next = oneTemp;
        }
        if(oneTemp.data != -1 && twoTemp.data != -1){
            ones.next = twoTemp;
        }else if(oneTemp.data == -1 && zeroTemp.data != -1 && twoTemp.data != -1 ) {
            ones.next = twoTemp;
        }
        if(zeroTemp.data != -1){
            return zeroTemp;
        } else if (oneTemp.data != -1) {
            return oneTemp;
        }else {
            return twoTemp;
        }
    }
}
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
