package SixTeenDaysCompleteDSA.LinkedList.AddTwoNumbersRepresentedByLinkedLists;

public class AddTwoNumbersRepresentedByLinkedLists {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node addTwoLists(Node num1, Node num2){
        if(num1==null && num2==null)return null;
//        Node num1l = numToList(num1.data);
//        Node num2l = numToList(num2.data);

        Node reverseNum1L = reverse(num1);
        Node reverseNum2L = reverse(num2);

        Node reReverseNum1L = reverseNum1L;
        Node reReverseNum2L = reverseNum2L;

        int carry = 0;
        Node ans = new Node(-1);
        Node ansTemp = ans;
        while(reverseNum1L!=null && reverseNum2L!=null){
            int total = reverseNum1L.data+reverseNum2L.data+carry;
            int num = total%10;
            carry = total/10;
            ansTemp.next = new Node(num);
            ansTemp = ansTemp.next;

            reverseNum1L = reverseNum1L.next;
            reverseNum2L = reverseNum2L.next;
        }

        while(reverseNum1L!=null){
            int total = reverseNum1L.data+carry;
            int num = total%10;
            carry = total/10;

            ansTemp.next = new Node(num);
            ansTemp = ansTemp.next;

            reverseNum1L = reverseNum1L.next;
        }
        while(reverseNum2L!=null){
            int total = reverseNum2L.data+carry;
            int num = total%10;
            carry = total/10;

            ansTemp.next = new Node(num);
            ansTemp = ansTemp.next;

            reverseNum2L = reverseNum2L.next;
        }
        if(carry>0){
            ansTemp.next = new Node(carry);
        }

        reverse(reReverseNum1L);
        reverse(reReverseNum2L);

        if(ans.next != null){
            ans = ans.next;
            ans = reverse(ans);
            ans = removeZero(ans);
            return ans;
        }

        return null;
    }

    private static Node removeZero(Node node) {
        Node temp = node;
        while(temp!=null && temp.data<1){
            temp = temp.next;
        }
        if(temp==null){
            return new Node(0);
        }
        return temp;
    }

    private static Node reverse(Node node) {
        if(node==null)return null;
        if(node.next==null)return node;

        Node pres = node;
        Node prev = null;
        Node next = pres.next;

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

    private static Node numToList(int data) {
        if(data==0)return null;
        Node node = new Node(-1);
        while(data!=0){
            int num = data%10;
            data = data/10;
            node.next = new Node(num);
            node = node.next;
        }
        if(node.next != null){
            node = node.next;
            return node;
        }
        return null;
    }
}
